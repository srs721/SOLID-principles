public interface IEmployeeManagement {
    public float calculateSalary(float payPerHour, float hoursWorked, float taxRate);
    public boolean calculateLeaves(int leavesAllowed,int leavesTaken);
}