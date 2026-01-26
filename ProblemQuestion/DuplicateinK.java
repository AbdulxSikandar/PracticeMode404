package ProblemQuestion;

import java.util.Map;
import java.util.HashMap;

public class DuplicateinK {
    public static void main(String[] args) {
        int [] arr = {1, 2, 5,6,7,1, 1};
        int k = 3;
        System.out.println(checkDuplicatesWithinK(arr, k));
    }

    static boolean checkDuplicatesWithinK(int [] x, int distance){

        boolean status = false;
        Map <Integer,Integer> hs = new HashMap<>();
        for(int i=0; i<x.length;i++){
            if(hs.containsKey(x[i]) && i-hs.get(x[i])<=distance ){
                    status = true;
                    hs.put(x[i], i);
            }
            else{
                hs.put(x[i], i);
            }
        }
        return status;
    }
    
}

/*

Time : O(n)   ---> Single loop + hashmap:
Space : O(n)  ----> Worst case hashmap

// more Optimal space complexity
----->  HashSet sliding window (O(k) space)

*/



