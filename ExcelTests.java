package tobedeleted;

import com.creditdatamw.zerocell.Reader;
import org.apache.commons.lang3.SystemUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class ExcelTests {

    @Test
    public void readingExcel(){
        List<ExcelReader> personModels = Reader
                .of(ExcelReader.class)
                .from(new File(SystemUtils.getUserDir() + File.separator + "tempexcel.xlsx"))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();

        personModels.forEach(p->{
            System.out.println(p.toString() + "     "+ p.getRownumber());
        });
    }
}
