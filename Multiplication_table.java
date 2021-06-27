package google.interview;

public class Multiplication_table {
    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1;i<11;i++){
            ans.add(N*i);
        }
        return ans;
    }
}
