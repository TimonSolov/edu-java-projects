public class hometask4 {
    public static void main(String[] args) {
        //Выведите первые 10 членов пследовательности Фибоначчи
        //Fn = Fn–2 + Fn–1, где F0=0, F1=1, а n — больше или равно 2 и является целым числом.
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int n = 10;
        int a = 0, b = 1;

        System.out.println("The first " + n + " Fibinachi numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int nextNumber = a + b;
            a = b;
            b = nextNumber;

        }
    }
}