package enviroment;

import java.rmi.RemoteException;

public interface GamerServices {
	
	void register(Gamer gamer) throws RemoteException, Exception;
	void update(Gamer gamer);
	void delete(Gamer gamer);
	
}