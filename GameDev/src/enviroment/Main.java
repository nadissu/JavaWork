package enviroment;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws Exception {
		Gamer gamer=new Gamer();
		gamer.setId(1);
		gamer.setNationalIdentity(20786013636L);
		gamer.setFirstName("Nadide Sultan");
		gamer.setLastName("Sığırtmaç");
		gamer.setBirthday(1997);
		
	
		
		GamerManager gamerManager=new GamerManager(new Mernis());
		gamerManager.register(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		System.out.println("--------------------------------------------");
		
		
		Game game=new Game();
		game.setGameid(1);
		game.setGameName("Gta V");
		game.setPrice(500);
		game.setafterDiscountPrice(0);
		
		
		Game[] games= {game};
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.getAll(games);
		
		System.out.println("--------------------------------------------");
		
		Campaign campaign=new Campaign();
		campaign.setCampaignid(1);
		campaign.setCampaignName("Bir alana bir bedava kampanyası");
		campaign.setDiscount(10.20);
		
		Campaign[] campaigns= {campaign};
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.getAll(campaigns);
		
		System.out.println("--------------------------------------------");
		
		Sale sale=new Sale();
		sale.setSaleid(1);
		sale.setCrediCardNo(1236548795);
		Sale[] saleses= {sale};
		
		SaleManager saleManager=new SaleManager();
		
		saleManager.getAll(saleses);
	}

}
