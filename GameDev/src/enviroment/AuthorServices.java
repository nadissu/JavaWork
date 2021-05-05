package enviroment;

import java.rmi.RemoteException;

public interface AuthorServices {
	boolean validate(Gamer gamer) throws RemoteException;
	
//	boolean verify(String nationaIdentity,String firstName,String lastName,String birthday);

}
