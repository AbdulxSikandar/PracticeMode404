package ProblemQuestion;
public class SumArray {
    public static void main(String [] args){
        int [] sumArr = {12,41,78,25,13,5};

        int sum_of_arr = 0;
        for (int i : sumArr){
            sum_of_arr += i;
        }
        System.out.println("Sum of Array Elements : " + sum_of_arr);
    }
    
}
