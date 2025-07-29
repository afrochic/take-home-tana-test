package Questions;

import java.util.*;

public class Question1_GetLongestString {
    public static String findLongestValidString(List<Character> allowedCharacters, List<String> inputStrings) {
        Set<Character> characterSet = new HashSet<>(allowedCharacters);
        String longestString = "";

        for (String word : inputStrings) {
            if (isValid(word, characterSet) && word.length() > longestString.length()) {
                longestString = word;
            }
        }

        return longestString;
    }

    private static boolean isValid(String word, Set<Character> allowedChars) {
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (!allowedChars.contains(current)) return false;
            if (i > 0 && word.charAt(i) == word.charAt(i - 1)) return false;
        }
        return true;
    }
}
