public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double tax = 0.0;;
    double bonus = 0.0;
    double salaryIncrease = 0.0;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public void tax() {
        if (this.salary >= 2000) {
            this.tax = this.salary * 0.03;
        }
    }
    public void bonus() {
        if (this.workHours >= 30) {
            this.bonus = (this.workHours - 30) * 10;
        } else {
            System.out.println("Invalid number...");
        }
    }
    public void salaryIncrease() {
        if(2022 - this.hireYear < 10) {
            this.salaryIncrease = this.salary * 0.01;
        } else if(2022 - this.hireYear < 30) {
            this.salaryIncrease = this.salary * 0.1;
        } else {
            this.salaryIncrease = this.salary * 0.15;
        }
    }
    public void print() {
        tax();
        bonus();
        salaryIncrease();
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Salary Increase : " + this.salaryIncrease);
        System.out.println("Salary with Bonus and Tax : " + (this.salary + this.bonus - this.tax));
        System.out.println("Total Salary : " + this.salary + this.salaryIncrease);
    }
}
