package google.interview;

public class Play_With_OR {
    public static int[] game_with_number (int arr[], int n) {
        int l = arr.length;
        int[] a = new int[l];
        for(int i=1; i<l;i++){
            a[i-1] = arr[i-1]|arr[i];
        }
        a[l-1] = arr[l-1];
        return a;
    }
}
