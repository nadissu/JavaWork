package HMRS.hmrs.core.adapters.abstracts;

import HMRS.hmrs.entities.concretes.Candidate;

public interface MernisServiceAdapter {
	boolean checkIfRealPerson(Candidate candidate);
}
