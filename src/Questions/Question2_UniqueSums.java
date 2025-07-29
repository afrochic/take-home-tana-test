package Questions;

import java.util.*;

public class Question2_UniqueSums {

    public static int countUniqueSums(List<Integer> numbers, int targetSum) {
        Set<List<Integer>> uniqueCombinations = new HashSet<>();
        Collections.sort(numbers);
        backtrack(0, new ArrayList<>(), numbers, targetSum, uniqueCombinations);
        return uniqueCombinations.size();
    }

    private static void backtrack(int index, List<Integer> current, List<Integer> nums, int remaining, Set<List<Integer>> combinations) {
        if (remaining == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num > remaining) continue;
            current.add(num);
            backtrack(i + 1, current, nums, remaining - num, combinations);
            current.remove(current.size() - 1);
        }
    }
}
