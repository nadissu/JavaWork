package enviroment;

public class Game implements EntityBase{
	private int gameid;
	private String gameName;
	private double price;
	private double afterDiscountPrice;
	public Game() {
		
	}
	public Game(int gameid, String gameName, double price,double afterDiscountPrice) {
		super();
		this.gameid = gameid;
		this.gameName = gameName;
		this.price = price;
		this.afterDiscountPrice=afterDiscountPrice;
	}
	public int getGamesid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	public void setafterDiscountPrice(double afterDiscountPrice) {
		this.afterDiscountPrice = afterDiscountPrice;
	}
	public double getafterDiscountPrice() {
		return afterDiscountPrice;
	}
	

}
