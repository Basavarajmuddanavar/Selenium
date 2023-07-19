package Testngs;
import org.testng.annotations.DataProvider;
public class dataprov {
	@DataProvider(name="Basu") 
	public static String[][] Getdata()
	{
		String [][] arr= {{"basava@gmail.com","12345678", "Laptop"}};
		return arr;
	}

}
