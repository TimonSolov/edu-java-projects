import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {
        //Создайте программу вычисляющую факториал числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number: ");
        long number = scanner.nextLong();

        if (number == 0) {
            int operationResult = 0;
            System.out.println("The factorial is: " + operationResult);
        } else {
            long digit = 0;
            long factorialNumber = 1;
            while (number > 0) {
                digit = number % 10;
                number /= 10;
                factorialNumber = factorialNumber * digit;
            }

            System.out.println("The number's factorial is: " + factorialNumber);
        }
    }
}