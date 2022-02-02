//class Solution
class Return_two_prime_number{
    static List<Integer> primeDivision(int N){
        List<Integer> ans = new ArrayList<>();
        for (int i=2;i<N;i++){
            if (!prime(i)){
                if (!prime(N-i)){
                    ans.add(i);
                    ans.add(N-i);
                    break;
                }
            }
        }
        return ans;
    }
    static boolean prime(int N){
        boolean flag = false;
        for (int i=2;i<(int)(N/2);i++){
            if (N%i==0){
                flag=true;
                break;
            }
        }
        return flag;
    }
}