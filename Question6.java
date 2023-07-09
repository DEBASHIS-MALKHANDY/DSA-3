package Assingnment3;

/*
 * Question 6
Given a non-empty array of integers nums, every element appears twice except
for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only
constant extra space.
 */

public class Question6 {
    
    public static void main(String[] args) {
        int [] a={2,2,1};
        //Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            int count=0;
            for(int j=0;j<a.length;j++){

                if(a[i]==a[j]){
                   count++;
                }
            }
            if(count==1){
                System.out.println(a[i]);
            }
        }
    }
}
