package com;
/*Необходимо написать программу, которая определеет
пересекаются ли два отрезка. Координаты отрезков вводятся
вручную во время выполнения программы.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа определеет пересекаются ли два отрезка\n" +
                "Введите координаты отрезков через пробел, координат должны быть вещественными:\n" +
                "x11 y11 x12 y12 x11 y11 x22 y22");
        String input = scanner.nextLine();
        String[] stLines = input.split(" "); //получаем из строки нужные значения

        int x11 = Integer.parseInt(stLines[0]), y11 = Integer.parseInt(stLines[1]);
        int x12 = Integer.parseInt(stLines[2]), y12 = Integer.parseInt(stLines[3]);
        int x21 = Integer.parseInt(stLines[4]), y21 = Integer.parseInt(stLines[5]);
        int x22 = Integer.parseInt(stLines[6]), y22 = Integer.parseInt(stLines[7]);

        //проверка на пересечение отрезков через ориентированную площадь треугольника
        if (intersectProjections(x11, x12, x21, x22)
                && intersectProjections(y11, y12, y21, y22)
                && area(x11, y11, x12, y12, x21, y21) * area(x11, y11, x12, y12, x22, y22) <= 0
                && area(x21, y21, x22, y22, x11, y11) * area(x21, y21, x22, y22, x12, y12) <= 0)
            System.out.println("пересекает");
        else System.out.println(" не пересекает");

    }

    //Функция, вычисляющая удвоенную знаковую площадь треугольника
    static int area (int x1, int y1, int x2, int y2, int x3, int y3){
        return (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
    }

    //функция для поверки пересечения проекций отрезков на оси
    static boolean intersectProjections (int a, int b, int c, int d) {
         if (a > b) a = a + b -(b = a);
         if (c > d) c = c + d -(d = c);
         return Math.max(a, c) <= Math.min(b, d);
     }
}
