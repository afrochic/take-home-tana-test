package Questions;

import java.util.*;

//First product that appears only once
public class Question4_FirstUniqueProduct {
    public static String findFirstUniqueProduct(List<String> products) {//returns first unique produst from a list of products passesd into method
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();//create a linkedhashmap

        //loop that counts a product in the map if not use 0 then increment by 1 if condition met
        for (String product : products) {
            frequencyMap.put(product, frequencyMap.getOrDefault(product, 0) + 1);
        }

        //loop in a loop to check the value in a key appears once returning the value 'product name' if it is the first unique product.
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
//no unque product return empty string
        return "";
    }
}
