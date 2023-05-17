public class Employee{
    private float payPerHour;
    private float hoursWorked;
    private float taxRate;
    private int leavesAllowed;
    private int leavesTaken;

    private IEmployeeManagement emgmt;

    public Employee(float payPerHour,float hoursWorked,float taxRate,int leavesAllowed,int leavesTaken){
        this.payPerHour = payPerHour;
        this.hoursWorked = hoursWorked;
        this.taxRate = taxRate;
        this.leavesAllowed = leavesAllowed;
        this.leavesTaken = leavesTaken;
    }

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

    public Employee(IEmployeeManagement emgmt){
        this.emgmt = emgmt;
    }

    public void getSalary(){
        float salary = emgmt.calculateSalary(payPerHour, hoursWorked,taxRate);
    }

    public void getLeaves(){
        boolean takeLeave = emgmt.calculateLeaves(leavesAllowed,leavesTaken);

    }

}