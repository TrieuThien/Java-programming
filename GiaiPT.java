/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;

/**
 *
 * @author Administrator
 */
public class GiaiPT {
    public static void GiaiPTB1(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem!");
            }
            else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
        else {
            System.out.println("Nghiem cua phuong trinh la: " + (-b / a));
        }
    }
    
    public static void GiaiPTB2(double a, double b, double c) {
        double delta = b*b - (4*a*c);
        
        if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / (2*a)));
        }
        else if (delta > 0) {
            System.out.println("Phuong trinh co hai nghiep phan biet:");
            double x1 = (- b + Math.sqrt(delta)) / (2*a);
            double x2 = (- b - Math.sqrt(delta)) / (2*a);
            System.out.println("Nghiem x1 = " + x1);
            System.out.println("Nghiem x2 = " + x2);
        }
        else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    } 
}
