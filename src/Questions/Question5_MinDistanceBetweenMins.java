package Questions;

import java.util.*;

public class Question5_MinDistanceBetweenMins {
    public static int computeMinimumGapBetweenMinimums(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) return -1;

        int minValue = Collections.min(numbers);
        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == minValue) {
                positions.add(i);
            }
        }

        int minGap = Integer.MAX_VALUE;
        for (int i = 1; i < positions.size(); i++) {
            minGap = Math.min(minGap, positions.get(i) - positions.get(i - 1));
        }

        return positions.size() < 2 ? -1 : minGap;
    }
}
