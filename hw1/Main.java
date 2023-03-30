package hw1;

import java.util.Scanner;

import hw1.task.Task1;
import hw1.task.Task2;
import hw1.task.Task3;
import hw1.task.Task4;

public class Main {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Введите число: "); 
        // int n = scan.nextInt();
        // System.out.println("n-ое треугольное число равно: " + Task1.findNum(n));

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите число: "); 
        // int num = scanner.nextInt();
        // System.out.println("Факториал равен: " + Task2.getFact(num));

        // Task3.primeNum();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float a = sc.nextFloat();
        System.out.println("Введите операцию (+, -, *, /): ");
        char symbol = sc.next().charAt(0);  
        System.out.println("Введите второе число: ");
        float b = sc.nextFloat();
        Task4.calculator(a, b, symbol);


    }
}
