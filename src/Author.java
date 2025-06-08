import java.util.Date;

public class Author {
    private String firstName;
    private String lastName;
    private Country birthCountry;
    private Date birthDate;

    // Constructors
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthCountry = null;
        this.birthDate = null;
    }
    public Author(String firstName, String lastName, Country birthCountry, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthCountry = birthCountry;
        this.birthDate = birthDate;
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public Country getBirthCountry() {
        return this.birthCountry;
    }
    public Date getBirthDate() {
        return this.birthDate;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthCountry(Country birthCountry) {
        this.birthCountry = birthCountry;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // toString implementation
    @Override
    public String toString() {
        return "firstName = " + this.firstName + ", lastName = " + this.lastName + ", birthCountry =" + this.birthCountry.toString() + ", birthDate = " + this.birthDate.toString();
    }
}
