package LeetCode;

import java.util.Arrays;

public class PrefixSum {
   static int [] arr;
   static int[] prefix;

    public static void main(String[] args) {
        arr = new int[]{-1, 2, 3, 5, -5, 4, -2};

        prefix = Totalprexsum();

        System.out.println("Prefix Array: " + Arrays.toString(prefix));
        System.out.println("Prefix sum at index 3: " + prefixSumAtPoint(3));
        System.out.println("Range sum (2,5): " + prefixSumRange (2, 5));
    }
    
    public static int[] Totalprexsum() {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for(int i =1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        return prefixSum;
    }

    public static int prefixSumAtPoint(int x){
        return prefix[x];
    }

    public static int prefixSumRange (int left,int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}
