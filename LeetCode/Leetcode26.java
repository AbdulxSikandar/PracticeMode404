package LeetCode;
import java.util.*;

/*
Remove duplicates from sorted array and return new length.
 */
public class Leetcode26 {
 
    public static void main(String[] args) {

        int [] arr = {1,2,2,3,3,3,4,4,5,6,7,8,8,8,9,10,11,12,12,12,12,13};
        removeDuplicatebySet(arr);
        removeDuplicatebyArraylist(arr);
        removeDuplicatebyTwoPointer(arr);
    }

    // Remove Duplicate by Set/Hashset/Tree Hashset or Linked Hashset

    static int removeDuplicatebySet(int[] arr){

        // If array doesn't have elements or have only a single element then return 0 & 1 accprdingly
        if (arr == null || arr.length == 0) return 0;
        if (arr.length==1)return 1;

        HashSet<Integer> uniqueElements = new HashSet<>();
        for(int i = 0; i<arr.length;i++){
            uniqueElements.add(arr[i]);
        }

        return uniqueElements.size();

    }

    // Remove Duplicate by Using New Arraylist

    static int removeDuplicatebyArraylist(int[] arr){
        
        // If array doesn't have elements or have only a single element then return 0 & 1 accprdingly

        if (arr == null || arr.length == 0) return 0;
        if (arr.length==1)return 1;

        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            if(uniqueElements.contains(arr[i])){
                continue;
            }else{
                uniqueElements.add(arr[i]);
            }
        }
        return uniqueElements.size();
    }

    /*
    removeDuplicatebyArraylist : 
            ❌ Very inefficient
            contains() → O(n) each time
            Whole method → O(n²)
    */

    static int removeDuplicatebyTwoPointer(int[] arr){

        // If array doesn't have elements or have only a single element then return 0 & 1 accprdingly

        if (arr == null || arr.length == 0) return 0;
        if (arr.length==1)return 1;

        //unique Element Pointer
        int i = 0;

        // Next Pointer to compare and Check duplicate 
        int j = i+1;

        while (j<arr.length) {

            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
       return (i+1);
    }
}


/*

| Method             | Time Complexity | Space Complexity | LeetCode Valid   |
| ------------------ | --------------- | ---------------- | --------------   |
| Set approach       | O(n)            | O(n)             | ❌              |
| ArrayList approach | O(n²)           | O(n)             | ❌              |
| Two pointer        | O(n)            | O(1)             | ✅              |




*/
