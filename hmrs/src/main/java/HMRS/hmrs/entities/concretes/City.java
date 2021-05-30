package HMRS.hmrs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cities")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
public class City {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy="city",fetch = FetchType.LAZY)
	private List<JobAdvertisement> jobAdvertisements;

}
