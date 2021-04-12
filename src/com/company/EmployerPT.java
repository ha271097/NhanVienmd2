package com.company;

public class EmployerPT extends  Employer{
private int timeWork;

    public EmployerPT(String codeMember, String name, String phone, int age, String email, int timeWork) {
        super(codeMember, name, phone, age, email);
        this.timeWork = timeWork;
    }

    @Override
    public double salary1() {
        return 0;
    }

    public EmployerPT() {
    }

    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public String toString() {
        return super.toString() +"EmployerPT{" +
                "timeWork=" + timeWork +
                '}';
    }
}
