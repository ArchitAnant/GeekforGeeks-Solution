package google.interview;

public class Mean {
    static int mean(int N , int[] A) {
        int x = 0;
        for(int i = 0; i<N;i++){
            x += A[i];
        }
        int ans = x/N;

        return ans;
    }
}
