public class task_2 {
    public static void main(String[] args) {

        //Найти сумму цифр ab + cd числа abcd
        int given_number_abcd = 4321;
        int abNumber = given_number_abcd / 100;
        int cdNumber = given_number_abcd % 100;
        int sumABCD = abNumber + cdNumber;

        System.out.println("The 'ab' number is: " + abNumber);
        System.out.println("The 'cd' number is: " + cdNumber);
        System.out.println("The sum of " + abNumber + " and " + cdNumber + " is: " + sumABCD);
    }
}