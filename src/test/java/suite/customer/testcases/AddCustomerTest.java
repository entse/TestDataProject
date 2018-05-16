package suite.customer.testcases;

import org.testng.annotations.Test;
import utilities.Constans;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;

import java.util.Hashtable;

public class AddCustomerTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "customerDP")
    public void addCustomerTest(Hashtable<String, String> data){


        ExcelReader excel = new ExcelReader(Constans.SUITE2_XL_PATH);
        DataUtil.checkExecution("CustomerSuite", "AddCustomerTest", data.get("Runmode"), excel);
    }

}


