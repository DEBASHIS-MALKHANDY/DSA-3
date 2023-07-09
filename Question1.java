/*
 * Question 1
Given an integer array nums of length n and an integer target, find three integers
in nums such that the sum is closest to the target.
Return the sum of the three integers.

You may assume that each input would have exactly one solution.
 */
package Assingnment3;

public class Question1 {
    public static void main(String[] args) {
        int [] numps={-1,2,1,-4};

        int target=1;
     int a=Solution(numps, target);
     System.out.println("the Value which is Closed to target is::"+Solution(numps, target));
   
    }
   public static int  Solution(int []numps,int target){
    for(int i=0;i<numps.length;i++){
        for(int j=i+1;j<numps.length;j++){
            for(int k=j+1;k<numps.length;k++){
                int sum=numps[i]+numps[j]+numps[k];
               // System.out.println("sums Are:"+sum);
                if(sum<=target)
                {
                   return sum;
                  }
                   
                    else if(sum>=target){
                        return sum;
                    }
                   
            }
        }
    }

    return 0;
   }
}
