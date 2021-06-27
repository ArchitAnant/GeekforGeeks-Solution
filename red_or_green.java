package google.interview;

public class red_or_green {
    static int RedOrGreen(int N, String S) {
        int red = 0;
        int green = 0;
        for(int i = 0; i<N;i++){
            if(S.charAt(i)=='R'){
                red += 1;
            }
            else{
                green += 1;
            }
        }
        return Math.min(red,green);
    }
}
