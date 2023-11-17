package bg.smg.modem;

import java.util.Date;
import java.util.List;

public class MovieStar {
    private String name;
    private String addressStar;
    private char gender;
    private Date birthday;
    private List<Movie> movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressStar() {
        return addressStar;
    }

    public void setAddressStar(String addressStar) {
        this.addressStar = addressStar;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
