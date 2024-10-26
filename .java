abstract class Employee {
    private String name;
    private String position;
    private int yearOfJoining;

    public Employee(String name, String position, int yearOfJoining) {
        this.name = name;
        this.position = position;
        this.yearOfJoining = yearOfJoining;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public abstract void output();
}

class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String name, String position, int yearOfJoining, double annualSalary) {
        super(name, position, yearOfJoining);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
    public void output() {
        System.out.println("Full-Time Employee: " + getName() + " - " + getPosition() + " (" + getYearOfJoining() + "), Annual Salary: $" + annualSalary);
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyWage;

    public PartTimeEmployee(String name, String position, int yearOfJoining, double hourlyWage) {
        super(name, position, yearOfJoining);
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void output() {
        System.out.println("Part-Time Employee: " + getName() + " - " + getPosition() + " (" + getYearOfJoining() + "), Hourly Wage: $" + hourlyWage);
    }
}

public class Office {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice Johnson", "Manager", 2015, 75000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob Smith", "Consultant", 2020, 40.0);

        fullTimeEmployee.output();
        partTimeEmployee.output();
    }
}