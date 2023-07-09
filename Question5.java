package Assingnment3;
/*
 * Question 5
You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any
leading 0's.

 */
public class Question5 {
    public static void main(String[] args) {
        Question5 q=new Question5();
        int []nums={1,2,3};
         int b[]=q.Solution(nums);
         for (int i : b) {
            System.out.println(i);
         }
    }
    int [] Solution(int[]nums){
        int []a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             a[i]=nums[i];
             if(i==nums.length-1){
                 a[i]=nums[i]+1;
             }
        }
        return a;
    }
}

