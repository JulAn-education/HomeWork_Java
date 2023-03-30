// Вывести все простые числа от 1 до 1000. Простые числа - числа которые деляться только на 1 и на само себя без остатка(кроме 1).

package hw1.task;

public class Task3 {
    public static void primeNum(){
        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }                
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }    
}
