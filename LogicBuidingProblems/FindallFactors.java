package LogicBuidingProblems;

import java.util.ArrayList;

public class FindallFactors {
    public static void main(String[] args) {
        checkallfactors(100);
        
    }
    
    static void checkallfactors(int x){
        //int [] arr = new int[5];                        //Fixed Size Array      Arr[0]    
        ArrayList<Integer> arr = new ArrayList<>();      // Dynamic Arraylist     Arraylist.add()  
        for (int i =1; i<=x;i++){
            if(x%i==0){
                arr.add(i);
            }
            
        }
        for(int j : arr){
            System.out.print(j+" ");
        }
    }
}
