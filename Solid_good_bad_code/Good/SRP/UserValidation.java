import java.util.HashMap;

public class UserValidation extends Grocery{

    public UserValidation(String firstName, String lastName, HashMap<String, Float> map) {
        super(firstName, lastName, map);
    }

    public UserValidation() {
    }

    public boolean isValidUser(){
        Grocery g = new Grocery();

        if((g.getFirstName().matches("[A-Z][a-z]*")) && g.getLastName().matches("[A-Z]+([ '-][a-zA-Z]+)*")){
            return true;
        }else{
            return false;
        }
    }
}