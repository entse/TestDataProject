package suite.customer.testcases;

import org.testng.annotations.Test;
import utilities.DataProviders;

import java.util.Hashtable;

public class OpenAccountTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "bankManagerDP")
    public void openAccountTest(Hashtable<String, String> data){

    }




}
