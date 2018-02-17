import org.junit.Assert;
import org.junit.Test;

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
        int[] out = {9, 1, 1, 1};
        String expected = out.toString();
        String actual = Solution.solarPanels(in).toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClosestRoot() {
        int expected = 9;
        int actual = Solution.getHighestContainedSquare(12);
        Assert.assertEquals(expected, actual);
    }
}
