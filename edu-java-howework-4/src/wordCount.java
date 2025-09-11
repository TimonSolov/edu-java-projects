public class wordCount {

    public static int wordOccurrence(String textWithWord, String resWord) {

        if (textWithWord == null || textWithWord.isEmpty() || resWord == null || resWord.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while (index != -1) {
            index = textWithWord.indexOf(resWord, index);
            if (index != -1) {

                if (isWholeWord(textWithWord, index, resWord.length())) {
                    count++;
                }
                index += resWord.length();
            }
        }

        return count;
    }

    private static boolean isWholeWord(String textWithWord, int index, int wordLength) {

        if (index > 0 && Character.isLetterOrDigit(textWithWord.charAt(index - 1))) {
            return false;
        }

        return index + wordLength >= textWithWord.length() ||
                !Character.isLetterOrDigit(textWithWord.charAt(index + wordLength));
    }

}

