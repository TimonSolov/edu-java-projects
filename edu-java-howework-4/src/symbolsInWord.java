import java.util.Scanner;

public class symbolsInWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the word: ");

        String text = scanner.nextLine();

        if (text == null || text.trim().isEmpty()) {
            System.out.println("No word was typed!");
            return;
        }

        String[] words = text.split("\\s+");

        System.out.println("\nWord Analysis:");
        System.out.println("==============");

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");

            if (!cleanWord.isEmpty()) {
                analyzeWord(cleanWord);
            }

        }


    }
    public static void analyzeWord(String word) {
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        char middleChar;

        if (word.length() % 2 == 1) {
            middleChar = word.charAt(word.length() / 2);
        } else {
            middleChar = word.charAt((word.length() / 2) - 1);
        }

        System.out.printf("Word is: %-10s| First: '%c' | Middle: '%c' | Last: '%c'%n",
                word, firstChar, middleChar, lastChar);

    }
}