import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {

        // sorts in place
        // O(n^2)

        for (int i = 1; i < array.length; i++) { // start at 1, as we assume the first element in the array is already sorted.

            int numberToSort = array[i];
            int insertPosition = i;

            for (int j = i; j > 0 && array[i-1] > numberToSort; j--) { // start j at i, as we search from right to left in insertion sort.
                // stop when we reach the end of the array (furthest left element)
                // or when the number to the left of the number in i position is less than or equal to the number we want to sort

                if (array[j-1] > numberToSort) { // if the number at the start of the sorted partition is greater than the number we wish to sort

                    array[j] = array[j-1]; // shift that bigger number into the current j slot

                    insertPosition--; // decrement the position we want to insert too. Did this as I cant access j outside the scope of this for loop.
                }

            }

            array[insertPosition] = numberToSort;
        }

        return array;

    }

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
