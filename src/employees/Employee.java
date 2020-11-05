package employees;

import shared.Payable;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;


//    private double curEarnings;

    // constructor
    public Employee(String first, String last, String ssn){
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
        //        Don't call overridable instance methods in constructor
        //        this.curEarnings = this.earnings();
    }
    // SETTERS
    public void setFirstName(String first){
        this.firstName = first;
    }
    public void setLastName(String last){
        this.lastName = last;
    }
    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }

    // GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    // return String representation of Employee object
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // ABSTRACT METHODS
    // not implemented here
    public abstract double earnings();

    // template method - design pattern
    @Override
    public double getPayableAmount() {
        return earnings();
    }

}
