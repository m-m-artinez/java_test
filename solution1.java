package solutions;

import static java.lang.Math.abs;

/**
 * Created by Mauricio Martinez on 6/15/2017.
 */
public class solution1 {
    public static int maxDist (int[] A){
        int maxDist = 0;
        for(int i = 0; i <= A.length - 1; i++){
            for(int j = i+1; j <= A.length - 1; j++){
                if(areAdjAndNotEqual (A, A[i], A[j])){
                    int distance = abs(i - j);
                    if(distance > maxDist){
                        maxDist = distance;
                    }
                }
            }
        }
        return maxDist;
    }

    public static boolean areAdjAndNotEqual(int[] A, int i, int j){
        for(int x = 0; x < A.length - 1; x++){
            if(((i < A[x]) && (A[x] < j)) || ((i > A[x]) && (A[x] > j))){
                return false;
            }
            if(i == j){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] B = {1,4,7,3,5};

        System.out.println(maxDist(B));
    }
}
