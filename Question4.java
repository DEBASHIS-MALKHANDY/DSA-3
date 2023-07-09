package Assingnment3;
/*
 * Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in
order.

You must write an algorithm with O(log n) runtime complexity.
 */
public class Question4 {
    public static void main(String[] args) {
        int [] numps={1,3,5,6};
         int target=2; 

        int a= Solution.searchInsert(numps, target);

        System.out.println(a);
    }
   

    
}
class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}