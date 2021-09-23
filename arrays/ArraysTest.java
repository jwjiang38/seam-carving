package arrays;

import lists.IntList;
import lists.IntListList;
import org.junit.Test;
import static org.junit.Assert.*;

/** FIXME
 *  @author Jingwei Jiang
 */

public class ArraysTest {
    /** FIXME
     */
    @Test
    public void testcatenate () {
        int[] A = new int[]{1,2,3};
        int[] B = new int[]{3};
        int[] C = new int[]{1,2,3,3};
        assertArrayEquals(C,Arrays.catenate(A,B));
        A = new int[]{};
        B = new int[]{3};
        C = new int[]{3};
        assertArrayEquals(C,Arrays.catenate(A,B));
        A = new int[]{2,1};
        B = new int[]{};
        C = new int[]{2,1};
        assertArrayEquals(C,Arrays.catenate(A,B));
    }
    @Test
    public void testremove () {
        int[] A = new int[]{1,2,3};
        int start = 0;
        int len = 2;
        int [] C = new int[]{3};
        assertArrayEquals(C,Arrays.remove(A,start,len));
        A = new int[]{1,2,3};
        start = 0;
        len = 0;
        C = new int[]{1,2,3};
        assertArrayEquals(C,Arrays.remove(A,start,len));
        A = new int[]{1,2,3};
        start = 2;
        len = 2;
       // int [] C = null;
        assertArrayEquals(null,Arrays.remove(A,start,len));
    }
    @Test
    public void testnaturalruns () {
        int[] A = new int[]{1,2,3,4,5};
        int [][] C = new int[][]{{1,2,3,4,5}};
        assertArrayEquals(C,Arrays.naturalRuns(A));
        A = new int[]{1,2,3,4,4};
        C = new int[][]{{1,2,3,4},{4}};
        assertArrayEquals(C,Arrays.naturalRuns(A));
        A = new int[]{1,1,1,3};
        C = new int[][]{{1},{1},{1,3}};
        assertArrayEquals(C,Arrays.naturalRuns(A));
    }

    public static void main(String[] args) {
        System.exit(ucb.junit.textui.runClasses(ArraysTest.class));
    }
}
