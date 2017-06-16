package solutions;

import java.util.Arrays;

/**
 * Created by Mauricio Martinez on 6/15/2017.
 */
public class solution2 {
    public static int numSlice(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i+1; j <A.length - 1; j++) {
//                System.out.println(i+"-"+j+" - " + A.length);
//                System.out.println(Arrays.copyOfRange(A, i, j));
                int[] subArray = Arrays.copyOfRange(A, i, j+2);
                for(int x = 0; x < subArray.length; x++){
                    System.out.println(subArray[x]);
                }
                System.out.println("--");
                if (isArithmetic(subArray)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isArithmetic(int[] A) {
        int diff = A[0] - A[1];
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] - A[i + 1] != diff) {
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] B = {-1,1,3,3,3,2,1,0};

        System.out.println(numSlice(B));
    }
}