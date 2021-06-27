package google.interview;

import java.util.*;

public class Java_1d_and_2d_Array {
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        for (int i =0;i<n;i++){
            for (int k=i;k<n;k++){
                sum += a[i][k];
                break;
            }
        }
        Arrays.sort(b);
        ans.add(sum);
        ans.add(b[b.length-1]);
        return ans;
    }
}
