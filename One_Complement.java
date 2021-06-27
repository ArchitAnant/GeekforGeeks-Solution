package google.interview;

public class One_Complement {
    static String onesComplement(String S,int N){
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i<N;i++){
            if(S.charAt(i)=='1'){
                ans.append('0');
            }
            else{
                ans.append('1');
            }
        }
        return ans.toString();
    }
}
