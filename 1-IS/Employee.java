public class Employee {
    String firstName, lastName, ssn;

    Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        
    }

    public void printInfo() {
        System.out.print(firstName + " " + lastName + " | SSN: " + ssn +" ");
    }

}

class SalariedEmployee extends Employee {
    int weeklySalary;

    SalariedEmployee(String firstName, String lastName, String ssn, int weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("| Weekly Salary: $" + weeklySalary);
    }
}

 class HourlyEmployee extends Employee {
    int wage, hoursWorked;

    HourlyEmployee(String firstName, String lastName, String ssn, int wage, int hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("| Wgae: $" + wage + " | Hours worked: " + hoursWorked);
    }
}

class CommisionEmployee extends Employee {
    int commisionRate, grossSales;

    CommisionEmployee(String firstName, String lastName, String ssn, int commisionRate, int grossSales) {
        super(firstName, lastName, ssn);
        this.commisionRate = commisionRate;
        this.grossSales = grossSales;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("| Commision rate: " + commisionRate + "% " + " | Sales: " + grossSales);
    }
}

class BaseEmployee extends Employee {
    int baseSalary;

    BaseEmployee(String firstName, String lastName, String ssn, int baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("| Base salary: " + baseSalary);
    }
}
