package suite.bankmanager.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Constans;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;

import java.util.Hashtable;

public class OpenAccountTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "bankManagerDP")
    public void openAccountTest(Hashtable<String, String> data){


        ExcelReader excel = new ExcelReader(Constans.SUITE1_XL_PATH);
        DataUtil.checkExecution("BankManagerSuite", "OpenAccountTest", data.get("Runmode"), excel);

    }




}
