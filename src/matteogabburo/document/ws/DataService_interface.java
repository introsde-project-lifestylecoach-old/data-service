package matteogabburo.document.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface DataService_interface {

	@WebMethod(operationName="get_user_by_id")
    @WebResult(name = "User")
	String get_user_by_id(Long id);
	
	@WebMethod(operationName="get_user_by_auth")
    @WebResult(name = "User")
	String get_user_by_auth(String mail, String passwd);
	
	@WebMethod(operationName="update_user")
    @WebResult(name = "User")
	String update_user(String user);	
	
	@WebMethod(operationName="delete_user")
    @WebResult(name = "User")
	String delete_user(String user);	
	
	@WebMethod(operationName="create_user")
    @WebResult(name = "User")
	String create_user(String user);	

}
