//libraries needed for this code to work
import Questions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class QuestionsTests {

    @Test//indicates it is a test by junit @test is annotation
    //Question_1 : it tests the logic of question one and uses different values to test if it works
    public void testLongestValidString() {
        List<Character> allowed = Arrays.asList('a', 'b', 'c');//allowed char
        List<String> inputs = Arrays.asList("abc", "aabb", "ab", "bca", "cab");//list of strings here
        String result = Question1_GetLongestString.findLongestValidString(allowed, inputs);//call method that finds longestvalidstring
        System.out.println("Test Longest Valid String → Expected: abc, Got: " + result);
        assertEquals("abc", result);//checks if actual results from method = to expected output
    }

    @Test
    //Question_2 : it tests the logic of question two and uses different values to test if it works
    public void testCountOfUniqueSumsMatchingTarget() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);//list of int
        int targetSum = 8;//target sum should add up to 8
        int uniqueCount = Question2_UniqueSums.countUniqueSums(numbers, targetSum);//checks if actual results from method = to expected output
        System.out.println("Test Unique Sums → Expected: 2, Got: " + uniqueCount);
        assertEquals(2, uniqueCount);
    }

    @Test
    //Question_3 : it tests the logic of question three and uses different values to test if it works
    public void testCanReduceArrayToZero() {
        int[] inputArray = {10, 3, 2, 2, 1}; // input (Total = 8 <= 10)
        boolean result = Question3_DecrementToZero.minimumOperationsToZero(inputArray);//checks if actual results from method = to expected output
        System.out.println("Test Can Reduce to Zero → Expected: true, Got: " + result);
        assertTrue(result);
    }

    //continuation of Question_3
    @Test
    public void testCannotReduceArrayToZero() {
        int[] inputArray = {5, 3, 4}; // 3 + 4 = 7 > 5 → false
        boolean result = Question3_DecrementToZero.minimumOperationsToZero(inputArray);//checks if actual results from method = to expected output
        System.out.println("Test Cannot Reduce to Zero → Expected: false, Got: " + result);
        assertFalse(result);
    }

    @Test
    //Question_4 : it tests the logic of question four and uses different values to test if it works
    public void testFirstUniqueProduct() {
        List<String> items = Arrays.asList("pen", "pencil", "eraser", "pen", "pencil");// input for products
        String result = Question4_FirstUniqueProduct.findFirstUniqueProduct(items);//checks if actual results from method = to expected output
        System.out.println("Test First Unique Product → Expected: eraser, Got: " + result);//output
        assertEquals("eraser", result);
    }

    @Test
    //Question_5 : it tests the logic of question five and uses different values to test if it works
    public void testMinimumDistanceBetweenMinimums() {
        List<Integer> scores = Arrays.asList(4, 1, 3, 1, 5, 1);
        int gap = Question5_MinDistanceBetweenMins.computeMinimumGapBetweenMinimums(scores);//checks if actual results from method = to expected output
        System.out.println("Test Minimum Gap Between Mins → Expected: 2, Got: " + gap);
        assertEquals(2, gap);
    }

    @Test
    //Question_6 : it tests the logic of question six and uses different values to test if it works
    public void testTopThreeFrequentWords() {
        String paragraph = "apple banana apple banana orange apple banana";
        List<String> topWords = Question6_TopThreeCommonWords.getTopThreeFrequentWords(paragraph);//checks if actual results from method = to expected output
        System.out.println("Test Top 3 Frequent Words → Expected: [apple, banana, orange], Got: " + topWords);
        assertEquals(Arrays.asList("apple", "banana", "orange"), topWords);
    }

    @Test
    //Question_7 : it tests the logic of question seven and uses different values to test if it works
    public void testRotateListRight() {
        List<String> original = Arrays.asList("ID_A10", "ID_A20", "ID_A30", "ID_A40", "ID_A50");
        List<String> expected = Arrays.asList("ID_A40", "ID_A50", "ID_A10", "ID_A20", "ID_A30");

        List<String> rotated = Question7_RotateListRight.rotateListToRight(original, 2);

        System.out.println("Test Rotate List Right by 2 → Expected: " + expected + ", Got: " + rotated);
        assertEquals(expected, rotated);
    }

}
