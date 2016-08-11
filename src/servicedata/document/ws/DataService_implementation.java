package matteogabburo.document.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "matteogabburo.document.ws.DataService_interface", serviceName="data-service")
public class DataService_implementation implements DataService_interface {

	@Override
	public String get_user_by_id(Long id) {
		
		//se non è nel db locale scarica dal db externo TODO
		return null;
	}

	@Override
	public String get_user_by_auth(String mail, String passwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update_user(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete_user(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String create_user(String user) {
		// TODO Auto-generated method stub
		return null;
	}	

}
