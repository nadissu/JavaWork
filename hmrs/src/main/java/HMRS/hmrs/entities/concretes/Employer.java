package HMRS.hmrs.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import HMRS.hmrs.entities.abstracts.User;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
public class Employer extends User {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "company_name", nullable = false, unique = true)
    private String companyName;

    @Column(name = "web_address", nullable = false, unique = true)
    private String webAddress;
    
    @OneToMany(mappedBy="employer",fetch = FetchType.LAZY)
	private List<JobAdvertisement> jobAdvertisements;
    
    public Employer(int id, String emailAddress, String password, String companyName, String webAddress) {
    	super(id, emailAddress, password);
    	this.companyName = companyName;
    	this.webAddress = webAddress;
    }
    
    public Employer(String emailAddress, String password, String companyName, String webAddress) {
    	super(emailAddress, password);
    	this.companyName = companyName;
    	this.webAddress = webAddress;
    }

}
