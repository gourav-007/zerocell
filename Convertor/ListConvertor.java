package tobedeleted;

import com.creditdatamw.zerocell.converter.Converter;

import java.util.Arrays;
import java.util.List;

public class ListConvertor implements Converter {

    @Override
    public List<String> convert(String value, String columnName, int row) {
        return Arrays.asList(value.split(","));
    }
}
