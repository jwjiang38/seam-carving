package lists;

import org.junit.Test;
import static org.junit.Assert.*;

/** FIXME
 *
 *  @author FIXME
 */

public class ListsTest {
    /** FIXME
     */

    // It might initially seem daunting to try to set up
    // IntListList expected.
    //
    // There is an easy way to get the IntListList that you want in just
    // few lines of code! Make note of the IntListList.list method that
    // takes as input a 2D array.
    @Test
    public void testLists() {
        /** Sample assert statement for comparing integers.

         assertEquals(0, 0); */
        int[][] A =new int[][]{{1,2,3},{2,3,4},{3,6}};
        int[] array = new int [] {1,2,3,2,3,4,3,6};
        assertEquals(IntListList.list(A),Lists.naturalRuns(IntList.list(array)));
        A =new int[][]{{1,2,3}};
        array = new int [] {1,2,3};
        assertEquals(IntListList.list(A),Lists.naturalRuns(IntList.list(array)));
        A =new int[][]{{3},{2},{1}};
        array = new int [] {3,2,1};
        assertEquals(IntListList.list(A),Lists.naturalRuns(IntList.list(array)));
        A =new int[][]{{0}};
        array = new int [] {0};
        assertEquals(IntListList.list(A),Lists.naturalRuns(IntList.list(array)));
        //assertEquals(0,CompoundInterest.numYears(2021));
    }
    public static void main(String[] args) {
        System.exit(ucb.junit.textui.runClasses(ListsTest.class));
    }
}
