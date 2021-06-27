package google.interview;

import java.util.Arrays;

public class Largest_Element_in_a_array {
    public int largest(int[] arr, int n)
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
