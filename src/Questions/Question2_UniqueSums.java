package Questions;

import java.util.*;

//Count unique combinations that sum up to the target
public class Question2_UniqueSums {

    public static int countUniqueSums(List<Integer> numbers, int targetSum) {//static method that passes List and targetSum returning countUniqueSums
        Set<List<Integer>> uniqueCombinations = new HashSet<>();//store all combinations that sum target set used to avoid duplicates
        Collections.sort(numbers);//sorts
        backtrack(0, new ArrayList<>(), numbers, targetSum, uniqueCombinations);//calls backtrack method to do recursive backtracking
        return uniqueCombinations.size();//return count of unique combos
    }

    //method to do recursive backtracking
    private static void backtrack(int index, List<Integer> current, List<Integer> nums, int remaining, Set<List<Integer>> combinations) {
       //if the sum of current meets target store combo and return
        if (remaining == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        //iternates through the rest ,if it is num> remaining skip add to current combo.Recurse to next index:each num can be used once
        for (int i = index; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num > remaining) continue;
            current.add(num);
            backtrack(i + 1, current, nums, remaining - num, combinations);
            current.remove(current.size() - 1);//remove last added number
        }
    }
}
