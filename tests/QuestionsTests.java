import Questions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class QuestionsTests {

    @Test
    public void testLongestValidString() {
        List<Character> allowed = Arrays.asList('a', 'b', 'c');
        List<String> inputs = Arrays.asList("abc", "aabb", "ab", "bca", "cab");
        String result = Question1_GetLongestString.findLongestValidString(allowed, inputs);
        System.out.println("Test Longest Valid String → Expected: abc, Got: " + result);
        assertEquals("abc", result);
    }

    @Test
    public void testCountOfUniqueSumsMatchingTarget() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        int targetSum = 8;
        int uniqueCount = Question2_UniqueSums.countUniqueSums(numbers, targetSum);
        System.out.println("Test Unique Sums → Expected: 2, Got: " + uniqueCount);
        assertEquals(2, uniqueCount); // [1+7], [3+5]
    }

    @Test
    public void testCanReduceArrayToZero() {
        int[] inputArray = {10, 3, 2, 2, 1}; // Total = 8 <= 10
        boolean result = Question3_DecrementToZero.minimumOperationsToZero(inputArray);
        System.out.println("Test Can Reduce to Zero → Expected: true, Got: " + result);
        assertTrue(result);
    }

    @Test
    public void testCannotReduceArrayToZero() {
        int[] inputArray = {5, 3, 4}; // 3 + 4 = 7 > 5 → false
        boolean result = Question3_DecrementToZero.minimumOperationsToZero(inputArray);
        System.out.println("Test Cannot Reduce to Zero → Expected: false, Got: " + result);
        assertFalse(result);
    }

    @Test
    public void testFirstUniqueProduct() {
        List<String> items = Arrays.asList("pen", "pencil", "eraser", "pen", "pencil");
        String result = Question4_FirstUniqueProduct.findFirstUniqueProduct(items);
        System.out.println("Test First Unique Product → Expected: eraser, Got: " + result);
        assertEquals("eraser", result);
    }

    @Test
    public void testMinimumDistanceBetweenMinimums() {
        List<Integer> scores = Arrays.asList(4, 1, 3, 1, 5, 1);
        int gap = Question5_MinDistanceBetweenMins.computeMinimumGapBetweenMinimums(scores);
        System.out.println("Test Minimum Gap Between Mins → Expected: 2, Got: " + gap);
        assertEquals(2, gap);
    }

    @Test
    public void testTopThreeFrequentWords() {
        String paragraph = "apple banana apple banana orange apple banana";
        List<String> topWords = Question6_TopThreeCommonWords.getTopThreeFrequentWords(paragraph);
        System.out.println("Test Top 3 Frequent Words → Expected: [apple, banana, orange], Got: " + topWords);
        assertEquals(Arrays.asList("apple", "banana", "orange"), topWords);
    }

    @Test
    public void testRotateListRight() {
        List<Integer> original = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expected = Arrays.asList(40, 50, 10, 20, 30);
        List<Integer> rotated = Question7_RotateListRight.rotateListToRight(original, 2);
        System.out.println("Test Rotate List Right by 2 → Expected: " + expected + ", Got: " + rotated);
        assertEquals(expected, rotated);
    }
}
