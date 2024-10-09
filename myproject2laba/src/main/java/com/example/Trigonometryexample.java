import java.util.Scanner;

package com.example;
public class Trigonometryexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        double x = in.nextDouble();
            double y; 
            double val1 = Math.log10(Math.abs(Math.pow(2, x) + Math.pow(x, 7) + Math.pow(Math.abs(x-4), x)));
            double val2 = Math.pow(Math.log10(Math.pow(x/(1 + x*x), 4)), 9);
            double val3 = Math.acos(1/x) + 1;
        if (x<=3) {
           y = val1;
        } 
        if ((x>3) && x<5) {
            y = val2;
        }
        if (x>=5) {
            y = val3;
        }
        
        System.out.println("Вы ввели точку: ("+x+";"+y+")");

    }
}