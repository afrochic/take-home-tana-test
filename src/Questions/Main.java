package Questions;
//library needed
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Question 1
        List<Character> validLetters = Arrays.asList('A', 'B', 'C', 'D');// allowed char only
        List<String> testStrings = Arrays.asList("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA");//from question values to be tested
        String resultQ1 = Question1_GetLongestString.findLongestValidString(validLetters, testStrings);//calls function that finds the longest valid list of  strings
        System.out.println("Question_1 → Longest valid string: " + resultQ1); //the output to be displayed

        // Question 2
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5);//create list of numbers
        int targetSum = 10;//target sum defined
        int countQ2 = Question2_UniqueSums.countUniqueSums(inputNumbers, targetSum);//call countuniquesums to find all unique combos that sum upto 10
        System.out.println("Question_2 → Combinations summing to " + targetSum + ": " + countQ2);//output to be displayed

        // Question 3
        int[] decrementArray = {1, 2, 3};//the array with int
        boolean canZero = Question3_DecrementToZero.minimumOperationsToZero(decrementArray);//calls method from the class question3
        System.out.println("Question_3 → Reducible to zero: " + (canZero ? "Yes" : "No"));//output to be displayed

        // Question 4
        List<String> productList = Arrays.asList("Apple", "Computer", "Apple", "Bag");//creates list of products
        String uniqueProduct = Question4_FirstUniqueProduct.findFirstUniqueProduct(productList);//calls the method in  Question 4
        System.out.println("Question_4 → First unique product: " + (uniqueProduct.isEmpty() ? "None" : uniqueProduct));//output to be displayed

        // Question 5
        List<Integer> numberList = Arrays.asList(1, 2, 3, 1, 4, 5, 2);
        int minDistance = Question5_MinDistanceBetweenMins.computeMinimumGapBetweenMinimums(numberList);//calls the method in  Question 5
        System.out.println("Question_5 → Minimum distance between repeating minimums: " + minDistance);//output to be displayed

        // Question 6
        String paragraph = "hi there care to discuss algorithm basis or how to solve algorithm or";
        List<String> commonWords = Question6_TopThreeCommonWords.getTopThreeFrequentWords(paragraph);//calls the method in  Question 6
        System.out.println("Question_6 → Top 3 frequent words: " + commonWords);//output to be displayed

// Question 7
        List<String> listToRotate = Arrays.asList("ID_A01", "ID_A02", "ID_A03", "ID_A04", "ID_A05", "ID_A06"); // example values
        int rotationSteps = 2;
        List<String> rotated = Question7_RotateListRight.rotateListToRight(listToRotate, rotationSteps); // calls the method in Question 7
        System.out.println("Question_7 → Rotated list: " + rotated); // output to be displayed
    }

}
