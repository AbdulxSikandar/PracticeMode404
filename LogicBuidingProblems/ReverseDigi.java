package LogicBuidingProblems;

public class ReverseDigi {
    public static void main(String[] args) {
        revnum(134);
    }
    static void revnum(int x){
        int rev = 0;
        while (x>0) {
            rev = rev*10 + x%10;
            x=x/10;            
        }
        System.out.println("Reverse Number : "+rev);
    }
    
}
