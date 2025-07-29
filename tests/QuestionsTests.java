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
        assertEquals("abc", result);
    }

    @Test
    public void testUniquePairwiseSums() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        int uniqueCount = Question2_UniqueSums.countUniqueSums(numbers);
        assertEquals(6, uniqueCount); // 1+3, 1+5, 1+7, 3+5, 3+7, 5+7
    }

    @Test
    public void testMinimumOperationsToZero() {
        int input = 14;
        int operations = Question3_DecrementToZero.minimumOperationsToZero(input);
        assertEquals(6, operations); // 14 -> 7 -> 6 -> 3 -> 2 -> 1 -> 0
    }

    @Test
    public void testFirstUniqueProduct() {
        List<String> items = Arrays.asList("pen", "pencil", "eraser", "pen", "pencil");
        String result = Question4_FirstUniqueProduct.findFirstUniqueProduct(items);
        assertEquals("eraser", result);
    }

    @Test
    public void testMinimumDistanceBetweenMinimums() {
        List<Integer> scores = Arrays.asList(4, 1, 3, 1, 5, 1);
        int gap = Question5_MinDistanceBetweenMins.computeMinimumGapBetweenMinimums(scores);
        assertEquals(2, gap);
    }

    @Test
    public void testTopThreeFrequentWords() {
        String paragraph = "apple banana apple banana orange apple banana";
        List<String> topWords = Question6_TopThreeCommonWords.getTopThreeFrequentWords(paragraph);
        assertEquals(Arrays.asList("apple", "banana", "orange"), topWords);
    }

    @Test
    public void testRotateListRight() {
        List<Integer> original = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expected = Arrays.asList(40, 50, 10, 20, 30);
        List<Integer> rotated = Question7_RotateListRight.rotateListToRight(original, 2);
        assertEquals(expected, rotated);
    }
}