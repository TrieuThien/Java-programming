package com.example;

public class Calculator {
    public void baiToanGaVaCho() {
        for (int ga = 1; ga < 36; ga++) {
            for (int cho = 1; cho < 25; cho++) {
                if ((ga + cho == 36) && (ga*2 + cho*4 == 100))
                    System.out.printf("So con ga %d va so con cho la %d", ga, cho);
            }
        }
    }

    public void baiToanConTrau() {
        for (int trauDung = 1; trauDung <= 20; trauDung++) {
            for (int trauNam = 1; trauNam <= 33; trauNam++) {
                for (int trauGia = 3; trauGia <= 99; trauGia++) {
                    if ((trauDung+trauNam+trauGia == 100) && (trauDung * 5 + trauNam * 3 + trauGia /3 == 100))
                        System.out.printf("So trau dung la: %d \nSo trau nam la: %d \nSo trau gia la: %d \n--------------------\n", trauDung, trauNam, trauGia);
                }
            }
        }
    }
    
    public void fibonacy(int n) {
        int i = 3, f1 = 1, f2 = 1, fn = 0;
        if (n == 1 || n == 2) 
            System.out.printf("So fibonacy thu %d la 1", n);
        while (i <= n) {
            fn = f2 + f1;
            f1 = f2;
            f2 = fn;
            i++;
        }
        System.out.printf("So fibonacy thu %d la: %d", n, fn);
    }

    public void soNghichDao(int num) {
        int temp = num;
        int newNumber = 0;
        while (temp > 0){
            newNumber *= 10;
            newNumber += (temp % 10);
            temp /= 10;
        }

        System.out.println("So nghich dao la: " + newNumber);
    }

    public  void soNghichDaoAll(int number) {
        int temp = number;
       
        while (temp > 0){
            System.out.print(temp % 10);
            temp /= 10;
        }
    }
}   
