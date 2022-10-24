import java.util.*;

public class SortingTest {
    public static void main(String[] args) {
        int[] nums = {34,65,62,61,70,80};
        BubbleSort bs = new BubbleSort();
        bs.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
