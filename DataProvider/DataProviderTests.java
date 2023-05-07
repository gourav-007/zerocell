package tobedeleted;

import com.creditdatamw.zerocell.Reader;
import org.apache.commons.lang3.SystemUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class DataProviderTests {


    @Test(dataProvider = "testData")
    public void testDataDriver(ExcelReader model){
        System.out.println(model.getName() + "  " + model.getAge() + "  " + model.getAddress());
    }

    @DataProvider(name = "testData")
    public static Iterator<ExcelReader> getData(){
        List<ExcelReader> personModel = Reader
                .of(ExcelReader.class)
                .from(new File(
                        SystemUtils.getUserDir()
                                + File.separator + "tempexcel.xlsx"))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();

        return personModel.iterator();
    }

}
