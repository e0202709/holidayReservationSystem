
package ws.client.partner;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingLineItemEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingLineItemEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingEntity" type="{http://ws.session.ejb/}bookingEntity" minOccurs="0"/&gt;
 *         &lt;element name="bookingLineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="roomEntity" type="{http://ws.session.ejb/}roomEntity" minOccurs="0"/&gt;
 *         &lt;element name="roomTypeEntity" type="{http://ws.session.ejb/}roomTypeEntity" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingLineItemEntity", propOrder = {
    "bookingEntity",
    "bookingLineItemId",
    "roomEntity",
    "roomTypeEntity",
    "serialNumber",
    "subTotal"
})
public class BookingLineItemEntity {

    protected BookingEntity bookingEntity;
    protected Long bookingLineItemId;
    protected RoomEntity roomEntity;
    protected RoomTypeEntity roomTypeEntity;
    protected Integer serialNumber;
    protected BigDecimal subTotal;

    /**
     * Gets the value of the bookingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link BookingEntity }
     *     
     */
    public BookingEntity getBookingEntity() {
        return bookingEntity;
    }

    /**
     * Sets the value of the bookingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingEntity }
     *     
     */
    public void setBookingEntity(BookingEntity value) {
        this.bookingEntity = value;
    }

    /**
     * Gets the value of the bookingLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookingLineItemId() {
        return bookingLineItemId;
    }

    /**
     * Sets the value of the bookingLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookingLineItemId(Long value) {
        this.bookingLineItemId = value;
    }

    /**
     * Gets the value of the roomEntity property.
     * 
     * @return
     *     possible object is
     *     {@link RoomEntity }
     *     
     */
    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    /**
     * Sets the value of the roomEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomEntity }
     *     
     */
    public void setRoomEntity(RoomEntity value) {
        this.roomEntity = value;
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
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSerialNumber(Integer value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

}
