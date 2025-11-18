import java.util.Scanner;
import java.util.HashSet;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the text input from the user
        System.out.println("Please enter a paragraph or lengthy text:");
        String para = scanner.nextLine();

        // Calculate character count
        int charCount = para.length();
        System.out.println("Character Count: " + charCount);

        // Calculate word count by splitting at spaces
        String[] words = para.split(" ");
        int wordCount = words.length;
        System.out.println("Word Count: " + wordCount);

        // Find the most common character
        char[] letters = para.toCharArray();
        char mostCommon = letters[0];
        int maxCount = 0;

        for (int i = 0; i < letters.length; i++) {
            int currentCount = 0;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == letters[i]) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostCommon = letters[i];
            }
        }
        System.out.println("Most Common Character: " + mostCommon);

        // Calculate frequency of a specific character
        System.out.println("Please enter a character to count:");
        String inputChar = scanner.next();
        char searchChar = inputChar.charAt(0);

        int charFreqCount = 0;
        for (int i = 0; i < letters.length; i++) {
            if (Character.toLowerCase(letters[i]) == Character.toLowerCase(searchChar)) {
                charFreqCount++;
            }
        }
        System.out.println("Frequency of '" + searchChar + "': " + charFreqCount);

        // Calculate frequency of a specific word
        System.out.println("Please enter a word to count:");
        String searchWord = scanner.next();

        int wordFreqCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(searchWord)) {
                wordFreqCount++;
            }
        }
        System.out.println("Frequency of \"" + searchWord + "\": " + wordFreqCount);

        // Calculate unique words using a HashSet
        HashSet<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            uniqueWords.add(words[i].toLowerCase());
        }
        System.out.println("Number of unique words: " + uniqueWords.size());

        scanner.close();
    }
}
