package com.company;

public class EmployerFT extends Employer {
    private double bonus;
    private double fine;
    private double salary;

    public EmployerFT() {
    }

    @Override
    public double salary1() {
        return salary + bonus - fine;
    }

    public EmployerFT(String codeMember, String name, String phone, int age, String email, double bonus, double fine, double salary) {
        super(codeMember, name, phone, age, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public EmployerFT(double bonus, double fine, double salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "EmployerFT{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", salary=" + salary +
                '}';
    }
}
