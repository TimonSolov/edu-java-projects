import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        // Вывести 3юю цифру 5ти-значного числа
        Scanner given_number_s = new Scanner(System.in);
        System.out.print("Type a 5 digits number: ");
        int given_number = given_number_s.nextInt();

        int number_length = String.valueOf(given_number).length();
        if (number_length != 5){
            System.out.println("Not a 5 digits number, please retry again!");
        }else {
            int three_digits_number = given_number / 100;
            int third_digit = three_digits_number % 10;
            System.out.println("The third digit of the " + given_number + " is: " + third_digit);
        }
    }
}