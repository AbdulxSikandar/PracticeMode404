package LogicBuidingProblems;

public class NthtermofAP {
    public static void main(String[] args) {
        calculatenthAPTerm(3,5,8);
    }
    static void calculatenthAPTerm( int x, int y, int n){
        int d = y-x;
        int nthTerm = x+(n-1)*d;

        System.out.println(nthTerm);

    }
}

/*
Time Complexity - O(1)
Auxiliary Space - O(1)
*/