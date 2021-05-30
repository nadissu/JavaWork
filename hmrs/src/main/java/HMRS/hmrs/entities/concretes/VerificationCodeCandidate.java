package HMRS.hmrs.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import HMRS.hmrs.entities.abstracts.VerificationCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@EqualsAndHashCode(callSuper = true)
@Table(name = "verification_codes_candidates")
public class VerificationCodeCandidate extends VerificationCode {

	private static final long serialVersionUID = 1L;
	
	private int candidate_id;		// Candidate id eklenecek.
}
