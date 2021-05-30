package HMRS.hmrs.adapters;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import HMRS.hmrs.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapter implements CandidateService<Candidate> {

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
	
		
		try {
			KPSPublicSoap kpsPublicSoap=new KPSPublicSoapProxy();
			var result= kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentityNumber()), candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(), candidate.getBirthOfDate().getYear());
			return result;
			
		}  catch (RemoteException e) {
			return false;
		}
			
	}



}
