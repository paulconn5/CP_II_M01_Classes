import java.time.Year;

/**
 * @author Paul Connolly connolpe@mail.uc.edu
 *
 */
public class Person
{
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int birthYear;

    public Person(String firstName, String lastName, String ID, String title, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    /**
     * Method to get the full name of a Person object
     * @return Return the first and last name as a full name String
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     * Method to get the formal name of a Person object
     * @return Return the title, first, and last name as a formal named String
     */
    public String getFormalName()
    {
        return title + " " + firstName + " " + lastName;
    }

    /**
     * Get the age as an int assuming that it is for the current year
     * @return Person objects current age
     */
    public int getAge()
    {
        return Integer.parseInt(Year.now().toString()) - birthYear;
    }

    /**
     *
     * @param year THE YEAR THAT YOU WANT TO USE TO DETERMINE THE AGE AT THAT TIME
     * @return the age at that year
     */
    public int getAge(int year)
    {
        return year-birthYear;
    }

    /**
     *
     * @return return the object data in cvs format
     */
    public String toCVSRecord() {
        return ID + "," + firstName + ", " + lastName + ", " + title + ", " + birthYear + "\n";
    }
}

