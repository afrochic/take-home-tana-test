package Questions;

import java.util.*;

public class Question4_FirstUniqueProduct {
    public static String findFirstUniqueProduct(List<String> products) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String product : products) {
            frequencyMap.put(product, frequencyMap.getOrDefault(product, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return "";
    }
}
