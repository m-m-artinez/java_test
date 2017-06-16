package solutions;

import static java.lang.Math.abs;

/**
 * Created by Mauricio Martinez on 6/15/2017.
 */
public class solution3 {

    public static int minDist (int[] A){
        if(A.length <= 1){
            return -2;
        }
        int minDist = 100000000;
        for(int i = 0; i <= A.length - 1; i++){
            for(int j = i+1; j <= A.length - 1; j++){
                if(areAdj(A, A[i], A[j])){
                    int distance = abs(A[i] - A[j]);
                    if(distance < minDist){
                     minDist = distance;
                    }
                }
            }
        }
        if(minDist == 100000000){
            return -1;
        } else return minDist;
    }

    public static boolean areAdj(int[] A, int i, int j){
        for(int x = 0; x < A.length - 1; x++){
            if(((i < A[x]) && (A[x] < j)) || ((i > A[x]) && (A[x] > j))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] B = {6, 11, 1};

        System.out.println(minDist(B));
    }
}
