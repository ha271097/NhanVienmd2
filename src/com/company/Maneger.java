package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maneger {
    public static Employer[] listE;

    public Maneger(Employer[] listE) {
        this.listE = listE;
    }

    public void displayInformation() {
        for (Employer a : listE
        ) {
            System.out.println(a.toString());
        }
    }

    public Maneger() {
    }

    public double totalSalaryFT() {
        double sum = 0;
        for (Employer a : listE
        ) {
            if (a instanceof EmployerFT) {
                sum += a.salary1();
            }
        }
        return sum;
    }
    public double totalSalaryPT(){
        double sum = 0;
        for (Employer a: listE
             ) {
            if(a instanceof EmployerPT){
                sum +=a.salary1();
            }
        }
        return sum;
    }

        public  void  displayNewListPT(List<EmployerPT> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter CodeName");
        String codename = scanner.nextLine();
        System.out.println("Enter your name");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter your Phone");
        String phone = new Scanner(System.in).nextLine();
        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Enter your email");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Enter your time");
        int time = new Scanner(System.in).nextInt();
        EmployerPT employerPT = new EmployerPT(codename,name,phone,age,email,time);
        list.add(employerPT);
        //String codeMember, String name, String phone, int age, String email
    }
    public void displayArray(List<EmployerPT> list){
        for (EmployerPT a : list ) {
            System.out.println(a);
        }
    }
}
//    public Employer[] newArray() {
//        Scanner sc = new Scanner(System.in);
//        Employer[] newArray = new Employer[listE.length + 1];
//        double bonus = sc.nextDouble();
//        double fine = sc.nextDouble();
//        double salary = sc.nextDouble();
//        for (int i = 0; i < listE.length; i++) {
//            newArray[i] = listE[i];
//
//            newArray[newArray.length - 1] = new EmployerFT(bonus, fine, salary);
//
//        }
//        return newArray;
//    }
//        public void displayNewaAray() {
//            for (Employer a : newArray()
//            ) {
//                System.out.println(a.toString());
//            }
//    }



