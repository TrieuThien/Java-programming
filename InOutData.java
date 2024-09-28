/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;

/**
 *
 * @author Administrator
 */
public class InOutData {

    public static void Bai2() {
        System.out.println("Minh ten la: Nguyen Van An, rat vui duoc lam quen voi cac ban!");
    }

    public static void Bai3() {
        System.out.println("**********************************************");
        System.out.println("* Truong Dai hoc _____________________ TPHCM *");
        System.out.println("*           Chao mung cac ban                *");
        System.out.println("**********************************************");
    }

    public static void Bai4() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("-------------------");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
     
        System.out.println("-------------------");
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            for (int k = i; k <= (10 - i); k++) {
                System.out.print('*');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
