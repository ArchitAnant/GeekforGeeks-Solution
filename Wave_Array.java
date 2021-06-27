package google.interview;

public class Wave_Array {
    public static void convertToWave(int[] arr, int n){
        for (int i=1;i<n/2+1;i++){
            int k = i*2-1;
            int f = arr[k];
            arr[k] = arr[k-1];
            arr[k-1]=f;
        }
    }
}
