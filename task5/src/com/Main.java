package com;
/*Задание 5
Необходимо написать программу, которая проверяет слово на
"палиндромность". Слово для проверки вводится вручную во время
выполнения программы.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа проверяет слово на палиндромность\n" +
                "Введите слово для проверки:");
        String word = scanner.nextLine();
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length / 2; i++) {              //сравниваем первые символы с последними
            if (letters[i] != letters[letters.length - 1 - i]){     //если символы не совпали то не является палиндромом
                System.out.println("Введенное слово не является палиндромом");
                return;}
        }
        System.out.println("Введенное слово является палиндромом");
    }
}
