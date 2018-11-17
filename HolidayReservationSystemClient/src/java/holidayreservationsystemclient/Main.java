/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayreservationsystemclient;

import javax.ejb.EJB;
import ejb.session.stateless.PartnerControllerRemote;
import util.exception.RoomTypeNotFoundException;

/**
 *
 * @author Asus
 */
public class Main {

    @EJB
    private static PartnerControllerRemote partnerControllerRemote;

    /**
     * @param args the command line arguments
     * @throws util.exception.RoomTypeNotFoundException
     */
    public static void main(String[] args) throws RoomTypeNotFoundException {
     MainApp mainApp = new MainApp(partnerControllerRemote);
        mainApp.runApp();
        
    
    }
    
    
}
