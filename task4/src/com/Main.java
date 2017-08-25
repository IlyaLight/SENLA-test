package com;
/*Задание 4
Необходимо написать рекурсивный алгоритм для нахождения НОД
и НОК двух чисел. Два числа вводятся вручную во время
выполнения программы.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа для нахождения НОД и НОК двух чисел\n" +
                "Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println();
        System.out.println("НОД\t" + nod(a,b));
        System.out.println("НОК\t" + nok(a,b));

    }

    //находит НОД при помощи рекурсии
    static int nod(int a,int b){
        return b == 0 ? a : nod(b,a % b);
    }

    // находит НОК
    static long nok(int a,int b){
        return a / nod(a,b) * b;
    }
}
