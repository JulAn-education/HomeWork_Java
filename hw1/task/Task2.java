// n! (произведение чисел от 1 до n)

package hw1.task;

public class Task2 {
    public static int getFact(int num) {
        if (num == 0 || num == 1) return 1;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;   
       }
        return fact;         
    }
}
