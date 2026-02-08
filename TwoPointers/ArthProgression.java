package TwoPointers;



/*
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.

*/
public class ArthProgression {

    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    static boolean checkArthProgression(int [] arr){
        //Sorting the Arr
        int temp = 0;
        for (int a=0; a< arr.length; a++){
            for(int b = a+1;b<arr.length; b++ ){
                if(arr[b]< arr[a]){
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp; 
                }
            }
        }
        //Checking the Difference between Elements
        int difference = arr[1]-arr[0];
        for(int i =1;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])!= difference)
                return false;
            }
        return true;   
    }

    static boolean canMakeArithmeticProgression(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){

            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }

        }

        if(min == max) return true;

        if(((max-min)%(n-1))==0){
            return true;
        }else{
            return false;
        }
    }

    
    
}
