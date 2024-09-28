/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class if_else_struct {
    public static void BaiTap1(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " lon hon " + num2);
            System.out.println(num2 + " nho hon " + num1);
        }
        else if (num1 < num2) {
            System.out.println(num2 + " lon hon " + num1);
            System.out.println(num1 + " nho hon " + num2);
        }
        else 
            System.out.println("Hai so deu bang nhau!");
        
    }

    public static void BaiTap2(int num) {
        // So am duong
        if (num > 0) 
            System.out.println(num + " la so duong.");
        else if (num < 0) 
            System.out.println(num + " la so am.");
        else 
            System.out.println(num + "La so khong am khong duong.");
        

        // So chan le
        if (num % 2 == 0)
            System.out.println(num + " la so chan.");
        else
            System.out.println(num + " la so le.");

        // Chia het cho 3
        if (num % 3 == 0)
            System.out.println(num + " la so chia het cho 3.");
        else
            System.out.println(num + " la so khong chia het cho 3.");

        // So chia het cho 2 va 3
        if ((num % 3 == 0) && (num % 3 == 0))
            System.out.println(num + " la so chia het cho 2 va 3.");
        else
            System.out.println(num + " la so khong chia het cho 2 va 3.");

        // So nam trong khoang 50 den 100
        if ((num > 50) && (num < 100))
            System.out.println(num + " la so nam trong khoang 50 den 100");
        else
            System.out.println(num + " la so khong nam trong khoang 50 den 100");
    }

    public static int BaiTap5(int n1, int n2) {
        // Tra ve so lon hon
        return n1 > n2 ? n1 : n2;
    }

    public static void BaiTap6(int n) {
        String old_even = (n % 2 == 0) ? "So duoc kiem tra so chan." : "So duoc kiem tra la so le.";
        String neg_pos = (n > 0) ? "So duoc kiem tra la so duong" : (n < 0) ? "So duoc kiem tra la so am" : "So duoc kiem tra la so khong am khong duong.";
        System.out.println(old_even);
        System.out.println(neg_pos);
    }

    public static void BaiTap7(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3: 
                System.out.println(month + " thuoc quy 1 cua nam.");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(month + " thuoc quy 2 cua nam.");
                break;
            case 7:
            case 8:
            case 9: 
                System.out.println(month + " thuoc quy 3 cua nam.");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(month + " thuoc quy 4 cua nam.");
                break;
            default:
                System.out.println("Thang nhap vao khong hop le.");
        }
    }

    public static void BaiTap8(int year) {
        int TuoiCan = year % 10;
        int TuoiChi = year % 12;

        String Can[] = {"Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Dinh", "Mau", "Ky"};
        String Chi[] = {"Than", "Dau", "Tuan", "Hoi", "Ti", "Suu", "Dan", "Meo", "Thin", "Ty", "Ngo", "Mui"};

        System.out.println("Nguoi sinh nam " + year + " (duong lich) co tuoi am lich la: " + Can[TuoiCan] + ' ' + Chi[TuoiChi]);
    }

    public static void BaiTap9(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        int n = input.nextInt();

        switch (n) {
            case 1:
                System.out.println("CNTT");
                System.out.print("Nhap vao 1 so: ");
                int n2 = input.nextInt();
                switch (n2) {
                    case 1:
                        System.out.println("Mang MT");
                        break;
                    case 2:
                        System.out.println("THUD");
                        break;
                    case 3:
                        System.out.println("TKĐH");
                        break;
                    default:
                        System.out.println("Khoa CNTT xin chao, hen gap lai.");
                }
                break;
            case 2:
                System.out.println("Ngoai ngu");
                System.out.print("Nhap vao 1 so: ");
                int n3 = input.nextInt();
                switch (n3) {
                    case 1:
                        System.out.println("Ngon ngu Anh");
                        break;
                    case 2:
                        System.out.println("Bien dich");
                        break;
                    default:
                        System.out.println("Khoa Ngoai ngu xin chao, hen gap lai.");
                }
                break;
            case 3:
                System.out.println("Co khi");
                System.out.print("Nhap vao 1 so: ");
                int n4 = input.nextInt();
                System.out.println("Khoa Co khi xin chao, hen gap lai.");
                break;
            default:
                System.out.println("Du lieu khong hop le.");
        }

    }
}