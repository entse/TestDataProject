package utilities;

public class TestUtil {

    public static boolean isSuiteRunnable(String suiteName, ExcelReader excel){

        int rows = excel.getRowCount(Constans.SUITE_SHEET);

        for (int rowNUm = 2; rowNUm <= rows; rowNUm++){
            String data = excel.getCellData(Constans.SUITE_SHEET, Constans.SUITENAME_COL, rowNUm);
            if (data.equals(suiteName)){
                String runmode = excel.getCellData(Constans.SUITE_SHEET, Constans.RUNMODE_COL, rowNUm);
                if(runmode.equals(Constans.RUNMODE_YES))
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    public static boolean isTestRunnable(String testCaseName, ExcelReader excel){

        int rows = excel.getRowCount(Constans.TESTCASE_SHEET);

        for (int rowNUm = 2; rowNUm <= rows; rowNUm++){
            String data = excel.getCellData(Constans.TESTCASE_SHEET, Constans.TESTCASE_COL, rowNUm);
            if (data.equals(testCaseName)){
                String runmode = excel.getCellData(Constans.TESTCASE_SHEET, Constans.RUNMODE_COL, rowNUm);
                if(runmode.equals(Constans.RUNMODE_YES))
                    return true;
                else
                    return false;
            }
        }
        return false;

    }
}
