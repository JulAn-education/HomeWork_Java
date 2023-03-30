// Реализовать простой калькулятор. Использовать сканнер: 
// Scanner scanner = new Scanner(System.in); 
// String enter = scanner.next(); 
// int i = Integer.parseInt(enter);

package hw1.task;

public class Task4 {
    public static void calculator(float a, float b, char symbol) {
        if (symbol == '+'){
            float result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (symbol == '-') {
            float result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (symbol == '*') {
            float result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if (symbol == '/') {
            float result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } else {
            System.out.println("Вы ввели неверный символ. Попробуйте еще раз!");
        }
       
    }
    
}
