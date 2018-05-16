package suite.bankmanager.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Constans;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;

import java.util.Hashtable;

public class AddCustomerTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "bankManagerDP")
    public void addCustomerTest(Hashtable<String, String> data){

        // Suite
        // TestCase
        // Data

        ExcelReader excel = new ExcelReader(Constans.SUITE1_XL_PATH);
        DataUtil.checkExecution("BankManagerSuite", "AddCustomerTest", data.get("Runmode"), excel);

    }

}


