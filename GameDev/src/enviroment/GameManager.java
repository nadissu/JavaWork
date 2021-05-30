package enviroment;

public class GameManager implements GameServices{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+"Oyun Baþarýlý bÝr Þekilde Eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+"Oyun Silme Ýþlemi Tamamlandý");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+"Oyun Baþarýlý Güncellendi");
		
	}

	@Override
	public void getAll(Game[] games) {
		System.out.println("Sitemizde bulunan oyunlar...");
		for(Game game:games) {
			System.out.println(game.getGameName());
		}

	}
	}
