public class task_2 {
    public static void main(String[] args) {

        //Найти сумму цифр ab + cd числа abcd
        int given_number_abcd = 4321;
        int ab_number = given_number_abcd / 100;
        int cd_number = given_number_abcd % 100;
        int sum_ab_cd = ab_number + cd_number;

        System.out.println("The 'ab' number is: " + ab_number);
        System.out.println("The 'cd' number is: " + cd_number);
        System.out.println("The sum of " + ab_number + " and " + cd_number + " is: " + sum_ab_cd);
    }
}