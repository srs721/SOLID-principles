public class Employee{
    private float payPerHour;
    private float hoursWorked;
    private float taxRate;
    private int leavesAllowed;
    private int leavesTaken;

    public void setPayPerHour(float payPerHour) {
        this.payPerHour = payPerHour;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public void setLeavesAllowed(int leavesAllowed) {
        this.leavesAllowed = leavesAllowed;
    }

    public float getPayPerHour() {
        return payPerHour;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public int getLeavesAllowed() {
        return leavesAllowed;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public void getSalary(){
        EmployeeCalculator m = new EmployeeCalculator();
        float salary = m.calculateSalary(payPerHour, hoursWorked,taxRate);
    }
    public void getLeaves(){
        EmployeeCalculator m = new EmployeeCalculator();
        boolean takeLeave = m.calculateLeaves(leavesAllowed,leavesTaken);

    }

}