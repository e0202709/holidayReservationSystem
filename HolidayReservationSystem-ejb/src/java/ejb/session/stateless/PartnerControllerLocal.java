/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.Partner;
import entity.RoomType;
import java.util.List;
import javax.ejb.Local;
import util.exception.InvalidLoginCredentialException;
import util.exception.RoomTypeNotFoundException;

/**
 *
 * @author Asus
 */
@Local
public interface PartnerControllerLocal {

    public Partner holidayLogin(String username, String password) throws InvalidLoginCredentialException;

    public int searchForHotelRoom(String roomTypeName, String startDate, String endDate) throws RoomTypeNotFoundException;

    public List<RoomType> doRetrieveAllRoomTypes();

    public void retrieveAndSearch(String startDate, String endDate) throws RoomTypeNotFoundException;

    public RoomType retrieveRoomTypeByRoomTypeName (String username, String password, String roomTypeName) throws RoomTypeNotFoundException;
    
}
