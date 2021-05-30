package HMRS.hmrs.core.adapters.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import HMRS.hmrs.core.adapters.abstracts.MernisServiceAdapter;
import HMRS.hmrs.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisAdapter implements MernisServiceAdapter{

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		KPSPublicSoap client=new KPSPublicSoapProxy();
        boolean result=false;
        try {
            result=client.TCKimlikNoDogrula(
                        Long.valueOf(candidate.getIdentityNumber()), 
                        candidate.getFirstName().toUpperCase(), 
                        candidate.getLastName().toUpperCase(), 
                        candidate.getBirthOfDate().getYear());
        }  catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;
	}

}
