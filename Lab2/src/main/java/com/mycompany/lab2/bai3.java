

package com.mycompany.lab2;

import java.util.Scanner;


public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so dien su dung (kWh): ");
        int soDien = sc.nextInt();

        if (soDien < 0) {
            System.out.println("So dien khong hop le");
            sc.close();
            return;
        }

        int tienDien = 0;

        if (soDien <= 50) {
            tienDien = soDien * 1678;
        } else if (soDien <= 100) {
            tienDien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else if (soDien <= 300) {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        } else if (soDien <= 400) {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soDien - 400) * 2927;
        }

        System.out.println("So tien phai tra: " + tienDien + " VND");

        sc.close();
    }
}