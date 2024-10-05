package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator tinhToan = new Calculator();
   
        tinhToan.soNghichDaoAll(1230);
    }

    public static int checkInput(){
        try (Scanner input = new Scanner(System.in)) {
            int n = 1;
           
                do {
                   
                    try {
                        System.out.print("Nhap so n: ");
                        n = input.nextInt();
                    }
                    catch (Exception e){
                        System.out.println("Loi: Nhap chua dung dinh dang.");
                       
                    }
                    if (n <= 0) {
                        System.out.println("Loi: So nhap vao khong duoc nho hon 0!");
                        System.out.print("Nhap lai: ");
                    }
                } while (n <= 0);
            
            return n;
        }
    }
    
}