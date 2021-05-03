package enviroment;

public class SaleManager implements SaleServices{

	@Override
	public void add(Sale sale, Game game, Gamer gamer, Campaign campaign) {
		System.out.println(sale.getSaleid()+"Numaralý Satýþ Ýþlemi"+game.getGameName()+"Ýsmimli Kuallanýcýya"+campaign.getCampaignName()+"Kampanyasýndan faydalanýrak satýlmýþtýr.");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getSaleid()+"'Nolu Satýþ Silme Ýþlem Baþarýlý");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(sale.getSaleid()+"'Nolu Satýþ Güncelleme Ýþlem Baþarýlý");
		
	}

	@Override
	public void getAll(Sale[] sales) {
		System.out.println("Satýþlar için Kayýtlý olan Kredi Kart Numaralarý");
		for (Sale sale : sales) {
			System.out.println(sale.getSaleid()+":" +sale.getCrediCardNo());
			
		}
		
	}

}
