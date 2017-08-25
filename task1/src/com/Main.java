package com;

/*Задание 1
Необходимо написать программу, которая вычисляет простые
числа в пределах от 1 до N. N – вводится вручную во время
выполнения программы.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа вычисляет простые числа в пределах от 1 до N\nВведите N:");
        int n = scanner.nextInt();
        outer: for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0)
                    continue outer;
            }
            System.out.print(i + ", ");


        }
    }
}
