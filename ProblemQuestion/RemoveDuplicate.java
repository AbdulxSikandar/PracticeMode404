package ProblemQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

// Remove duplicates from Sorted Array
public class RemoveDuplicate {

public static void main(String[] args) {
    int[] arr = {  1,2,2,3,4,5,9,9,10,11,11,13,15,15,16};
    removeDuplicatesUsingSet(arr);
    removeDuplicateTwoPointer(arr);
}

public static void removeDuplicatesUsingSet(int[]x){

    if(x==null || x.length == 0){
        System.out.println("Array is null");
        return;
    }

    Set<Integer> uniqueelements = new LinkedHashSet<>();
    for(int i = 0; i<x.length;i++){
        uniqueelements.add(x[i]);
    }
    System.out.println("Number of Unique Elements in Array :");
    System.out.println(uniqueelements.size());
    System.out.println( "Unique Elements in Array : ");
    for(int p:uniqueelements){
        System.out.print(p+" ");
    }

}

/*

| Metric | Value |
| ------ | ----- |
| Time   | O(n)  |
| Space  | O(n)  |

*/

public static void removeDuplicateTwoPointer(int[]x){
    
    if(x==null || x.length == 0){
        System.out.println("Array is null");
        return;
    }

    int i = 0;
    for(int j = i+1;j<x.length;j++){
        if(x[j]!= x[i]){
            x[i+1]=x[j];
            i++;
        }
    }
    System.out.println("");
    System.out.println("Number of Unique Elements in Array :"+(i+1));
}

}

/*
| Metric | Value  |
| ------ | ------ |
| Time   | O(n)   |
| Space  | O(1)   |

*/