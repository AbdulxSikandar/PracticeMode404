package ProblemQuestion;

public class checkSortedArray {

    public static void main(String[] args) {
        int [] arr = {1,2,5,7,8,12,15};
        sortedcheck(arr);
        
    }

    public static void sortedcheck(int[] x){
        boolean sorted = true;
        if(x==null || x.length ==0){
            System.out.println("It's an Empaty array");
            return;
        }
        for(int i =0; i< x.length-1; i++){
            if(x[i]> x[i+1]){
                sorted = false;
                System.out.println("Array is not sorted");
                break;
            }
        }
        if (sorted) {
            System.out.println("Array is Sorted");
        }
    }
    
}


/*
Worst Case : if Entire array is sorted then Loop runs n-1 times --> time complexity: O(n)
Best Case : First comparison fails then Loop runs 1 times --> time complexity: O(1)
Average Case : if Entire array is sorted then Loop runs n-1 times --> time complexity: O(n)


Space Complexity : here i Used only one boolean variable & loop variable so O(1) (Constant space)

*/