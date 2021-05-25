package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import HMRS.hmrs.entities.concretes.Candidate;

@Repository
public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	boolean existsCandidateByIdentityNumber(String identityNumber);
	boolean existsCandidateByEmailAddress(String emailAddress);
}
