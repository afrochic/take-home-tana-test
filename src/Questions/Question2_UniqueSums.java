package Questions;

import java.util.*;

public class Question2_UniqueSums {
    public static int countUniqueSums(List<Integer> numbers) {
        Set<Integer> uniqueSums = new HashSet<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                uniqueSums.add(numbers.get(i) + numbers.get(j));
            }
        }

        return uniqueSums.size();
    }
}
