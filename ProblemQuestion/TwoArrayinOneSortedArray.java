package ProblemQuestion;
import java.util.ArrayList;

// Problem : Two Sorted Array in One Sorted Array
public class TwoArrayinOneSortedArray {
    public static void main(String[] args) {
        int [] a = { 1,2,4,9,11,13};
        int [] b = { 2,3,5,8,12,14,21};
        TwoArrayinOneSortedArray ts = new TwoArrayinOneSortedArray();
        ts.singleSortedArray(a,b);
    }

    public void singleSortedArray(int [] x, int [] y){

        ArrayList<Integer> newarr = new ArrayList<>();
        int p = 0; // point for x array
        int q = 0; // point for y array

        // Add elements of x & y by comparing 

        while(p <= x.length-1 && q <= y.length-1){
            if(x[p]< y[q]){
                newarr.add(x[p]);
                p++;
            }else if(x[p]> y[q]){
                newarr.add(y[q]);
                q++;
            }else{
                newarr.add(x[p]);
                newarr.add(y[q]); //Remove any of these lines and your duplicate elements will be removed from array
                p++;
                q++;
            }
        }
        // Add remaining elements of x
        while (p < x.length) {
            newarr.add(x[p]);
            p++;
        }

        // Add remaining elements of y
        while (q < y.length) {
            newarr.add(y[q]);
            q++;
        }

        for (int j : newarr){
            System.out.println(j);
        }
    }
    
}
