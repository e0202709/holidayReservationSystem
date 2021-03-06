/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayreservationsystemclient;

import entity.Partner;
import entity.PartnerEntity;
import java.util.Scanner;
import ejb.session.stateless.PartnerControllerRemote;
import entity.Booking;
import entity.RoomType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.exception.RoomTypeNotFoundException;
import ws.client.partner.BookingEntity;
import ws.client.partner.BookingNotFoundException_Exception;
import ws.client.partner.CreateNewBookingException_Exception;
import ws.client.partner.InvalidLoginCredentialException_Exception;
import ws.client.partner.PartnerNotFoundException_Exception;
import ws.client.partner.RemoteCheckoutLineItem;

/**
 *
 * @author Jun Hao
 */
public class PartnerModule {

    private PartnerControllerRemote partnerControllerRemote;

    private Partner currentPartner;
    private List<RoomType> newList;
    private String checkInDate;
    private String checkOutDate;

    public PartnerModule() {
    }

    public PartnerModule(Partner currentPartner, PartnerControllerRemote partnerControllerRemote) {

        this.partnerControllerRemote = partnerControllerRemote;
        this.currentPartner = currentPartner;

    }

    public void menuPartner() throws RoomTypeNotFoundException {

        Scanner scanner = new Scanner(System.in);
        Integer response = 0;

        while (true) {
            System.out.println("\n> > >  HoRS Reservation Client :: Guest  < < <\n");
            System.out.println("1: Reserve Hotel Room");
            System.out.println("2: View My Reservation Details");
            System.out.println("3: View All My Reservations");
            System.out.println("4: Back\n");
            response = 0;

            while (response < 1 || response > 4) {
                System.out.print("> ");

                response = scanner.nextInt();

                if (response == 1) {
                    doReserveHotelRoom();
                } else if (response == 2) {
                    doViewMyReservationDetails();
                } else if (response == 3) {
                    doViewAllMyReservations();
                } else if (response == 4) {
                    break;
                } else {
                    System.out.println("Invalid option, please try again!\n");
                }
            }

            if (response == 4) {
                System.out.println("\nYou have been safely logged out.");
                break;
            }
        }

    }

    private void doReserveHotelRoom() throws RoomTypeNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n> > >  HoRS Reservation Client :: Guest :: Reserve Hotel Room  < < <\n");
        String partnerName = currentPartner.getUsername();
        String partnerPassword = currentPartner.getPassword();
        System.out.println(partnerName);
        System.out.println(partnerPassword);
        System.out.print("Enter username > ");
        String username = sc.nextLine().trim();
        System.out.print("Enter password > ");
        String password = sc.nextLine().trim();
        System.out.println("Enter guest name >");
        String guest = sc.nextLine().trim();
        System.out.print("Would you like to search for available rooms first? (Y/N)> ");
        String yesNo = sc.nextLine().trim();
        if (yesNo.equalsIgnoreCase("Y")) {
            doSearch();
        } else {
            System.out.print("Enter Check-in Date (FORMAT: yyyy-MM-dd)> ");
            String startDate = sc.nextLine().trim();
            System.out.print("Enter the End Date (FORMAT: yyyy-MM-dd)> ");
            String endDate = sc.nextLine().trim();
            checkInDate = startDate;
            checkOutDate = endDate;
        }
        Integer numOfRooms = 0;
        String moreItem = "";
        String confirmReservation = "";
        RoomType roomtype;

