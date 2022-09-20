
public class StoreDataService {
	private StoreData storedata = new MySqlStoreData();
	
	public void insertRecord(Product p) {
		storedata.insertRecord(p);
		
	}

}
