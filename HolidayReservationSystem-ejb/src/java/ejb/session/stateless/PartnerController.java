/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.Booking;
import entity.Partner;
import entity.RoomType;
//import entity.RoomTypeEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import util.exception.CreateNewBookingException;
import util.exception.InvalidLoginCredentialException;
import util.exception.RoomTypeNotFoundException;
import ws.client.partner.BookingEntity;
import ws.client.partner.CreateNewBookingException_Exception;
import ws.client.partner.InvalidLoginCredentialException_Exception;
import ws.client.partner.PartnerEntity;
//import ws.client.partner.RoomTypeEntity;
import ws.client.partner.PartnerWebService_Service;
import ws.client.partner.RemoteCheckoutLineItem;
import ws.client.partner.RoomTypeEntity;
import ws.client.partner.RoomTypeNotFoundException_Exception;

/**
 *
 * @author Asus
 */
@Stateless
public class PartnerController implements PartnerControllerRemote, PartnerControllerLocal {

    @WebServiceRef(wsdlLocation = "http://localhost:8080/PartnerWebService/PartnerWebService?wsdl")
    private PartnerWebService_Service service;

    @Override
    public Partner holidayLogin(String username, String password) throws InvalidLoginCredentialException {
        PartnerEntity a = new PartnerEntity();

        try {
            a = partnerLogin(username, password);
            Partner partner = new Partner();
            partner.setUsername(a.getUserName());
            partner.setPassword(a.getPassword());
            return partner;
        } catch (InvalidLoginCredentialException_Exception ex) {
            throw new InvalidLoginCredentialException("Invalid Login Credential Exception!");
            // Logger.getLogger(PartnerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void retrieveAndSearch(String startDate, String endDate) throws RoomTypeNotFoundException {
        System.out.println("TEST");
        List<RoomTypeEntity> rt = retrieveAllRoomTypes();
        List<RoomType> roomtypes = new ArrayList<>();
        System.out.println("HI");
        for (RoomTypeEntity roomType : rt) {
            System.out.println("VERA");
            String roomTypeName = roomType.getName();
            System.out.println("PAM");
            RoomType rte = new RoomType();
            System.out.println("KAI");
            rte.setName(roomTypeName);
            System.out.println("HUI");
            roomtypes.add(rte);

            int num = searchForHotelRoom(roomTypeName, startDate, endDate);
            if (num > 0) {
                System.out.printf("%-9s%20s\n", roomTypeName, "Rooms Available");

            } else {
                System.out.printf("%-9s%20s\n", roomTypeName, "Rooms Not Available");
            }

        }
        //throw new RoomTypeNotFoundException("Room Type Not Found!!"); 
    }

    @Override
    public List<RoomType> doRetrieveAllRoomTypes() {

        List<RoomTypeEntity> rt = retrieveAllRoomTypes();
        List<RoomType> roomtypes = new ArrayList<>();
        for (RoomTypeEntity roomType : rt) {
            String roomTypeName = roomType.getName();
            RoomType rte = new RoomType();
            rte.setName(roomTypeName);
            roomtypes.add(rte);

            //   searchForHotelRoom(roomTypeName, startDate, endDate);
        }

        return roomtypes;
//        List<RoomTypeEntity> rt = new ArrayList<>();
        // rt = retrieveAllRoomTypes();
    }

    @Override
    public int searchForHotelRoom(String roomTypeName, String startDate, String endDate) throws RoomTypeNotFoundException {

        int numOfRooms = 0;
        try {
            numOfRooms = searchHotelRoom(roomTypeName, startDate, endDate);
            return numOfRooms;
        } catch (RoomTypeNotFoundException_Exception ex) {
            //Logger.getLogger(PartnerController.class.getName()).log(Level.SEVERE, null, ex);
            throw new RoomTypeNotFoundException("Room Type Not Found!!");
        }

    }

    @Override
    public RoomType retrieveRoomTypeByRoomTypeName(String username, String password, String roomTypeName) throws RoomTypeNotFoundException {
        System.out.println("test");
        try {
            System.out.println("entered try");
            RoomTypeEntity r = retrieveRoomTypeEntityByRoomTypeName(username, password, roomTypeName);
            
            if (r == null ) {
                System.out.println("null");
            } else {
                System.out.println("not null");
            }
            
            RoomType roomType = new RoomType();
            roomType.setName(r.getName());
            return roomType;
        } catch (InvalidLoginCredentialException_Exception ex) {
            //Logger.getLogger(PartnerController.class.getName()).log(Level.SEVERE, null, ex);

        } catch (RoomTypeNotFoundException_Exception ex) {
            //Logger.getLogger(PartnerController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        throw new RoomTypeNotFoundException("Room Type Not Found!!");
    }

    
//    public Booking doClientCheckout (String username, String password, String guest, String checkInDate, String checkOutDate, List<RemoteCheckoutLineItem> remoteCheckoutLineItems) throws CreateNewBookingException   {
//        try {
//            BookingEntity be = clientStateRemoteCheckout(username, password, guest, checkInDate, checkOutDate, remoteCheckoutLineItems);     
//            //return BookingEntity;
//        } catch (InvalidLoginCredentialException_Exception ex) {
//           // Logger.getLogger(PartnerController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (CreateNewBookingException_Exception ex) {
//           // Logger.getLogger(PartnerController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        throw new CreateNewBookingException ("Booking cannot be created!!");
//    }
    private PartnerEntity partnerLogin(java.lang.String username, java.lang.String password) throws InvalidLoginCredentialException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
        return port.partnerLogin(username, password);
    }

    private int searchHotelRoom(java.lang.String roomTypeName, java.lang.String startDate, java.lang.String endDate) throws RoomTypeNotFoundException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
        return port.searchHotelRoom(roomTypeName, startDate, endDate);
    }

    private java.util.List<ws.client.partner.RoomTypeEntity> retrieveAllRoomTypes() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
        return port.retrieveAllRoomTypes();
    }

    private RoomTypeEntity retrieveRoomTypeEntityByRoomTypeName(java.lang.String username, java.lang.String password, java.lang.String roomTypeName) throws InvalidLoginCredentialException_Exception, RoomTypeNotFoundException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
        return port.retrieveRoomTypeEntityByRoomTypeName(username, password, roomTypeName);
    }

//    private BookingEntity clientStateRemoteCheckout(java.lang.String username, java.lang.String password, java.lang.String guestThatWantToBookTheRoom, java.lang.String checkInDate, java.lang.String checkOutDate, java.util.List<ws.client.partner.RemoteCheckoutLineItem> remoteCheckoutLineItems) throws InvalidLoginCredentialException_Exception, CreateNewBookingException_Exception {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        ws.client.partner.PartnerWebService port = service.getPartnerWebServicePort();
//        return port.clientStateRemoteCheckout(username, password, guestThatWantToBookTheRoom, checkInDate, checkOutDate, remoteCheckoutLineItems);
//    }

    
}
