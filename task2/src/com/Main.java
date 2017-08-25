package com;

/*Задание 2
Необходимо написать программу, которая вычисляет числа
Фибоначчи в пределах от 1 до N. N – вводится вручную во время
выполнения программы.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа вычисляет числа Фибоначчи в пределах от 1 до N\nВведите N");
        int n = scanner.nextInt();
        int [] fib = new int[]{1,1,2};
        System.out.print("1");
        if (n > 1)
            while (true){
                System.out.print("," + fib[2]);
                fib[0] = fib[1];
                fib[1] = fib[2];
                fib[2] = fib[0] + fib[1];
                if (fib[2] >= n)
                    break;
            }
    }
}
