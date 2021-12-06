package com.oopslab.assignment;

import javax.sql.CommonDataSource;
import java.util.Scanner;

public class Demo {
    Commission com = null;

    public Demo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sale: ");
        int sale = sc.nextInt();
        createObj(sale);
    }

    public void createObj(int sale) {
        if (sale > 0) {
            com = new Commission(sale);
        } else {
            System.out.println("❌ Invalid Input");
        }
    }

}