        List<RemoteCheckoutLineItem> remoteCheckoutLineItems = new ArrayList<>();
        do {

            RemoteCheckoutLineItem remoteCheckoutLineItem = new RemoteCheckoutLineItem();
            System.out.print("Enter Room Type Name > ");
            String roomTypeName = sc.nextLine().trim();
            int numOfRoomsLeft = partnerControllerRemote.searchForHotelRoom(roomTypeName, checkInDate, checkOutDate);
            if (numOfRoomsLeft == 0) {
                System.out.println(roomTypeName + " room is not available for booking!");
                return;
            } else {
                remoteCheckoutLineItem.setRoomTypeName(roomTypeName);
                remoteCheckoutLineItem.setQuantity(1);
                System.out.print("Enter the number of rooms you would like to book for this room type: " + roomTypeName + "> ");
                numOfRooms = sc.nextInt();

                if (numOfRooms > 0) {
                    while (numOfRooms > 0) {
                        remoteCheckoutLineItems.add(remoteCheckoutLineItem);
                        numOfRooms--;
                    }

                } else {
                    System.out.println("Invalid number of rooms! \n");
                }

                sc.nextLine().trim();

                System.out.print("Would you like to book another type of hotel room? (Enter 'N' to complete checkout)> ");
                moreItem = sc.nextLine().trim();
            }
        } while (!moreItem.equalsIgnoreCase("N"));

        try {
            Long bookingEntityId = clientStateRemoteCheckout(username, password, guest, checkInDate, checkOutDate, remoteCheckoutLineItems);
     

            System.out.println("Remote checkout completed successfully!: Sale Transaction ID: " + bookingEntityId);
        } catch (ws.client.partner.InvalidLoginCredentialException_Exception | CreateNewBookingException_Exception ex) {
            System.out.println("An error has occurred while performing the client state remote checkout: " + ex.getMessage());
        }

    }

    private void doViewMyReservationDetails() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n> > >  HoRS Reservation Client :: View My Reservation Details  < < <\n");
        System.out.print("Enter Booking ID> "); 
        Long bookingId = sc.nextLong();
        sc.nextLine();
     
        try {
            List<String> newList = retrievePartnerReservationDetails(bookingId);
            System.out.printf("%20s%20s%20s\n", "Booking Line No", "Room Type", "SubTotal");
            int count = 1;
            BigDecimal total = new BigDecimal(BigInteger.ZERO);
            for (int i = 0; i < newList.size(); i+=3) {
                System.out.printf("%20s%20s%20s\n", count, newList.get(i+1), NumberFormat.getCurrencyInstance().format(new BigDecimal(newList.get(i+2))));
                total = total.add(new BigDecimal(newList.get(i+2)));
                count++;              
            }
            System.out.println("Total Amount = " + NumberFormat.getCurrencyInstance().format(total));
        } catch (BookingNotFoundException_Exception ex) {
            System.out.println("Booking cannot be found!");
        }
        
        
    }

    private void doViewAllMyReservations() {
         Scanner sc = new Scanner(System.in);
        System.out.println("\n> > >  HoRS Reservation Client :: View All My Reservation Details  < < <\n");
        System.out.print("Enter Partner Name > "); 
        String partnerName = sc.nextLine().trim();
       
        try{
            List<String> newList = retrieveAllPartnerReservationDetails(partnerName);
            System.out.printf("%20s%20s%20s\n", "Booking Line No", "Room Type", "SubTotal");
            int count = 1;
            BigDecimal total = new BigDecimal(BigInteger.ZERO);
            for (int i = 0; i < newList.size(); i+=2) {
                  System.out.printf("%20s%20s%20s\n", count, newList.get(i), NumberFormat.getCurrencyInstance().format(new BigDecimal(newList.get(i+1))));
                total = total.add(new BigDecimal(newList.get(i+1)));
                count++; 
        }
            System.out.println("Total Amount = " + NumberFormat.getCurrencyInstance().format(total));
    }   catch (BookingNotFoundException_Exception ex) {
           System.out.println("Booking cannot be found!");
        } catch (PartnerNotFoundException_Exception ex) {
             System.out.println("Partner cannot be found!");
        }
    }

    private void doSearch() throws RoomTypeNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n> > >  HoRS Reservation Client :: Search Hotel Room  < < <\n");
        System.out.print("Enter Check-in Date (FORMAT: yyyy-MM-dd)> ");
        String startDate = sc.nextLine().trim();
        System.out.print("Enter the End Date (FORMAT: yyyy-MM-dd)> ");
        String endDate = sc.nextLine().trim();
        checkInDate = startDate;
        checkOutDate = endDate;

        System.out.printf("\n%-9s%20s\n", "Room Type", "Availability");

