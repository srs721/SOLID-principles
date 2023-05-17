import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    String emailValidate(Email[] email_address) {
        String result = null;
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailPattern);
        for (Email emailAddress : email_address) {
            Matcher matcher = pattern.matcher((CharSequence) emailAddress);
            result = email_address + " : " + matcher.matches() + "\n";
        }
        return result;
    }

    String phoneValidate(Phone[] phone_number){
        String result = null;
        String phonePattern = "^\\\\d{10}$";
        Pattern pattern = Pattern.compile(phonePattern);
        for (Phone phoneNumber : phone_number) {
            Matcher matcher = pattern.matcher((CharSequence) phoneNumber);
            result = (phone_number + " : " + matcher.matches() + "\n");
        }
        return result;
    }
}