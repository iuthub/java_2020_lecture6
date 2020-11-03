package employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double weeklySalary) {
        super(first, last, ssn);
        this.weeklySalary=weeklySalary;
    }

    // GETTERS
    public double getWeeklySalary(){
        return this.weeklySalary;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        return getWeeklySalary();
    }
    // return String representation of SalriedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }

}
