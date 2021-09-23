package arrays;

/* NOTE: The file Arrays/Utils.java contains some functions that may be useful
 * in testing your answers. */

/** HW #2 */

import java.util.ArrayList;

/** Array utilities.
 *  @author Jingwei Jiang
 */
class Arrays {

    /* C1. */
    /** Returns a new array consisting of the elements of A followed by the
     *  the elements of B. */
    static int[] catenate(int[] A, int[] B) {
        int [] C = new int[A.length+B.length];
        for (int i = 0;i < A.length; i++) {
            C[i] = A[i];
        }
        for (int j = 0;j < B.length; j++){
            C[j+A.length] = B[j];
        }
        return C;
    }

    /* C2. */
    /** Returns the array formed by removing LEN items from A,
     *  beginning with item #START. If the start + len is out of bounds for our array, you
     *  can return null.
     *  Example: if A is [0, 1, 2, 3] and start is 1 and len is 2, the
     *  result should be [0, 3]. */
    static int[] remove(int[] A, int start, int len) {
        if (start+len > A.length) return null;
        int [] C = new int[A.length-len];
        int j = 0;
        for (int i = 0;i < A.length; i++){
            if ((i < start)|(i >= start+len)){
                C[j] = A[i];
                j+=1;
            }
        }
        return C;
    }

    /* C3. */
    /** Returns the array of arrays formed by breaking up A into
     *  maximal ascending lists, without reordering.
     *  For example, if A is {1, 3, 7, 5, 4, 6, 9, 10}, then
     *  returns the three-element array
     *  {{1, 3, 7}, {5}, {4, 6, 9, 10}}. */
    static int[][] naturalRuns(int[] A) {
        ArrayList<int[]> outlist = new ArrayList<int[]>();
        int start = 0;
        if (A.length == 0) {
            int[][] out = new int[1][];
            out[0]=A;
            return out;
        }
        for (int i=1;i<A.length;i++){
            if (A[i]<=A[i-1]){
                int[] b = new int[i-start];
                System.arraycopy(A,start,b,0,i-start);
                outlist.add(b);
                start=i;
            }
        }
        int[] b = new int[A.length-start];
        System.arraycopy(A,start,b,0,A.length-start);
        outlist.add(b);
        int[][] out = new int[outlist.size()][];
        for (int i=0;i<outlist.size();i++){
            out[i]=outlist.get(i);
        }
        return out;
    }
}