//          partnerControllerRemote.test(startDate, endDate);
        //     partnerControllerRemote.retrieveAndSearch(startDate, endDate);
        newList = partnerControllerRemote.doRetrieveAllRoomTypes();
        for (RoomType roomType : newList) {
            String roomTypeName = roomType.getName();
            int numOfRooms = 0;

            try {
                numOfRooms = partnerControllerRemote.searchForHotelRoom(roomTypeName, startDate, endDate);
            } catch (RoomTypeNotFoundException ex) {
                System.out.print(ex.getMessage());
            }
            if (numOfRooms > 0) {
                System.out.printf("%-9s%20s\n", roomType.getName(), "Rooms Available");
            } else {
                System.out.printf("%-9s%20s\n", roomType.getName(), "Room Not Available");
            }
        }

    }

//    private static BookingEntity clientStateRemoteCheckout(java.lang.String username, java.lang.String password, java.lang.String guestThatWantToBookTheRoom, java.lang.String checkInDate, java.lang.String checkOutDate, java.util.List<ws.client.partner.RemoteCheckoutLineItem> remoteCheckoutLineItems) throws InvalidLoginCredentialException_Exception, CreateNewBookingException_Exception {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        ws.client.partner.PartnerWebService_Service service = new ws.client.partner.PartnerWebService_Service();
//        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
//        return port.clientStateRemoteCheckout(username, password, guestThatWantToBookTheRoom, checkInDate, checkOutDate, remoteCheckoutLineItems);
//    }

//    private static BookingEntity clientStateRemoteCheckout(java.lang.String username, java.lang.String password, java.lang.String guestThatWantToBookTheRoom, java.lang.String checkInDate, java.lang.String checkOutDate, java.util.List<ws.client.partner.RemoteCheckoutLineItem> remoteCheckoutLineItems) throws InvalidLoginCredentialException_Exception, CreateNewBookingException_Exception {
//        ws.client.partner.PartnerWebService_Service service = new ws.client.partner.PartnerWebService_Service();
//        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
//        return port.clientStateRemoteCheckout(username, password, guestThatWantToBookTheRoom, checkInDate, checkOutDate, remoteCheckoutLineItems);
//    }

    private static Long clientStateRemoteCheckout(java.lang.String username, java.lang.String password, java.lang.String guestThatWantToBookTheRoom, java.lang.String checkInDate, java.lang.String checkOutDate, java.util.List<ws.client.partner.RemoteCheckoutLineItem> remoteCheckoutLineItems) throws InvalidLoginCredentialException_Exception, CreateNewBookingException_Exception {
        ws.client.partner.PartnerWebService_Service service = new ws.client.partner.PartnerWebService_Service();
        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
        return port.clientStateRemoteCheckout(username, password, guestThatWantToBookTheRoom, checkInDate, checkOutDate, remoteCheckoutLineItems);
    }

    private static java.util.List<java.lang.String> retrievePartnerReservationDetails(java.lang.Long bookingId) throws BookingNotFoundException_Exception {
        ws.client.partner.PartnerWebService_Service service = new ws.client.partner.PartnerWebService_Service();
        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
        return port.retrievePartnerReservationDetails(bookingId);
    }

    private static java.util.List<java.lang.String> retrieveAllPartnerReservationDetails(java.lang.String partnerName) throws BookingNotFoundException_Exception, PartnerNotFoundException_Exception {
        ws.client.partner.PartnerWebService_Service service = new ws.client.partner.PartnerWebService_Service();
        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
        return port.retrieveAllPartnerReservationDetails(partnerName);
    }

  
    
    
    

}
