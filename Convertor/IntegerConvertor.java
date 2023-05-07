package tobedeleted;

import com.creditdatamw.zerocell.converter.Converter;

public class IntegerConvertor implements Converter {
    @Override
    public Integer convert(String value, String coloumnName, int row) {
        return Integer.parseInt(value);
    }
}
