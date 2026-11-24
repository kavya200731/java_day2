
class Employee {
    protected double baseSalary;

    public double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    private double bonus;

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

class Main {
    public static void main(String[] args) {
        SalesEmployee employee = new SalesEmployee();

        employee.setBaseSalary(50000.0);
        employee.setBonus(7500.0);

        System.out.println("Total salary: " + employee.calculateSalary());
    }
}
