package ProblemQuestion;

public class MinMaxofArray {
    public static void main(String[] args) {
        int[] a = { 6,2,13,5,11,7,9,15};
        int [] p = {};
        MinMaxofArray mm = new MinMaxofArray();
        mm.minmax(a);
    }

    public void minmax(int [] a){

        //Handle Empty Array { throw exception or return after checking length if array is empty}
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
     
        int min = a[0];
        int max = a[0];

        for (int x : a){    
            if (x > max){
                max = x;
            }
            if ( x < min){
                min = x;
            }
        }
        System.out.println( "Min & Max :"+min + " "+max);
    }
}


/* 

Single Array iterated only once by checking all the elements 
So Time Complexity is O(n) in any case ( Best/ Worst/ Average)

Also Space Complexity is O(1) as we have just created to 2 variables to store the Min & max Value from Array

Only two variables: min, max
No extra arrays or data structures

 */