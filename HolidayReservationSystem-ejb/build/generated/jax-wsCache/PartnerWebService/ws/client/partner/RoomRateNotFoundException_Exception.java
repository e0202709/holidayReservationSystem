
package ws.client.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RoomRateNotFoundException", targetNamespace = "http://ws.session.ejb/")
public class RoomRateNotFoundException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RoomRateNotFoundException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RoomRateNotFoundException_Exception(String message, RoomRateNotFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RoomRateNotFoundException_Exception(String message, RoomRateNotFoundException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ws.client.partner.RoomRateNotFoundException
     */
    public RoomRateNotFoundException getFaultInfo() {
        return faultInfo;
    }

}
