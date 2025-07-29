package Questions;

import java.util.*;

public class Question6_TopThreeCommonWords {
    public static List<String> getTopThreeFrequentWords(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequency.entrySet().stream()
                .sorted((a, b) -> b.getValue().equals(a.getValue())
                        ? a.getKey().compareTo(b.getKey())
                        : b.getValue() - a.getValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }
}
