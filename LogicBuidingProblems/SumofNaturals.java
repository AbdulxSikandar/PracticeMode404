package LogicBuidingProblems;

public class SumofNaturals {
    public static void main(String[] args) {
        calculateSumofNaturalNumbers(20);
    }
    static void calculateSumofNaturalNumbers(int n){

        int sumofnaturalnumbers = (n *(n+1)/2);
        System.out.println("Sum of first n Natural Numbers :"+ sumofnaturalnumbers);
    }
}
