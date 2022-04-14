package algorithms.sort;

import org.junit.Assert;
import org.junit.Test;


public class SorterTest {

    @Test
    public void testSwap() {
        int[] testArray = {1,23,14};
        Assert.assertEquals(1,testArray[0]);
        Sorter.swap(testArray,0,1);
        Assert.assertNotEquals(1,testArray[0]);
        Assert.assertEquals(23,testArray[0]);
    }
}