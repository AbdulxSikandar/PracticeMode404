package ArrayProblems;
import java.util.HashMap;

public class UniqueNumber{

    public static void main(String[] args){
        int[] arr = {1,2,1,2,3,5,6,5,6};
        uniqueamongDuplicate(arr);

    }

    static void uniqueamongDuplicate(int [] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int v = map.get(arr[i])+1;
                map.put(arr[i],v);
            }else{
                map.put(arr[i],1);
            }
           
        }
        for(Integer key : map.keySet()){
        if(map.get(key) == 1){
            System.out.println("Unique Number: " + key);
            }
        }
    }
}

/*
| Approach | Time | Space  |
| -------- | ---- | ------ |
| HashMap  | O(n) | O(n)   |
| XOR      | O(n) | O(1)   |
*/