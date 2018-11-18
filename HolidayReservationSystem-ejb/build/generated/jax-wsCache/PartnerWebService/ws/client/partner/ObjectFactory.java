
package ws.client.partner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.client.partner package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookingNotFoundException_QNAME = new QName("http://ws.session.ejb/", "BookingNotFoundException");
    private final static QName _CreateNewBookingException_QNAME = new QName("http://ws.session.ejb/", "CreateNewBookingException");
    private final static QName _InvalidLoginCredentialException_QNAME = new QName("http://ws.session.ejb/", "InvalidLoginCredentialException");
    private final static QName _PartnerNotFoundException_QNAME = new QName("http://ws.session.ejb/", "PartnerNotFoundException");
    private final static QName _RoomRateNotFoundException_QNAME = new QName("http://ws.session.ejb/", "RoomRateNotFoundException");
    private final static QName _RoomTypeNotFoundException_QNAME = new QName("http://ws.session.ejb/", "RoomTypeNotFoundException");
    private final static QName _ClientStateRemoteCheckout_QNAME = new QName("http://ws.session.ejb/", "clientStateRemoteCheckout");
    private final static QName _ClientStateRemoteCheckoutResponse_QNAME = new QName("http://ws.session.ejb/", "clientStateRemoteCheckoutResponse");
    private final static QName _PartnerLogin_QNAME = new QName("http://ws.session.ejb/", "partnerLogin");
    private final static QName _PartnerLoginResponse_QNAME = new QName("http://ws.session.ejb/", "partnerLoginResponse");
    private final static QName _Persist_QNAME = new QName("http://ws.session.ejb/", "persist");
    private final static QName _PersistResponse_QNAME = new QName("http://ws.session.ejb/", "persistResponse");
    private final static QName _RetrieveAllPartnerReservationDetails_QNAME = new QName("http://ws.session.ejb/", "retrieveAllPartnerReservationDetails");
    private final static QName _RetrieveAllPartnerReservationDetailsResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveAllPartnerReservationDetailsResponse");
    private final static QName _RetrieveAllRoomTypes_QNAME = new QName("http://ws.session.ejb/", "retrieveAllRoomTypes");
    private final static QName _RetrieveAllRoomTypesResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveAllRoomTypesResponse");
    private final static QName _RetrievePartnerReservationDetails_QNAME = new QName("http://ws.session.ejb/", "retrievePartnerReservationDetails");
    private final static QName _RetrievePartnerReservationDetailsResponse_QNAME = new QName("http://ws.session.ejb/", "retrievePartnerReservationDetailsResponse");
    private final static QName _RetrievePublishedRoomRate_QNAME = new QName("http://ws.session.ejb/", "retrievePublishedRoomRate");
    private final static QName _RetrievePublishedRoomRateResponse_QNAME = new QName("http://ws.session.ejb/", "retrievePublishedRoomRateResponse");
    private final static QName _RetrieveRoomTypeEntityByRoomTypeName_QNAME = new QName("http://ws.session.ejb/", "retrieveRoomTypeEntityByRoomTypeName");
    private final static QName _RetrieveRoomTypeEntityByRoomTypeNameResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveRoomTypeEntityByRoomTypeNameResponse");
    private final static QName _SearchHotelRoom_QNAME = new QName("http://ws.session.ejb/", "searchHotelRoom");
    private final static QName _SearchHotelRoomResponse_QNAME = new QName("http://ws.session.ejb/", "searchHotelRoomResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.client.partner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookingNotFoundException }
     * 
     */
    public BookingNotFoundException createBookingNotFoundException() {
        return new BookingNotFoundException();
    }

    /**
     * Create an instance of {@link CreateNewBookingException }
     * 
     */
    public CreateNewBookingException createCreateNewBookingException() {
        return new CreateNewBookingException();
    }

    /**
     * Create an instance of {@link InvalidLoginCredentialException }
     * 
     */
    public InvalidLoginCredentialException createInvalidLoginCredentialException() {
        return new InvalidLoginCredentialException();
    }

    /**
     * Create an instance of {@link PartnerNotFoundException }
     * 
     */
    public PartnerNotFoundException createPartnerNotFoundException() {
        return new PartnerNotFoundException();
    }

    /**
     * Create an instance of {@link RoomRateNotFoundException }
     * 
     */
    public RoomRateNotFoundException createRoomRateNotFoundException() {
        return new RoomRateNotFoundException();
    }

    /**
     * Create an instance of {@link RoomTypeNotFoundException }
     * 
     */
    public RoomTypeNotFoundException createRoomTypeNotFoundException() {
        return new RoomTypeNotFoundException();
    }

    /**
     * Create an instance of {@link ClientStateRemoteCheckout }
     * 
     */
    public ClientStateRemoteCheckout createClientStateRemoteCheckout() {
        return new ClientStateRemoteCheckout();
    }

    /**
     * Create an instance of {@link ClientStateRemoteCheckoutResponse }
     * 
     */
    public ClientStateRemoteCheckoutResponse createClientStateRemoteCheckoutResponse() {
        return new ClientStateRemoteCheckoutResponse();
    }

    /**
     * Create an instance of {@link PartnerLogin }
     * 
     */
    public PartnerLogin createPartnerLogin() {
        return new PartnerLogin();
    }

    /**
     * Create an instance of {@link PartnerLoginResponse }
     * 
     */
    public PartnerLoginResponse createPartnerLoginResponse() {
        return new PartnerLoginResponse();
    }

    /**
     * Create an instance of {@link Persist }
     * 
     */
    public Persist createPersist() {
        return new Persist();
    }

    /**
     * Create an instance of {@link PersistResponse }
     * 
     */
    public PersistResponse createPersistResponse() {
        return new PersistResponse();
    }

    /**
     * Create an instance of {@link RetrieveAllPartnerReservationDetails }
     * 
     */
    public RetrieveAllPartnerReservationDetails createRetrieveAllPartnerReservationDetails() {
        return new RetrieveAllPartnerReservationDetails();
    }

    /**
     * Create an instance of {@link RetrieveAllPartnerReservationDetailsResponse }
     * 
     */
    public RetrieveAllPartnerReservationDetailsResponse createRetrieveAllPartnerReservationDetailsResponse() {
        return new RetrieveAllPartnerReservationDetailsResponse();
    }

    /**
     * Create an instance of {@link RetrieveAllRoomTypes }
     * 
     */
    public RetrieveAllRoomTypes createRetrieveAllRoomTypes() {
        return new RetrieveAllRoomTypes();
    }

    /**
     * Create an instance of {@link RetrieveAllRoomTypesResponse }
     * 
     */
    public RetrieveAllRoomTypesResponse createRetrieveAllRoomTypesResponse() {
        return new RetrieveAllRoomTypesResponse();
    }

    /**
     * Create an instance of {@link RetrievePartnerReservationDetails }
     * 
     */
    public RetrievePartnerReservationDetails createRetrievePartnerReservationDetails() {
        return new RetrievePartnerReservationDetails();
    }

    /**
     * Create an instance of {@link RetrievePartnerReservationDetailsResponse }
     * 
     */
    public RetrievePartnerReservationDetailsResponse createRetrievePartnerReservationDetailsResponse() {
        return new RetrievePartnerReservationDetailsResponse();
    }

    /**
     * Create an instance of {@link RetrievePublishedRoomRate }
     * 
     */
    public RetrievePublishedRoomRate createRetrievePublishedRoomRate() {
        return new RetrievePublishedRoomRate();
    }

    /**
     * Create an instance of {@link RetrievePublishedRoomRateResponse }
     * 
     */
    public RetrievePublishedRoomRateResponse createRetrievePublishedRoomRateResponse() {
        return new RetrievePublishedRoomRateResponse();
    }

    /**
     * Create an instance of {@link RetrieveRoomTypeEntityByRoomTypeName }
     * 
     */
    public RetrieveRoomTypeEntityByRoomTypeName createRetrieveRoomTypeEntityByRoomTypeName() {
        return new RetrieveRoomTypeEntityByRoomTypeName();
    }

    /**
     * Create an instance of {@link RetrieveRoomTypeEntityByRoomTypeNameResponse }
     * 
     */
    public RetrieveRoomTypeEntityByRoomTypeNameResponse createRetrieveRoomTypeEntityByRoomTypeNameResponse() {
        return new RetrieveRoomTypeEntityByRoomTypeNameResponse();
    }

    /**
     * Create an instance of {@link SearchHotelRoom }
     * 
     */
    public SearchHotelRoom createSearchHotelRoom() {
        return new SearchHotelRoom();
    }

    /**
     * Create an instance of {@link SearchHotelRoomResponse }
     * 
     */
    public SearchHotelRoomResponse createSearchHotelRoomResponse() {
        return new SearchHotelRoomResponse();
    }

    /**
     * Create an instance of {@link PartnerEntity }
     * 
     */
    public PartnerEntity createPartnerEntity() {
        return new PartnerEntity();
    }

    /**
     * Create an instance of {@link BookingEntity }
     * 
     */
    public BookingEntity createBookingEntity() {
        return new BookingEntity();
    }

    /**
     * Create an instance of {@link BookingLineItemEntity }
     * 
     */
    public BookingLineItemEntity createBookingLineItemEntity() {
        return new BookingLineItemEntity();
    }

    /**
     * Create an instance of {@link RoomEntity }
     * 
     */
    public RoomEntity createRoomEntity() {
        return new RoomEntity();
    }

    /**
     * Create an instance of {@link RoomTypeEntity }
     * 
     */
    public RoomTypeEntity createRoomTypeEntity() {
        return new RoomTypeEntity();
    }

    /**
     * Create an instance of {@link RoomRatesEntity }
     * 
     */
    public RoomRatesEntity createRoomRatesEntity() {
        return new RoomRatesEntity();
    }

    /**
     * Create an instance of {@link EmployeeEntity }
     * 
     */
    public EmployeeEntity createEmployeeEntity() {
        return new EmployeeEntity();
    }

    /**
     * Create an instance of {@link GuestEntity }
     * 
     */
    public GuestEntity createGuestEntity() {
        return new GuestEntity();
    }

    /**
     * Create an instance of {@link RemoteCheckoutLineItem }
     * 
     */
    public RemoteCheckoutLineItem createRemoteCheckoutLineItem() {
        return new RemoteCheckoutLineItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "BookingNotFoundException")
    public JAXBElement<BookingNotFoundException> createBookingNotFoundException(BookingNotFoundException value) {
        return new JAXBElement<BookingNotFoundException>(_BookingNotFoundException_QNAME, BookingNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewBookingException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "CreateNewBookingException")
    public JAXBElement<CreateNewBookingException> createCreateNewBookingException(CreateNewBookingException value) {
        return new JAXBElement<CreateNewBookingException>(_CreateNewBookingException_QNAME, CreateNewBookingException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidLoginCredentialException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "InvalidLoginCredentialException")
    public JAXBElement<InvalidLoginCredentialException> createInvalidLoginCredentialException(InvalidLoginCredentialException value) {
        return new JAXBElement<InvalidLoginCredentialException>(_InvalidLoginCredentialException_QNAME, InvalidLoginCredentialException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "PartnerNotFoundException")
    public JAXBElement<PartnerNotFoundException> createPartnerNotFoundException(PartnerNotFoundException value) {
        return new JAXBElement<PartnerNotFoundException>(_PartnerNotFoundException_QNAME, PartnerNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRateNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "RoomRateNotFoundException")
    public JAXBElement<RoomRateNotFoundException> createRoomRateNotFoundException(RoomRateNotFoundException value) {
        return new JAXBElement<RoomRateNotFoundException>(_RoomRateNotFoundException_QNAME, RoomRateNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomTypeNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "RoomTypeNotFoundException")
    public JAXBElement<RoomTypeNotFoundException> createRoomTypeNotFoundException(RoomTypeNotFoundException value) {
        return new JAXBElement<RoomTypeNotFoundException>(_RoomTypeNotFoundException_QNAME, RoomTypeNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientStateRemoteCheckout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "clientStateRemoteCheckout")
    public JAXBElement<ClientStateRemoteCheckout> createClientStateRemoteCheckout(ClientStateRemoteCheckout value) {
        return new JAXBElement<ClientStateRemoteCheckout>(_ClientStateRemoteCheckout_QNAME, ClientStateRemoteCheckout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientStateRemoteCheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "clientStateRemoteCheckoutResponse")
    public JAXBElement<ClientStateRemoteCheckoutResponse> createClientStateRemoteCheckoutResponse(ClientStateRemoteCheckoutResponse value) {
        return new JAXBElement<ClientStateRemoteCheckoutResponse>(_ClientStateRemoteCheckoutResponse_QNAME, ClientStateRemoteCheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "partnerLogin")
    public JAXBElement<PartnerLogin> createPartnerLogin(PartnerLogin value) {
        return new JAXBElement<PartnerLogin>(_PartnerLogin_QNAME, PartnerLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "partnerLoginResponse")
    public JAXBElement<PartnerLoginResponse> createPartnerLoginResponse(PartnerLoginResponse value) {
        return new JAXBElement<PartnerLoginResponse>(_PartnerLoginResponse_QNAME, PartnerLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "persist")
    public JAXBElement<Persist> createPersist(Persist value) {
        return new JAXBElement<Persist>(_Persist_QNAME, Persist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "persistResponse")
    public JAXBElement<PersistResponse> createPersistResponse(PersistResponse value) {
        return new JAXBElement<PersistResponse>(_PersistResponse_QNAME, PersistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAllPartnerReservationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveAllPartnerReservationDetails")
    public JAXBElement<RetrieveAllPartnerReservationDetails> createRetrieveAllPartnerReservationDetails(RetrieveAllPartnerReservationDetails value) {
        return new JAXBElement<RetrieveAllPartnerReservationDetails>(_RetrieveAllPartnerReservationDetails_QNAME, RetrieveAllPartnerReservationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAllPartnerReservationDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveAllPartnerReservationDetailsResponse")
    public JAXBElement<RetrieveAllPartnerReservationDetailsResponse> createRetrieveAllPartnerReservationDetailsResponse(RetrieveAllPartnerReservationDetailsResponse value) {
        return new JAXBElement<RetrieveAllPartnerReservationDetailsResponse>(_RetrieveAllPartnerReservationDetailsResponse_QNAME, RetrieveAllPartnerReservationDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAllRoomTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveAllRoomTypes")
    public JAXBElement<RetrieveAllRoomTypes> createRetrieveAllRoomTypes(RetrieveAllRoomTypes value) {
        return new JAXBElement<RetrieveAllRoomTypes>(_RetrieveAllRoomTypes_QNAME, RetrieveAllRoomTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAllRoomTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveAllRoomTypesResponse")
    public JAXBElement<RetrieveAllRoomTypesResponse> createRetrieveAllRoomTypesResponse(RetrieveAllRoomTypesResponse value) {
        return new JAXBElement<RetrieveAllRoomTypesResponse>(_RetrieveAllRoomTypesResponse_QNAME, RetrieveAllRoomTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePartnerReservationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrievePartnerReservationDetails")
    public JAXBElement<RetrievePartnerReservationDetails> createRetrievePartnerReservationDetails(RetrievePartnerReservationDetails value) {
        return new JAXBElement<RetrievePartnerReservationDetails>(_RetrievePartnerReservationDetails_QNAME, RetrievePartnerReservationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePartnerReservationDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrievePartnerReservationDetailsResponse")
    public JAXBElement<RetrievePartnerReservationDetailsResponse> createRetrievePartnerReservationDetailsResponse(RetrievePartnerReservationDetailsResponse value) {
        return new JAXBElement<RetrievePartnerReservationDetailsResponse>(_RetrievePartnerReservationDetailsResponse_QNAME, RetrievePartnerReservationDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePublishedRoomRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrievePublishedRoomRate")
    public JAXBElement<RetrievePublishedRoomRate> createRetrievePublishedRoomRate(RetrievePublishedRoomRate value) {
        return new JAXBElement<RetrievePublishedRoomRate>(_RetrievePublishedRoomRate_QNAME, RetrievePublishedRoomRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePublishedRoomRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrievePublishedRoomRateResponse")
    public JAXBElement<RetrievePublishedRoomRateResponse> createRetrievePublishedRoomRateResponse(RetrievePublishedRoomRateResponse value) {
        return new JAXBElement<RetrievePublishedRoomRateResponse>(_RetrievePublishedRoomRateResponse_QNAME, RetrievePublishedRoomRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRoomTypeEntityByRoomTypeName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveRoomTypeEntityByRoomTypeName")
    public JAXBElement<RetrieveRoomTypeEntityByRoomTypeName> createRetrieveRoomTypeEntityByRoomTypeName(RetrieveRoomTypeEntityByRoomTypeName value) {
        return new JAXBElement<RetrieveRoomTypeEntityByRoomTypeName>(_RetrieveRoomTypeEntityByRoomTypeName_QNAME, RetrieveRoomTypeEntityByRoomTypeName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRoomTypeEntityByRoomTypeNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveRoomTypeEntityByRoomTypeNameResponse")
    public JAXBElement<RetrieveRoomTypeEntityByRoomTypeNameResponse> createRetrieveRoomTypeEntityByRoomTypeNameResponse(RetrieveRoomTypeEntityByRoomTypeNameResponse value) {
        return new JAXBElement<RetrieveRoomTypeEntityByRoomTypeNameResponse>(_RetrieveRoomTypeEntityByRoomTypeNameResponse_QNAME, RetrieveRoomTypeEntityByRoomTypeNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchHotelRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "searchHotelRoom")
    public JAXBElement<SearchHotelRoom> createSearchHotelRoom(SearchHotelRoom value) {
        return new JAXBElement<SearchHotelRoom>(_SearchHotelRoom_QNAME, SearchHotelRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchHotelRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "searchHotelRoomResponse")
    public JAXBElement<SearchHotelRoomResponse> createSearchHotelRoomResponse(SearchHotelRoomResponse value) {
        return new JAXBElement<SearchHotelRoomResponse>(_SearchHotelRoomResponse_QNAME, SearchHotelRoomResponse.class, null, value);
    }

}
