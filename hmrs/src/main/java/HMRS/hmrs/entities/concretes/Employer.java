package HMRS.hmrs.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import HMRS.hmrs.entities.abstracts.User;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id")
public class Employer extends User {

	private static final long serialVersionUID = 1L;

	@Column(name = "company_name", nullable = false, unique = true)
    private String companyName;

    @Column(name = "web_address", nullable = false, unique = true)
    private String webAddress;
    
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
