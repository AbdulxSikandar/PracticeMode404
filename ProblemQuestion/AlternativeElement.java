package ProblemQuestion;



public class AlternativeElement {
    public static void main(String[] args) {
        int [] a = { 1,5,9,11,78,5,42};
        printAlternateElements(a);
        
    }
    
    public static void printAlternateElements(int[] x){

        if(x == null || x.length == 0) {
           System.out.println("Nothing to print");
           return;
        }

        for(int i = 0;i< x.length;i+=2){
            System.out.print(x[i] + " ");
            }
    }
    
}


/*
Time Complexity : O(n)
Space Complexity : O(1)
*/