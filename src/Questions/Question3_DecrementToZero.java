package Questions;

public class Question3_DecrementToZero {

    public static boolean minimumOperationsToZero(int[] array) {
        int total = 0;
        for (int i = 1; i < array.length; i++) {
            total += array[i];
        }
        return total <= array[0];
    }
}
