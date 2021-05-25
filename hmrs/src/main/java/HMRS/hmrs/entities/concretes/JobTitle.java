package HMRS.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_titles")
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@GeneratedValue
	@Column(name="title")
	private String title;
	

}
