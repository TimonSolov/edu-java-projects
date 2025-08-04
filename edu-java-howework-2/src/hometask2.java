import java.util.Scanner;

public class hometask2 {
    public static void main(String[] args) {
        //Найдите самую большую цифру числа, введенного с клавиатуры, а также ее индекс
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            number = -number;
        }

        long maxDigit = -1;
        int maxIndex = -1;
        int currentIndex = 0;


        if (number == 0) {
            maxDigit = 0;
            maxIndex = 0;
        } else {
            while (number > 0) {
                long digit = number % 10;
                if (digit > maxDigit) {
                    maxDigit = digit;
                    maxIndex = currentIndex;
                }
                number /= 10;
                currentIndex++;
            }

            maxIndex = currentIndex - 1 - maxIndex;
        }

        System.out.println("The biggest digit is: " + maxDigit);
        System.out.println("Its index is: " + maxIndex);

    }
}