// # Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
import java.util.*;

public class containsDupllicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}