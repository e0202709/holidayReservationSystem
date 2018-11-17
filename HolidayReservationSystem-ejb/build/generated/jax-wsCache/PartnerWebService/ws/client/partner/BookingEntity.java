
package ws.client.partner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="bookingLineItemEntities" type="{http://ws.session.ejb/}bookingLineItemEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="checkinDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkoutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeEntity" type="{http://ws.session.ejb/}employeeEntity" minOccurs="0"/&gt;
 *         &lt;element name="guest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guestEntity" type="{http://ws.session.ejb/}guestEntity" minOccurs="0"/&gt;
 *         &lt;element name="partnerEntity" type="{http://ws.session.ejb/}partnerEntity" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalLineItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="totalNumOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingEntity", propOrder = {
    "bookingId",
    "bookingLineItemEntities",
    "checkinDate",
    "checkoutDate",
    "employeeEntity",
    "guest",
    "guestEntity",
    "partnerEntity",
    "totalAmount",
    "totalLineItem",
    "totalNumOfRooms"
})
public class BookingEntity {

    protected Long bookingId;
    @XmlElement(nillable = true)
    protected List<BookingLineItemEntity> bookingLineItemEntities;
    protected String checkinDate;
    protected String checkoutDate;
    protected EmployeeEntity employeeEntity;
    protected String guest;
    protected GuestEntity guestEntity;
    protected PartnerEntity partnerEntity;
    protected BigDecimal totalAmount;
    protected Integer totalLineItem;
    protected Integer totalNumOfRooms;

    /**
     * Gets the value of the bookingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookingId(Long value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the bookingLineItemEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingLineItemEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingLineItemEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingLineItemEntity }
     * 
     * 
     */
    public List<BookingLineItemEntity> getBookingLineItemEntities() {
        if (bookingLineItemEntities == null) {
            bookingLineItemEntities = new ArrayList<BookingLineItemEntity>();
        }
        return this.bookingLineItemEntities;
    }

    /**
     * Gets the value of the checkinDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinDate() {
        return checkinDate;
    }

    /**
     * Sets the value of the checkinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinDate(String value) {
        this.checkinDate = value;
    }

    /**
     * Gets the value of the checkoutDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutDate() {
        return checkoutDate;
    }

    /**
     * Sets the value of the checkoutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutDate(String value) {
        this.checkoutDate = value;
    }

    /**
     * Gets the value of the employeeEntity property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeEntity }
     *     
     */
    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    /**
     * Sets the value of the employeeEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeEntity }
     *     
     */
    public void setEmployeeEntity(EmployeeEntity value) {
        this.employeeEntity = value;
    }

    /**
     * Gets the value of the guest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuest() {
        return guest;
    }

    /**
     * Sets the value of the guest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuest(String value) {
        this.guest = value;
    }

    /**
     * Gets the value of the guestEntity property.
     * 
     * @return
     *     possible object is
     *     {@link GuestEntity }
     *     
     */
    public GuestEntity getGuestEntity() {
        return guestEntity;
    }

    /**
     * Sets the value of the guestEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestEntity }
     *     
     */
    public void setGuestEntity(GuestEntity value) {
        this.guestEntity = value;
    }

    /**
     * Gets the value of the partnerEntity property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerEntity }
     *     
     */
    public PartnerEntity getPartnerEntity() {
        return partnerEntity;
    }

    /**
     * Sets the value of the partnerEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerEntity }
     *     
     */
    public void setPartnerEntity(PartnerEntity value) {
        this.partnerEntity = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLineItem() {
        return totalLineItem;
    }

    /**
     * Sets the value of the totalLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLineItem(Integer value) {
        this.totalLineItem = value;
    }

    /**
     * Gets the value of the totalNumOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumOfRooms() {
        return totalNumOfRooms;
    }

    /**
     * Sets the value of the totalNumOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumOfRooms(Integer value) {
        this.totalNumOfRooms = value;
    }

}
