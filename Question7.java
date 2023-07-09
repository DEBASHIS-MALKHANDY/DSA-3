package Assingnment3;
/*
 * Question 7
You are given an inclusive range [lower, upper] and a sorted unique integer array
nums, where all elements are within the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in
nums.

Return the shortest sorted list of ranges that exactly covers all the missing
numbers. That is, no element of nums is included in any of the ranges, and each
missing number is covered by one of the ranges.
 */
import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {
        int [] num={0,1,3,50,75};
        int lower=0;
        int upper=99;
       ;
       System.out.println(Soolution.findMissingRanges(num, lower, upper));
    }
}
class Soolution {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int n = nums.length;
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add(f(lower, upper));
            return ans;
        }
        if (nums[0] > lower) {
            ans.add(f(lower, nums[0] - 1));
        }
        for (int i = 1; i < n; ++i) {
            int a = nums[i - 1], b = nums[i];
            if (b - a > 1) {
                ans.add(f(a + 1, b - 1));
            }
        }
        if (nums[n - 1] < upper) {
            ans.add(f(nums[n - 1] + 1, upper));
        }
        return ans;
    }

    public static String f(int a, int b) {
        return a == b ? a + "" : a + "->" + b;
    }
}
