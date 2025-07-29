package Questions;

import java.util.*;

public class Question7_RotateListRight {
    public static List<Integer> rotateListToRight(List<Integer> numbers, int steps) {
        int n = numbers.size();
        if (n == 0 || steps % n == 0) return numbers;

        steps %= n;
        List<Integer> rotated = new ArrayList<>(n);
        rotated.addAll(numbers.subList(n - steps, n));
        rotated.addAll(numbers.subList(0, n - steps));
        return rotated;
    }
}
