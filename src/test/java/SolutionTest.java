import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * filename:
 * project: solarDoomsday
 * author: https://github.com/vvmk
 * date: 2/17/18
 */
public class SolutionTest {
    @Test
    public void testSolution() {
        int in = 12;
        int[] expected = {9, 1, 1, 1};
        int[] actual = Solution.solarPanels(in);

        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testGetClosestSquare() {
        int expected = 4;
        int actual = Solution.getClosestSquareRoot(13);
        Assert.assertEquals(expected, actual);
    }
}
