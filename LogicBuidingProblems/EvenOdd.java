package LogicBuidingProblems;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(78));
    }
    
    static boolean checkEvenOdd(int x){
        boolean status = false;
        if(x%2==0){
            status= true;
        }
        return status;
    }
}
