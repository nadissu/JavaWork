package HMRS.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_titles")
public class JobTitle {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@GeneratedValue
	@Column(name="title")
	private String title;
	

}
