package rough;

import utilities.ExcelReader;
import utilities.TestUtil;

public class ChekingRunmodes {

    public static void main(String[] args) {

        String suiteName = "BankManagerSuite";

        boolean suiteRunmode = TestUtil.isSuiteRunnable(suiteName, new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Suite.xlsx"));

        System.out.println(suiteRunmode);


        String testCaseName = "OpenAccountTest";

        boolean testRunmode = TestUtil.isTestRunnable(testCaseName, new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\"+ suiteName +".xlsx") );
        System.out.println(testRunmode);
    }
}
