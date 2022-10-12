
public class StoreDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StoreData sd1 ;
//		sd1 = new MySqlStoreData();
//		sd1.insertRecord(new Product(101, "asdsad", 123));
//		
//		sd1 = new MonoDBStoreData();
//		sd1.insertRecord((new Product(101, "asdsad", 123)));
//		
//		sd1 =new PdfStoreData();
//		sd1.insertRecord((new Product(101, "asdsad", 123)));
		
		StoreDataService sds = new StoreDataService();
		sds.insertRecord(new Product(101, "asdsad", 123));
	

	}

}
