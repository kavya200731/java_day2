class Employee {
    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    double bonus;

    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Main1 {
    public static void main(String[] args) {

        SalesEmployee emp = new SalesEmployee();

        emp.baseSalary = 30000;
        emp.bonus = 5000;

        System.out.println("Base Salary: " + emp.baseSalary);
        System.out.println("Bonus: " + emp.bonus);
        System.out.println("Total Salary: " + emp.calculateSalary());
    }
}