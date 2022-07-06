import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int[][] arr = new int[a][b];

        int[][] transpose = new int[b][a];
        for(int i = 0; i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                transpose[j][i] = arr[i][j];
            }
        }
    }


}
