import java.util.Scanner;

public class hometask1 {
    public static void main(String[] args) {

        // Найдите сумму и произведение цифр числа, введенного с клавиатуры
        Scanner inputDigit = new Scanner(System.in);
        System.out.print("Please type an input 3 digits number: ");
        int resultedNumber = inputDigit.nextInt();
        int thirdNumber, secondNumber, firstNumber, digitsMultiplyResult, digitsSumResult;

        thirdNumber = resultedNumber%10;
        secondNumber = resultedNumber/10%10;
        firstNumber = resultedNumber/100;

        digitsMultiplyResult = thirdNumber * secondNumber * firstNumber;
        digitsSumResult = thirdNumber + secondNumber + firstNumber;

        System.out.println("The sum of the number" + resultedNumber + " is: " + digitsSumResult);
        System.out.println("The multiplication of the number" + resultedNumber + " is: " + digitsMultiplyResult);

    }
}