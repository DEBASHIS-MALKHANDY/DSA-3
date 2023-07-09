package Assingnment3;
/*
 * Question 2
Given an array nums of n integers, return an array of all the unique quadruplets
[nums[a], nums[b], nums[c], nums[d]] such that:
           ● 0 <= a, b, c, d < n
           ● a, b, c, and d are distinct.
           ● nums[a] + nums[b] + nums[c] + nums[d] == target

 */


public class Question2 {
    public static void main(String[] args) {
        
        int target=0;
        int[] a={1,0,-1,0,-2,2};
        
        
        for (int i = 0; i < a.length-3; i++) {
           // System.out.println("hi"+(a[i]));
         for(int j=i+1;j<a.length-2;j++){
           // System.out.println("hallow"+a[j]);
            for(int k=j+1;k<a.length-1;k++){
              //  System.out.println("Sourav"+a[k]);

                for(int l=k+1;l<a.length;l++){
                   // System.out.println("Subhankar"+a[l]);

                    int sum=a[i]+a[j]+a[k]+a[l];
                   // System.out.println("Suradip::"+sum);
                    if(sum==target){
                        System.out.println("Sum::"+sum);
                        int [] ab={a[i],a[j],a[k],a[l]};
                        for (int m : ab) {
                            System.out.println("VAlus Are::["+m+"]");
                        }
                    }
                }
            }
         }
       
    }
}
}

