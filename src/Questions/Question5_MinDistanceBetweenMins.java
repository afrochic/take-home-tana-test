package Questions;

import java.util.*;

//Closest distance between repeated minimum values
public class Question5_MinDistanceBetweenMins {
    public static int computeMinimumGapBetweenMinimums(List<Integer> numbers) {//method that returns minmumgapbetweenminimums and passes a list of numbers
        //check if numbers id null has less than 2 elements
        if (numbers == null || numbers.size() < 2) return -1;

        int minValue = Collections.min(numbers);//find min value in list
        List<Integer> positions = new ArrayList<>();//new list to store index where min is located.

        //loop each index in list if value is = to min value store it in new list
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == minValue) {
                positions.add(i);
            }
        }

        int minGap = Integer.MAX_VALUE;//takes max value
        //loop postion list from index 1.Get difference betweem two postions next to each other then update mingap with smallest gap
        for (int i = 1; i < positions.size(); i++) {
            minGap = Math.min(minGap, positions.get(i) - positions.get(i - 1));
        }

        //if there < 2 occurence of min return -1 else minmumgapbetweenminmums
        return positions.size() < 2 ? -1 : minGap;
    }
}
