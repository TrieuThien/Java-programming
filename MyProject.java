/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.myproject;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MyProject {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to my program :3");

    }

    static void Bai1() {
        System.out.print("Ban nhap vao mot so: ");
        int number = input.nextInt();
        System.out.println("Ban vua moi nhap so: " + number);
    }

    static void Bai2() {
        System.out.print("Ban nhap vao mot so: ");
        int number = input.nextInt();
        System.out.println("So ban vua nhap lon hon " + (number - 1) + " va nho hon " + (number + 1));
    }

    static void Multi(int num1, int num2) {
        System.out.print("Nhap x: ");
        int x = input.nextInt();
        System.out.print("Nhap y: ");
        int y = input.nextInt();
        System.out.println("Tich z = x * y = " + (x * y));
    }

    static void DoiTien(int menhGia) {
        int temp = menhGia;
        int soTo10k = temp / 10;
        temp %= 10;
        int soTo5k = temp / 5;
        temp %= 5;
        int soTo2k = temp / 2;
        int soTo1k = temp % 2;
        
        System.out.println("So tien ban dau la: " + menhGia);
        System.out.println("So to 10k la: " + soTo10k);
        System.out.println("So to 5k la: " + soTo5k);
        System.out.println("So to 2k la: " + soTo2k);
        System.out.println("So to 1k la: " + soTo1k);
    }

}
