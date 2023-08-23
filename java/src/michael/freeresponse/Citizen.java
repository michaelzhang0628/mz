package michael.freeresponse;

public class Citizen {
    private String name;
    private String city;
    boolean isUSCitizen;

    public Citizen(String name, String city, boolean isUSCitizen) {
        super();
        this.name = name;
        this.city = city;
        this.isUSCitizen = isUSCitizen;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public boolean isUSCitizen() {
        return isUSCitizen;
    }
}
