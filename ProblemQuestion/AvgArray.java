package ProblemQuestion;

public class AvgArray {
    public static void main(String [] args){
        int [] sumArr = {12,41,78,25,13,5};

        int sum_of_arr = 0;
        for (int i : sumArr){
            sum_of_arr += i;
        }

        double avg_of_array = (double) sum_of_arr/sumArr.length;

        System.out.println("Avg of Array Elements : " + avg_of_array);
    }
    
}

