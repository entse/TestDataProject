package suite.customer.testcases;

import org.testng.annotations.Test;
import utilities.DataProviders;

import java.util.Hashtable;

public class AddCustomerTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "bankManagerDP")
    public void addCustomerTest(Hashtable<String, String> data){

    }

}


