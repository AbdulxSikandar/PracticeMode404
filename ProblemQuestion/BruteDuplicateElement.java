package ProblemQuestion;

import java.util.HashMap;
import java.util.Map;

public class BruteDuplicateElement {
    public static void main(String[] args) {
        int [] arr = {1,2,5,4,6,7,2,5,7,3,4,9,7,10,7};
        BruteDuplicateElement br = new BruteDuplicateElement();
        br.duplicateElementinArray(arr);
    }

    public void duplicateElementinArray (int [] a){
        Map<Integer , Integer > duplicatecountermap = new HashMap<>();
        for (int i = 0; i < a.length; i++){
            
            if ( duplicatecountermap.containsKey(a[i])){
                duplicatecountermap.put(a[i], duplicatecountermap.get(a[i])+1);
            }else{
                duplicatecountermap.put(a[i], 1);
            }    
        }
        for (Integer key : duplicatecountermap.keySet()) {
            System.out.println("Key: " + key +
                       ", Value: " + duplicatecountermap.get(key));

        }
    }
}
