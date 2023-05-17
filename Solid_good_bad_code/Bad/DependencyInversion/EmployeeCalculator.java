public class EmployeeCalculator {
    public float calculateSalary(float payPerHour, float hoursWorked, float taxRate){
        return((payPerHour*hoursWorked)-taxRate);
    }

    public boolean calculateLeaves(int leavesAllowed,int leavesTaken){
        if(leavesAllowed - leavesTaken > 0){
            return true;
        }else{
            return false;
        }
    }
}