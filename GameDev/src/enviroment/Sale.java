package enviroment;

public class Sale implements EntityBase{
	
	private int saleid;
	private int crediCardNo;
	
public Sale() {
	
}

public Sale(int saleid, int crediCardNo) {
	super();
	this.saleid = saleid;
	this.crediCardNo = crediCardNo;
}

public int getSaleid() {
	return saleid;
}

public void setSaleid(int saleid) {
	this.saleid = saleid;
}

public int getCrediCardNo() {
	return crediCardNo;
}

public void setCrediCardNo(int crediCardNo) {
	this.crediCardNo = crediCardNo;
}

	

}
