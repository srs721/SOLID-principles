import java.util.HashMap;

class Grocery {
    private String firstName;
    private String lastName;
    private HashMap<String, Float> map;

    public Grocery() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<String, Float> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Float> map) {
        this.map = map;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Grocery(String firstName , String lastName, HashMap<String,Float> map) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.map = map;
    }
}