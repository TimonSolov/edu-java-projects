import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        // Вывести 3юю цифру 5ти-значного числа
        Scanner given_number_s = new Scanner(System.in);
        System.out.print("Type a 5 digits number: ");
        int givenNumber = given_number_s.nextInt();

        int numberLength = String.valueOf(givenNumber).length();
        if (numberLength != 5){
            System.out.println("Not a 5 digits number, please retry again!");
        }else {
            int threeDigitsNumber = givenNumber / 100;
            int thirdDigit = threeDigitsNumber % 10;
            System.out.println("The third digit of the " + givenNumber + " is: " + thirdDigit);
        }
    }
}