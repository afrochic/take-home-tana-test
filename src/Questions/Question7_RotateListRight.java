package Questions;

import java.util.*;

// Rotate a list of Strings to the right n times
public class Question7_RotateListRight {
    public static List<String> rotateListToRight(List<String> items, int steps) {
        int n = items.size(); // store size of list

        // check if list is empty or no effective rotation needed
        if (n == 0 || steps % n == 0) return items;

        steps %= n; // normalize steps
        List<String> rotated = new ArrayList<>(n); // list to hold rotated result

        rotated.addAll(items.subList(n - steps, n)); // add last 'steps' elements
        rotated.addAll(items.subList(0, n - steps)); // add remaining elements
        return rotated;
    }
}
