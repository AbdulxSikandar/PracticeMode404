package ProblemQuestion;

public class SumofallSubArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        findsumofAllpossibleSubArrays(arr);
        findsumOfAllSubArray(arr);
        
    }
    
    static void findsumofAllpossibleSubArrays(int [] x){

        if(x == null || x.length == 0){
            return;
        }

        int sumOfSubarrays = 0;
        for(int i = 0; i<x.length;i++){
            int currentSum = 0;
            for(int j = i;j<x.length;j++){
                currentSum += x[j];
                sumOfSubarrays += currentSum;; 
            }
        }
        System.out.println("Sum of all possible sub arrays : "+sumOfSubarrays);
    }

    /*
    Time: O(n²)
    Space: O(1)
    */

    static void findsumOfAllSubArray(int []x){

        if(x == null || x.length == 0){
            return;
        }

        int n = x.length;
        int sum = 0;

        for( int i = 0; i<n ; i++){

            sum += (x[i]*(n-i)*(i+1));
        }

        System.out.println("Sum of all possible sub arrays : "+sum);
    }

}

