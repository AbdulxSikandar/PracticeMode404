package ProblemQuestion;

public class LeadersInArray {
    public static void main(String[] args) {
        int [] a = { 10,22,12,3,0,6};
        findleaders(a);
        
    }
    public static void findleaders(int [] x){

        if(x == null || x.length == 0){
            System.out.println("Array is null or empty");
            return;
        }
        int max = x[x.length-1];
        System.out.print(max + " ");
        for (int i = x.length-2;i >= 0;i--){
            if(x[i]> max){
                max = x[i];
                System.out.print( max+" ");
            }
        }
            
    }
}

/*
Time & Space Complexity
    Time: O(n)
    Space: O(1)
    Optimal

*/
