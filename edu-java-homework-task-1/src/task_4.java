import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        //Task: Вывести длину отрезка, проходящей через две точки
        //Read the A point distance
        Scanner a_point = new Scanner(System.in);
        System.out.print("A point number: ");
        int A_point = a_point.nextInt();

        //Read the B point distance
        Scanner b_point = new Scanner(System.in);
        System.out.print("B point number: ");
        int B_point = b_point.nextInt();

        // Calculate the length between A and B points
        int AB_length = B_point - A_point;

        //Display the length
        System.out.println("The lenght is: " + Math.abs(AB_length));
    }
}