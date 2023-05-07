package tobedeleted;

import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.annotation.RowNumber;

import java.util.List;

public class ExcelReader {

    @RowNumber
    private int rownumber;

    @Column(index = 0,name = "Name")
    private String name;

    @Column(index = 1,name = "Age",converterClass = IntegerConvertor.class)
    private int age;

    @Column(index = 2,name = "Address")
    private String address;

    @Column(index = 3,name = "Hobbies", converterClass = ListConvertor.class)
    private List<String> hobbies;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", hobbies=" + hobbies;
    }

    public int getRownumber() {
        return rownumber;
    }

    public void setRownumber(int rownumber) {
        this.rownumber = rownumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

}
