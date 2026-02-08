package LeetCode;

/*
Find the Pivot Integer ?

Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one 
pivot index for the given input.

Example 1:

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
*/
public class PivotInteger {

    public static void main(String[] args) {
        System.out.println(pivotInteger(9));
        System.out.println(twopointPivot(8));
    }
    public static int pivotInteger(int n) {
        if(n==1)return 1;
        int pivotpoint = 1;

        for (int i =2;i<n;i++){
            if((2*sumofn(pivotpoint))==sumofn(n)+pivotpoint){
                return pivotpoint;
            }
            pivotpoint++;
        }return -1;
    }   
    static int sumofn(int n){
        return (n*(n+1))/2;
    }

    static int twopointPivot(int n){
        if(n==1)return 1;

        int leftsum = 1;
        int rightsum =n;

        int leftpoint = 1;
        int rightpoint = n;

        while (leftpoint<rightpoint) {

            if(leftsum<rightsum){
                leftpoint++;
                leftsum +=leftpoint;
                
            }else{
                rightpoint--;
                rightsum +=rightpoint;
                
            }
        }
        return (leftsum==rightsum)?leftpoint:-1;
    }
}
