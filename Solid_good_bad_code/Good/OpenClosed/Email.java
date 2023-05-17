public class Email implements IDetails{

    private String email;

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String validate() {
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        return emailPattern;
    }
}
