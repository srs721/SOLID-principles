import java.util.HashMap;

class Grocery {
    private String firstName;
    private String lastName;
    private HashMap<String, Float> map;

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

    public float bill(){
        float amount = 0;
        for(float item: map.values()){
            amount += item;
        }
        return amount;
    }

    public boolean validUser(){

        if((getFirstName().matches("[A-Z][a-z]*")) && getLastName().matches("[A-Z]+([ '-][a-zA-Z]+)*")){
            return true;
        }else{
            return false;
        }
    }

    public String displayMenu(){
        if(validUser()) {
            return "<h2>Fruits List</h2><menu>li>Oranges</li><li>Pineapple<li><li>Apples</li><li>Grapes</li></menu>";
        }
        else{
            return "<h1> User is Invalid! Menu option cannot be displayed!! <h1>";
        }
    }
}
