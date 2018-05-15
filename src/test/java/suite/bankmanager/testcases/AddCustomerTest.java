package suite.bankmanager.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Constans;
import utilities.DataUtil;
import utilities.ExcelReader;

import java.util.Hashtable;

public class AddCustomerTest {

    @Test(dataProvider = "getData")
    public void addCustomerTest(Hashtable<String, String> data){

    }

    @DataProvider
    public Object[] [] getData() {

        return DataUtil.getData("AddCustomerTest", new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\BankManagerSuite.xlsx"));
    }



}


