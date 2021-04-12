package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employer listE[] = new Employer[4];
        listE[0] = new EmployerFT("m1", "E1", "0999889989", 24, "E1@gmail.com", 1000000, 500000, 10000000);
        listE[1] = new EmployerFT("m2", "E2", "0999889988", 25, "E1@gmail.com", 1000000, 0, 10000000);
        listE[2] = new EmployerPT("m3", "E3", "0999889987", 26, "E1@gmail.com", 4);
        listE[3] = new EmployerPT("m4", "E4", "0999889986", 27, "E1@gmail.com", 4);
        Maneger haanh = new Maneger(listE);
        List<EmployerPT> list = new ArrayList<>();
        haanh.displayInformation();
        System.out.println("Total salary of Employer Full Time: " + haanh.totalSalaryFT());
        System.out.println("Total salaray of Employer Part Time" + haanh.totalSalaryPT());
        haanh.displayNewListPT(list);
        haanh.displayArray(list);

    }
}
