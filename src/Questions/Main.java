package Questions;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Question 1: Longest Valid String
        List<Character> allowedCharacters = Arrays.asList('a', 'b', 'c');
        List<String> inputStrings = Arrays.asList("abc", "aabb", "ab", "bca", "cab");
        String longestValid = Question1_GetLongestString.findLongestValidString(allowedCharacters, inputStrings);
        System.out.println("Question 1 - Longest valid string: " + longestValid);

        // Question 2: Unique Sums
        List<Integer> inputNumbers = Arrays.asList(1, 3, 5, 7);
        int uniqueSumCount = Question2_UniqueSums.countUniqueSums(inputNumbers);
        System.out.println("Question 2 - Unique pairwise sums count: " + uniqueSumCount);

        // Question 3: Decrement to Zero
        int startValue = 14;
        int operations = Question3_DecrementToZero.minimumOperationsToZero(startValue);
        System.out.println("Question 3 - Operations to reduce " + startValue + " to zero: " + operations);

        // Question 4: First Unique Product
        List<String> productList = Arrays.asList("mouse", "keyboard", "monitor", "mouse", "keyboard", "tablet");
        String firstUnique = Question4_FirstUniqueProduct.findFirstUniqueProduct(productList);
        System.out.println("Question 4 - First unique product: " + firstUnique);

        // Question 5: Minimum Distance Between Minimums
        List<Integer> scoreList = Arrays.asList(5, 2, 3, 2, 6, 2);
        int minDistance = Question5_MinDistanceBetweenMins.computeMinimumGapBetweenMinimums(scoreList);
        System.out.println("Question 5 - Minimum gap between minimum values: " + minDistance);

        // Question 6: Top Three Common Words
        String paragraph = "The quick brown fox jumps over the lazy dog. The fox was quick and fast.";
        List<String> topWords = Question6_TopThreeCommonWords.getTopThreeFrequentWords(paragraph);
        System.out.println("Question 6 - Top 3 common words: " + topWords);

        // Question 7: Rotate List Right
        List<Integer> digits = Arrays.asList(10, 20, 30, 40, 50);
        int shiftCount = 2;
        List<Integer> rotated = Question7_RotateListRight.rotateListToRight(digits, shiftCount);
        System.out.println("Question 7 - Rotated list: " + rotated);
    }
}
