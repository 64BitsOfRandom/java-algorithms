package algorithms.sort.exchange;

import algorithms.sort.Sorter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {
    private static Random random;
    private static final int TEST_ARRAY_SIZE = 10_000;

    private Sorter bubbleSorter;
    private int[] testArray;

    @BeforeClass
    public static void beforeClass() {
        random = new SecureRandom();
    }

    @Before
    public void setUp() {
        bubbleSorter = BubbleSort.getInstance();
        testArray = random.ints().limit(TEST_ARRAY_SIZE).toArray();
    }

    @Test
    public void testSort() {
        int[] testArrayCopy = Arrays.copyOf(testArray, testArray.length);
        //equals?
        Assert.assertArrayEquals(testArrayCopy, testArray);
        Arrays.sort(testArrayCopy);
        bubbleSorter.sort(testArray);
        //still equals!
        Assert.assertArrayEquals(testArrayCopy, testArray);
    }
}