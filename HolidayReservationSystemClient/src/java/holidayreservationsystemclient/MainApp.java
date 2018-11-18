/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayreservationsystemclient;

import entity.Partner;

import java.util.Scanner;
import util.exception.InvalidLoginCredentialException;
import ejb.session.stateless.PartnerControllerRemote;
import entity.RoomType;
import java.util.List;
import util.exception.RoomTypeNotFoundException;

/**
 *
 * @author Jun Hao
 */
class MainApp {

    private PartnerControllerRemote partnerControllerRemote;

    private PartnerModule partnerModule;

    private Partner currentPartner;
    private List<RoomType> newList;

    private String checkInDate;
    private String checkOutDate;

    public MainApp() {
    }

    public MainApp(PartnerControllerRemote partnerControllerRemote) {
        this();
        this.partnerControllerRemote = partnerControllerRemote;

    }

    public void runApp() throws RoomTypeNotFoundException {

        Scanner scanner = new Scanner(System.in);
        Integer response = 0;

        while (true) {
            System.out.println("\n> > >  Welcome to Merlion Hotel-Reservation-System - Partner terminal < < <\n");
            System.out.println("1: Partner Login");
            System.out.println("2: Search For Room");
            System.out.println("3: Exit\n");
            response = 0;

            while (response < 1 || response > 3) {
                System.out.print("> ");

                response = scanner.nextInt();

                if (response == 1) {
                    try {
                        doLogin();
                        System.out.println("\nLogin successful!\n");
                        partnerModule = new PartnerModule(currentPartner, partnerControllerRemote);
                        partnerModule.menuPartner();
                    } catch (InvalidLoginCredentialException ex) {
                        System.out.println("\nInvalid login credential: " + ex.getMessage() + "\n");
                    }
                } else if (response == 2) {
                    doSearch();
                } else if (response == 3) {
                    break;

                } else {
                    System.out.println("\nInvalid option, please try again!\n");
                }
            }
            if (response == 3) {
                break;
            }
        }

    }

    private void doLogin() throws InvalidLoginCredentialException {

        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";

        System.out.println("\n> > >  HoRS Reservation Client :: Login  < < <\n");
        System.out.print("Enter username> ");
        username = scanner.nextLine().trim();
        System.out.print("Enter password> ");
        password = scanner.nextLine().trim();

        System.out.println("check if run");

        if (username.length() > 0 && password.length() > 0) {
            System.out.println(username);
            currentPartner = partnerControllerRemote.holidayLogin(username, password);
            System.out.println("yay");

        } else {
            throw new InvalidLoginCredentialException("\nMissing login credential!");
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
    
    
}
