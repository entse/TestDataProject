package rough;

import utilities.ExcelReader;
import utilities.DataUtil;

public class ChekingRunmodes {

    public static void main(String[] args) {

        String suiteName = "BankManagerSuite";

        boolean suiteRunmode = DataUtil.isSuiteRunnable(suiteName, new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Suite.xlsx"));

        System.out.println(suiteRunmode);


        String testCaseName = "OpenAccountTest";

        boolean testRunmode = DataUtil.isTestRunnable(testCaseName, new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\"+ suiteName +".xlsx") );
        System.out.println(testRunmode);
    }
}
