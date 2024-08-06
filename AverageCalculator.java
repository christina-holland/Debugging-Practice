public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        /* Null Pointer Exception

        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

         */

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int sum = 0;
        /* Array Index Out of Bounds Exception

        for (int i = 0; i <= numbers.length; i++) {
        sum += numbers[i];
        }

        This is the incorrect condition

        Expected output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        Index 5 out of bounds for length 5

        */

        for (int number : numbers) {
            sum += number;
        }

        /* Logic Error

        return sum / numbers.length;

        The error is forgetting to set the sum as a double, so it will return an integer

        */

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        /* Test the null pointer exception

        int[] numbers = null;
        System.out.println("Average: " + calculateAverage(numbers));

        Expected output: Exception in thread "main" java.lang.IllegalArgumentException:
        Array cannot be null.

         */

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Average: " + calculateAverage(numbers)); //Expected output: 3.0
    }
}

/*
Fixing the Exceptions:

Null Pointer Exception - Placed a breakpoint at the line if (numbers == null), ran the debugger,
and saw the value of numbers when the exception was thrown (numbers was null).
Fixed it by adding appropriate checks to handle null values.

Array Index Out of Bounds Exception - Placed a breakpoint at the line sum += numbers[i], ran the debugger,
and saw the value of i when the exception is thrown (i goes out of bounds of the array).
Fixed it by changing the loop condition to i < numbers.length.

Logic Error - Placed a breakpoint at the line return sum / numbers.length, ran the debugger,
and saw the values of sum and numbers.length. Noticed that the result of sum / numbers.length was
an integer, not a double. Fixed it by setting the sum to be a double instead.

*/

