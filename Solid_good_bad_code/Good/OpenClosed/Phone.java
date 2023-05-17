public class Phone implements IDetails{
    private String phone;

    public Phone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public String validate() {
        String phonePattern = "^\\\\d{10}$";
        return phonePattern;
    }
}
