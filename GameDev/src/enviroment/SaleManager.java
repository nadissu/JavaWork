package enviroment;

public class SaleManager implements SaleServices{

	@Override
	public void add(Sale sale, Game game, Gamer gamer, Campaign campaign) {
		System.out.println(sale.getSaleid()+"Numaral� Sat�� ��lemi"+game.getGameName()+"�smimli Kuallan�c�ya"+campaign.getCampaignName()+"Kampanyas�ndan faydalan�rak sat�lm��t�r.");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getSaleid()+"'Nolu Sat�� Silme ��lem Ba�ar�l�");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(sale.getSaleid()+"'Nolu Sat�� G�ncelleme ��lem Ba�ar�l�");
		
	}

	@Override
	public void getAll(Sale[] sales) {
		System.out.println("Sat��lar i�in Kay�tl� olan Kredi Kart Numaralar�");
		for (Sale sale : sales) {
			System.out.println(sale.getSaleid()+":" +sale.getCrediCardNo());
			
		}
		
	}

}
