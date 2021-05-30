package enviroment;

public class GameManager implements GameServices{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+"Oyun Ba�ar�l� b�r �ekilde Eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+"Oyun Silme ��lemi Tamamland�");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+"Oyun Ba�ar�l� G�ncellendi");
		
	}

	@Override
	public void getAll(Game[] games) {
		System.out.println("Sitemizde bulunan oyunlar...");
		for(Game game:games) {
			System.out.println(game.getGameName());
		}

	}
	}
