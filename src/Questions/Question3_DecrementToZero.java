package Questions;

public class Question3_DecrementToZero {
    public static int minimumOperationsToZero(int number) {
        int operations = 0;

        while (number > 0) {
            number = (number % 2 == 0) ? number / 2 : number - 1;
            operations++;
        }

        return operations;
    }
}
