import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(random.nextInt(100));
//        }
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
//        System.out.println("Type the day number: ");
//        Scanner scanner = new Scanner(System.in);
//        Map<Integer, String> weekdaysMap = new HashMap<>();
//        weekdaysMap.put(1, "Monday");
//        weekdaysMap.put(2, "Tuesday");
//        weekdaysMap.put(3, "Wednesday");
//        weekdaysMap.put(4, "Thursday");
//        weekdaysMap.put(5, "Friday");
//
//        String mappedDay;
//        do {
//            int scan = scanner.nextInt();
//            mappedDay = weekdaysMap.get(scan);
//            System.out.println(mappedDay);
//        } while (mappedDay != null);

//        List<Integer> list = new ArrayList<>();
//        for (int i = 10; i > 0; i--) {
//            list.add(i);
//            list.add(9);
//        }
//        System.out.println(list);
//        Set<Integer> set = new HashSet<>(list);
//        System.out.println(set);

//        int[] arr = new int[10];


//        int i;
//        for (i = 0; i < arr.length; i++) {
//
//            arr[i]      = i + 1;
//        }
//
//        System.out.println(Arrays.toString(arr));

        Scanner scan = new Scanner(System.in);
        int theNumber = (int) (Math.random() * 100 + 1);

        int userNumber;
        do {
            System.out.println("-----------------");
            System.out.println("Type your number: ");
            userNumber = scan.nextInt();
            if (userNumber > theNumber) {
                System.out.println("-----------------");
                System.out.println("Try lower number!!!");
            } else if (userNumber < theNumber) {
                System.out.println("-----------------");
                System.out.println("Try bigger number!!!");

            } else {
                System.out.println("-----------------");
                System.out.println("Congratulatuions! You guessed right!!!!");
                System.out.println("-----------------");
            }
        } while (userNumber != theNumber);
    }
}