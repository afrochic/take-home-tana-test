package Questions;// it is in a directory we need to add it here

import java.util.*;//library to be used

//Longest string using only allowed characters, without repeated letters
public class Question1_GetLongestString {//holds the logic of the q1 it is calls in the Main class
    public static String findLongestValidString(List<Character> allowedCharacters, List<String> inputStrings) {//static method allows passed inputs and returns longestvalidstring
        Set<Character> characterSet = new HashSet<>(allowedCharacters);// conversion of list to hashset 'it is faster the hashset in terms of time complexity'
        String longestString = "";//track longest legit string

        //loops through each string to check if it is valid using isValid method and if it's longer than current it becomes the new longestString
        for (String word : inputStrings) {
            if (isValid(word, characterSet) && word.length() > longestString.length()) {
                longestString = word;
            }
        }

        return longestString;
    }

    //a private method that checks if string is valid in terms of duplicate char and only allowed char
    private static boolean isValid(String word, Set<Character> allowedChars) {
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (!allowedChars.contains(current)) return false;
            if (i > 0 && word.charAt(i) == word.charAt(i - 1)) return false;
        }
        return true;
    }
}
