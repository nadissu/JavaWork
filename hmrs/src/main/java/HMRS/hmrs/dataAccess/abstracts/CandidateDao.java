package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import HMRS.hmrs.entities.concretes.Candidate;

@Repository
public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	boolean existsByIdentityNumber(String identityNumber);
	boolean existsByEmailAddress(String emailAddress);
}
