import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    String validate(IDetails[] details, String patternValidate){
        String result = null;
        Pattern pattern = Pattern.compile(patternValidate);
        for (IDetails iDetails : details) {
            Matcher matcher = pattern.matcher((CharSequence) iDetails);
            result = details + " : " + matcher.matches() + "\n";
        }
        return result;
    }
}
