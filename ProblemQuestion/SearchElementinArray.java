package ProblemQuestion;
import java.util.Scanner;

public class SearchElementinArray {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] newarr = {1,5,2,4,6,8,7,3,9,12};
        int search_element = sc.nextInt();
        sc.close();
        boolean found = false;
        for (int i = 0; i < newarr.length; i++){
            if(newarr[i]==search_element){
                System.out.println("Element value :"+ newarr[i]);
                System.out.println("Element found at Index :"+ i);
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("Element not found in the array");
            }
    }
    
}
