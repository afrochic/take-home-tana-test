package Questions;

import java.util.*;
import java.util.stream.Collectors;

//Top three frequent words in text, sorted alphabetically
public class Question6_TopThreeCommonWords {
    public static List<String> getTopThreeFrequentWords(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();//empty map to store the frequency count of each word
        String[] words = text.toLowerCase().split("\\W+");//convert text to lowercase so as to count the word as the same

        //loop through word skip empty, increase if word exist if not place 1
        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        //convert map entries into stream for sorting(by frequency) and filtering
        return wordFrequency.entrySet().stream()
                .sorted((a, b) -> b.getValue().equals(a.getValue())
                        ? a.getKey().compareTo(b.getKey())
                        : b.getValue() - a.getValue())
                .limit(3)//top three entries after sorting
                .map(Map.Entry::getKey)//extract word
                .collect(Collectors.toList());//returns resulting stream as list

    }
}
