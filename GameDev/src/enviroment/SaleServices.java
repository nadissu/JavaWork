package enviroment;

public interface SaleServices {
	void add(Sale sales,Game game,Gamer gamer,Campaign campaign);
	void delete(Sale sales);
	void update(Sale sales);
	void getAll(Sale[] sales);

}
