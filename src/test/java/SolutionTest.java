import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {0,0,0,1,0,1,1,0};
        int k = 3;
        int expected = 3;
        int actual = new Solution().minKBitFlips(nums, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int[] nums = {1, 1};
        int k = 2;
        int expected = 0;
        int actual = new Solution().minKBitFlips(nums, k);

        Assert.assertEquals(expected, actual);
    }
}
