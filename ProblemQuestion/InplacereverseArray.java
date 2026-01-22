package ProblemQuestion;

public class InplacereverseArray {
    public static void main(String[] args) {
        int [] arr = { 5,7,9,11,19,21,45};
        revaaray(arr);
    }

    public static void revaaray(int [] x){

        if (x == null || x.length <= 1) {
           throw new IllegalArgumentException("Array must not be empty");
        }
        int left = 0;
        int right = (x.length)-1;

        while (left < right){
            int temp = x[right];
            x[right] = x[left];
            x[left] = temp;
            left++;
            right--;
        }
        for(int a : x){
            System.out.print(a+" ");
        }
    }
}


/*
Loop runs n / 2 times
Each iteration is constant time
Time Complexity = O(n) 

Space Complexity = O(1) (Constant space)
left, right, temp variable 

*/