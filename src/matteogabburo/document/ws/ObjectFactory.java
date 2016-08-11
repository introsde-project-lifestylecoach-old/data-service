
package matteogabburo.document.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the matteogabburo.document.ws package. 
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

    private final static QName _GetUserById_QNAME = new QName("http://ws.document.matteogabburo/", "get_user_by_id");
    private final static QName _Health_QNAME = new QName("http://ws.document.matteogabburo/", "health");
    private final static QName _Medic_QNAME = new QName("http://ws.document.matteogabburo/", "medic");
    private final static QName _Cure_QNAME = new QName("http://ws.document.matteogabburo/", "cure");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://ws.document.matteogabburo/", "update_userResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://ws.document.matteogabburo/", "create_userResponse");
    private final static QName _Goal_QNAME = new QName("http://ws.document.matteogabburo/", "goal");
    private final static QName _Activity_QNAME = new QName("http://ws.document.matteogabburo/", "activity");
    private final static QName _UserGoal_QNAME = new QName("http://ws.document.matteogabburo/", "userGoal");
    private final static QName _CreateUser_QNAME = new QName("http://ws.document.matteogabburo/", "create_user");
    private final static QName _UserActivity_QNAME = new QName("http://ws.document.matteogabburo/", "userActivity");
    private final static QName _DeleteUser_QNAME = new QName("http://ws.document.matteogabburo/", "delete_user");
    private final static QName _User_QNAME = new QName("http://ws.document.matteogabburo/", "user");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://ws.document.matteogabburo/", "delete_userResponse");
    private final static QName _GetUserByAuth_QNAME = new QName("http://ws.document.matteogabburo/", "get_user_by_auth");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://ws.document.matteogabburo/", "get_user_by_idResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://ws.document.matteogabburo/", "update_user");
    private final static QName _GetUserByAuthResponse_QNAME = new QName("http://ws.document.matteogabburo/", "get_user_by_authResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: matteogabburo.document.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link UserGoal }
     * 
     */
    public UserGoal createUserGoal() {
        return new UserGoal();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link Health }
     * 
     */
    public Health createHealth() {
        return new Health();
    }

    /**
     * Create an instance of {@link Medic }
     * 
     */
    public Medic createMedic() {
        return new Medic();
    }

    /**
     * Create an instance of {@link Cure }
     * 
     */
    public Cure createCure() {
        return new Cure();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetUserByAuth }
     * 
     */
    public GetUserByAuth createGetUserByAuth() {
        return new GetUserByAuth();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link GetUserByAuthResponse }
     * 
     */
    public GetUserByAuthResponse createGetUserByAuthResponse() {
        return new GetUserByAuthResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link UserActivity }
     * 
     */
    public UserActivity createUserActivity() {
        return new UserActivity();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "get_user_by_id")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Health }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "health")
    public JAXBElement<Health> createHealth(Health value) {
        return new JAXBElement<Health>(_Health_QNAME, Health.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Medic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "medic")
    public JAXBElement<Medic> createMedic(Medic value) {
        return new JAXBElement<Medic>(_Medic_QNAME, Medic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "cure")
    public JAXBElement<Cure> createCure(Cure value) {
        return new JAXBElement<Cure>(_Cure_QNAME, Cure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "update_userResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "create_userResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Goal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "goal")
    public JAXBElement<Goal> createGoal(Goal value) {
        return new JAXBElement<Goal>(_Goal_QNAME, Goal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "userGoal")
    public JAXBElement<UserGoal> createUserGoal(UserGoal value) {
        return new JAXBElement<UserGoal>(_UserGoal_QNAME, UserGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "create_user")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "userActivity")
    public JAXBElement<UserActivity> createUserActivity(UserActivity value) {
        return new JAXBElement<UserActivity>(_UserActivity_QNAME, UserActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "delete_user")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "delete_userResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByAuth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "get_user_by_auth")
    public JAXBElement<GetUserByAuth> createGetUserByAuth(GetUserByAuth value) {
        return new JAXBElement<GetUserByAuth>(_GetUserByAuth_QNAME, GetUserByAuth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "get_user_by_idResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "update_user")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByAuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.matteogabburo/", name = "get_user_by_authResponse")
    public JAXBElement<GetUserByAuthResponse> createGetUserByAuthResponse(GetUserByAuthResponse value) {
        return new JAXBElement<GetUserByAuthResponse>(_GetUserByAuthResponse_QNAME, GetUserByAuthResponse.class, null, value);
    }

}
