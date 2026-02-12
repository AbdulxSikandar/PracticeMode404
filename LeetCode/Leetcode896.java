package LeetCode;
/*
Given an integer array nums, return true if the given array is monotonic, or false otherwise.
An array is monotonic if it is either monotone increasing or monotone decreasing.

*/
public class Leetcode896 {
    public static void main(String[] args) {
        int [] nums = { 1,2,2,3};
        System.out.println(isMonotonic(nums));
    }

    static boolean isMonotonic(int [] nums){
        int n = nums.length;
        boolean increaing = true;
        boolean decreasing = true;

        for( int i = 0; i<n-1; i++){
            if(nums[i+1] < nums[i]){
                increaing = false;
            }    

            if(nums[i+1] > nums[i]){
                decreasing = false;;
            }
        }    
        return increaing || decreasing;
    }
}
