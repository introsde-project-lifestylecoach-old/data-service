
package serviceadaptor.document.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceadaptor.document.ws package. 
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

    private final static QName _GetMotivationPhrase_QNAME = new QName("http://ws.document.serviceadaptor/", "get_motivation_phrase");
    private final static QName _GetMotivationPhraseResponse_QNAME = new QName("http://ws.document.serviceadaptor/", "get_motivation_phraseResponse");
    private final static QName _GetUserFromRemoteResponse_QNAME = new QName("http://ws.document.serviceadaptor/", "get_user_from_remoteResponse");
    private final static QName _SaveUserInRemoteResponse_QNAME = new QName("http://ws.document.serviceadaptor/", "save_user_in_remoteResponse");
    private final static QName _GetUserFromRemote_QNAME = new QName("http://ws.document.serviceadaptor/", "get_user_from_remote");
    private final static QName _SaveUserInRemote_QNAME = new QName("http://ws.document.serviceadaptor/", "save_user_in_remote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceadaptor.document.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveUserInRemoteResponse }
     * 
     */
    public SaveUserInRemoteResponse createSaveUserInRemoteResponse() {
        return new SaveUserInRemoteResponse();
    }

    /**
     * Create an instance of {@link GetUserFromRemote }
     * 
     */
    public GetUserFromRemote createGetUserFromRemote() {
        return new GetUserFromRemote();
    }

    /**
     * Create an instance of {@link SaveUserInRemote }
     * 
     */
    public SaveUserInRemote createSaveUserInRemote() {
        return new SaveUserInRemote();
    }

    /**
     * Create an instance of {@link GetMotivationPhraseResponse }
     * 
     */
    public GetMotivationPhraseResponse createGetMotivationPhraseResponse() {
        return new GetMotivationPhraseResponse();
    }

    /**
     * Create an instance of {@link GetMotivationPhrase }
     * 
     */
    public GetMotivationPhrase createGetMotivationPhrase() {
        return new GetMotivationPhrase();
    }

    /**
     * Create an instance of {@link GetUserFromRemoteResponse }
     * 
     */
    public GetUserFromRemoteResponse createGetUserFromRemoteResponse() {
        return new GetUserFromRemoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMotivationPhrase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.serviceadaptor/", name = "get_motivation_phrase")
    public JAXBElement<GetMotivationPhrase> createGetMotivationPhrase(GetMotivationPhrase value) {
        return new JAXBElement<GetMotivationPhrase>(_GetMotivationPhrase_QNAME, GetMotivationPhrase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMotivationPhraseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.serviceadaptor/", name = "get_motivation_phraseResponse")
    public JAXBElement<GetMotivationPhraseResponse> createGetMotivationPhraseResponse(GetMotivationPhraseResponse value) {
        return new JAXBElement<GetMotivationPhraseResponse>(_GetMotivationPhraseResponse_QNAME, GetMotivationPhraseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserFromRemoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.serviceadaptor/", name = "get_user_from_remoteResponse")
    public JAXBElement<GetUserFromRemoteResponse> createGetUserFromRemoteResponse(GetUserFromRemoteResponse value) {
        return new JAXBElement<GetUserFromRemoteResponse>(_GetUserFromRemoteResponse_QNAME, GetUserFromRemoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUserInRemoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.serviceadaptor/", name = "save_user_in_remoteResponse")
    public JAXBElement<SaveUserInRemoteResponse> createSaveUserInRemoteResponse(SaveUserInRemoteResponse value) {
        return new JAXBElement<SaveUserInRemoteResponse>(_SaveUserInRemoteResponse_QNAME, SaveUserInRemoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserFromRemote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.serviceadaptor/", name = "get_user_from_remote")
    public JAXBElement<GetUserFromRemote> createGetUserFromRemote(GetUserFromRemote value) {
        return new JAXBElement<GetUserFromRemote>(_GetUserFromRemote_QNAME, GetUserFromRemote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUserInRemote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.serviceadaptor/", name = "save_user_in_remote")
    public JAXBElement<SaveUserInRemote> createSaveUserInRemote(SaveUserInRemote value) {
        return new JAXBElement<SaveUserInRemote>(_SaveUserInRemote_QNAME, SaveUserInRemote.class, null, value);
    }

}
