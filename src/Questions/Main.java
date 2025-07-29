package Questions;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Question 1: Longest string using only allowed characters, without repeated letters
        List<Character> validLetters = Arrays.asList('A', 'B', 'C', 'D');
        List<String> testStrings = Arrays.asList("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA");
        String resultQ1 = Question1_GetLongestString.findLongestValidString(validLetters, testStrings);
        System.out.println("Q1 → Longest valid string: " + resultQ1);

        // Question 2: Count unique combinations that sum up to the target
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5);
        int targetSum = 10;
        int countQ2 = Question2_UniqueSums.countUniqueSums(inputNumbers, targetSum);
        System.out.println("Q2 → Combinations summing to " + targetSum + ": " + countQ2);

        // Question 3: Check if array can be zeroed (except first element) by decrement logic
        int[] decrementArray = {1, 2, 3};
        boolean canZero = Question3_DecrementToZero.minimumOperationsToZero(decrementArray);
        System.out.println("Q3 → Reducible to zero: " + (canZero ? "Yes" : "No"));

        // Question 4: First product that appears only once
        List<String> productList = Arrays.asList("Apple", "Computer", "Apple", "Bag");
        String uniqueProduct = Question4_FirstUniqueProduct.findFirstUniqueProduct(productList);
        System.out.println("Q4 → First unique product: " + (uniqueProduct.isEmpty() ? "None" : uniqueProduct));

        // Question 5: Closest distance between repeated minimum values
        List<Integer> numberList = Arrays.asList(1, 2, 3, 1, 4, 5, 2);
        int minDistance = Question5_MinDistanceBetweenMins.computeMinimumGapBetweenMinimums(numberList);
        System.out.println("Q5 → Minimum distance between repeating minimums: " + minDistance);

        // Question 6: Top three frequent words in text, sorted alphabetically
        String paragraph = "hi there care to discuss algorithm basis or how to solve algorithm or";
        List<String> commonWords = Question6_TopThreeCommonWords.getTopThreeFrequentWords(paragraph);
        System.out.println("Q6 → Top 3 frequent words: " + commonWords);

        // Question 7: Rotate a list to the right n times
        List<Integer> listToRotate = Arrays.asList(101, 102, 103, 104, 105, 106);  // example values
        int rotationSteps = 2;
        List<Integer> rotated = Question7_RotateListRight.rotateListToRight(listToRotate, rotationSteps);
        System.out.println("Q7 → Rotated list: " + rotated);
    }
}
