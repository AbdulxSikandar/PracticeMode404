package ProblemQuestion;

import java.util.Scanner;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,5,7,9,11,15};
        System.out.println("Sum of 2 numbers from Array : ");
        int Sum = sc.nextInt();
        TwoSumProblem ts = new TwoSumProblem();
        ts.exactsumoftwo(arr, Sum);
    }
    
    public void exactsumoftwo(int [] a, int b){

        int sum = b;
        int x = 0;
        int y = a.length-1;
        while (x < y) {
            if((a[x]+a[y] == sum)){
                System.out.println( "These are the elements "+a[x]+", "+a[y]+" which has sum : "+sum);
                break;
            } else if((a[x]+a[y] < sum)){
                x ++; 
            }else if((a[x]+a[y] > sum)){
                y --;
            } else{
                System.out.println("Match this exact sum of two element is not possible");
            }
        }
    }
}
