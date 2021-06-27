package google.interview;

public class Sum_of_elements_in_a_matrix {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum = 0;
        for(int i = 0; i<N;i++){
            for(int k = 0; k<M; k++){
                sum += Grid[i][k];
            }
        }
        return sum;
    }
}
