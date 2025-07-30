package Questions;

//Check if array can be zeroed (except first element) by decrement logic
public class Question3_DecrementToZero {

    public static boolean minimumOperationsToZero(int[] array) {//method that returns minimumoperationsto zero and passes an array consisting of integers
        int total = 0;//variable to store sum

        //a loop that sums all integers from index one to the end it skips index 0 because it will be decreased to 0
        for (int i = 1; i < array.length; i++) {
            total += array[i];
        }
        //returns true if total is < or = to first int
        return total <= array[0];
    }
}
