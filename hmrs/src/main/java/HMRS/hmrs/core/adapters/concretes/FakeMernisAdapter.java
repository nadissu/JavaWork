package HMRS.hmrs.core.adapters.concretes;

import org.springframework.stereotype.Component;

import HMRS.hmrs.core.adapters.abstracts.MernisServiceAdapter;
import HMRS.hmrs.entities.concretes.Candidate;

@Component
public class FakeMernisAdapter implements MernisServiceAdapter {

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		
		return true;
	}

}