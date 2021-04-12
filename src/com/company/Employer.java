package com.company;

public abstract class Employer{
    private String codeMember;
    private String name;
    private String phone;
    private int age;
    private String email;

    public Employer() {
    }

    public abstract double salary1();


    public Employer(String codeMember, String name, String phone, int age, String email) {
        this.codeMember = codeMember;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public String getCodeMember() {
        return codeMember;
    }

    public void setCodeMember(String codeMember) {
        this.codeMember = codeMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "codeMember='" + codeMember + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
