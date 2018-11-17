
package ws.client.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roomEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingLineItemEntity" type="{http://ws.session.ejb/}bookingLineItemEntity" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="roomId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="roomNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="roomTypeEntity" type="{http://ws.session.ejb/}roomTypeEntity" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://ws.session.ejb/}statusEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomEntity", propOrder = {
    "bookingLineItemEntity",
    "enabled",
    "roomId",
    "roomNo",
    "roomTypeEntity",
    "status"
})
public class RoomEntity {

    protected BookingLineItemEntity bookingLineItemEntity;
    protected boolean enabled;
    protected Long roomId;
    protected int roomNo;
    protected RoomTypeEntity roomTypeEntity;
    @XmlSchemaType(name = "string")
    protected StatusEnum status;

    /**
     * Gets the value of the bookingLineItemEntity property.
     * 
     * @return
     *     possible object is
     *     {@link BookingLineItemEntity }
     *     
     */
    public BookingLineItemEntity getBookingLineItemEntity() {
        return bookingLineItemEntity;
    }

    /**
     * Sets the value of the bookingLineItemEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingLineItemEntity }
     *     
     */
    public void setBookingLineItemEntity(BookingLineItemEntity value) {
        this.bookingLineItemEntity = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoomId(Long value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the roomNo property.
     * 
     */
    public int getRoomNo() {
        return roomNo;
    }

    /**
     * Sets the value of the roomNo property.
     * 
     */
    public void setRoomNo(int value) {
        this.roomNo = value;
    }

    /**
     * Gets the value of the roomTypeEntity property.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypeEntity }
     *     
     */
    public RoomTypeEntity getRoomTypeEntity() {
        return roomTypeEntity;
    }

    /**
     * Sets the value of the roomTypeEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypeEntity }
     *     
     */
    public void setRoomTypeEntity(RoomTypeEntity value) {
        this.roomTypeEntity = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnum }
     *     
     */
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnum }
     *     
     */
    public void setStatus(StatusEnum value) {
        this.status = value;
    }

}
