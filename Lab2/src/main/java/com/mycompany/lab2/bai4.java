
package com.mycompany.lab2;

import java.util.Scanner;


public class bai4 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac hai");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Ban chon chuc nang giai phuong trinh bac nhat");
                    GiaiPhuongTrinhBacNhat(sc);
                    break;
                case 2:
                    System.out.println("Ban chon chuc nang giai phuong trinh bac hai");
                    GiaiPhuongTrinhBacHai(sc);
                    break;
                case 3:
                    System.out.println("Ban chon chuc nang tinh tien dien");
                    TinhTienDien(sc);
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Vui long chon lai");
            }
        } while (choice != 4);

        sc.close();
    }

public static void GiaiPhuongTrinhBacNhat(Scanner sc){
    System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        }
}
public static void GiaiPhuongTrinhBacHai(Scanner sc){
    System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh bac nhat co nghiem x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            System.out.println("Delta = " + delta);

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    
}
public static void TinhTienDien(Scanner sc){
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
}
    
}