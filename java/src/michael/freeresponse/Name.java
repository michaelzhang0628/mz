package michael.freeresponse;

public class Name {
    private String lastName;
    private String firstName;

    Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
