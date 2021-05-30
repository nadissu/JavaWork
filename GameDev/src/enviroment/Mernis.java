package enviroment;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Mernis  implements AuthorServices {

	@Override
	public boolean validate(Gamer gamer) throws RemoteException {
		KPSPublicSoap kpsPublicSoap= new KPSPublicSoapProxy();
		return kpsPublicSoap.TCKimlikNoDogrula(gamer.getNationalIdentity(), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthday());
	}
	

}
