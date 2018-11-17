
package ws.client.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomTypeEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roomTypeEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bookingLineItemEntities" type="{http://ws.session.ejb/}bookingLineItemEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numOfRooms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="roomEntities" type="{http://ws.session.ejb/}roomEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roomRatesEntities" type="{http://ws.session.ejb/}roomRatesEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roomTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="roomTypeSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomTypeEntity", propOrder = {
    "amenities",
    "bed",
    "bookingLineItemEntities",
    "capacity",
    "description",
    "enabled",
    "name",
    "numOfRooms",
    "rank",
    "roomEntities",
    "roomRatesEntities",
    "roomTypeId",
    "roomTypeSize"
})
public class RoomTypeEntity {

    protected String amenities;
    protected int bed;
    @XmlElement(nillable = true)
    protected List<BookingLineItemEntity> bookingLineItemEntities;
    protected int capacity;
    protected String description;
    protected boolean enabled;
    protected String name;
    protected int numOfRooms;
    protected int rank;
    @XmlElement(nillable = true)
    protected List<RoomEntity> roomEntities;
    @XmlElement(nillable = true)
    protected List<RoomRatesEntity> roomRatesEntities;
    protected Long roomTypeId;
    protected String roomTypeSize;

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenities(String value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the bed property.
     * 
     */
    public int getBed() {
        return bed;
    }

    /**
     * Sets the value of the bed property.
     * 
     */
    public void setBed(int value) {
        this.bed = value;
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
     * Gets the value of the capacity property.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the numOfRooms property.
     * 
     */
    public int getNumOfRooms() {
        return numOfRooms;
    }

    /**
     * Sets the value of the numOfRooms property.
     * 
     */
    public void setNumOfRooms(int value) {
        this.numOfRooms = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Gets the value of the roomEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomEntity }
     * 
     * 
     */
    public List<RoomEntity> getRoomEntities() {
        if (roomEntities == null) {
            roomEntities = new ArrayList<RoomEntity>();
        }
        return this.roomEntities;
    }

    /**
     * Gets the value of the roomRatesEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomRatesEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomRatesEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomRatesEntity }
     * 
     * 
     */
    public List<RoomRatesEntity> getRoomRatesEntities() {
        if (roomRatesEntities == null) {
            roomRatesEntities = new ArrayList<RoomRatesEntity>();
        }
        return this.roomRatesEntities;
    }

    /**
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoomTypeId(Long value) {
        this.roomTypeId = value;
    }

    /**
     * Gets the value of the roomTypeSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeSize() {
        return roomTypeSize;
    }

    /**
     * Sets the value of the roomTypeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeSize(String value) {
        this.roomTypeSize = value;
    }

}
