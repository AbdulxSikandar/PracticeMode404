package ProblemQuestion;
import java.util.Map;
import java.util.HashMap;


public class UniqueElement {
    public static void main(String[] args) {
        int [] a = { 1,2,3,4,5,6,7,3,1,2,5,6,4,7,15,21};
        UniqueElement un = new UniqueElement();
        un.uniqueelementarray(a);
    }
    
    public void uniqueelementarray(int [] x){
        Map<Integer, Integer> m1 = new HashMap<>();
        for ( int arr : x) {
            if (m1.containsKey(arr)){
                m1.put(arr, m1.get(arr)+1);
            }else{

                m1.put(arr, 1);
            }
        }
        for(int b : m1.keySet() ){
            if(m1.get(b)>1){
                continue;
            }else{
                System.out.println("Here is the Unique element from Array");
                System.out.println( b + " ");
            }
        }
    }
}
