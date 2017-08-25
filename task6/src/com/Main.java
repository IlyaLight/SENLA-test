package com;
/*Задание 6
Необходимо написать программу, которая удаляет из текста числа.
Текст вводится вручную во время выполнения программы.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа которая удаляет из текста числа\n" +
                "Введите текст:");
        String text = scanner.nextLine();
        System.out.println("\nОтредактированный текст:");
        System.out.println(text.replaceAll("\\d", "")); //регулярным выражением заменяем цифры(\\d) на пустой символ, то есть удаляем.

    }
}
