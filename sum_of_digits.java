package google.interview;

public class sum_of_digits {
    static int sumOfDigits(int N) {
        int count=0;
        while(N>0)
        {
            int b=N%10;
            count+=b;
            N=N/10;
        }
        return count;
    }
}
