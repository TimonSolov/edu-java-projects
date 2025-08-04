import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        //Task: Вывести длину отрезка, проходящей через две точки
        //Read the A point distance
        Scanner scanner = new Scanner(System.in);
        System.out.print("A point number: ");
        int aPoint = scanner.nextInt();

        //Read the B point distance
        Scanner scannerB = new Scanner(System.in);
        System.out.print("B point number: ");
        int bPoint = scannerB.nextInt();

        // Calculate the length between A and B points
        int abLength = bPoint - aPoint;

        //Display the length
        System.out.println("The length is: " + Math.abs(abLength));
    }
}