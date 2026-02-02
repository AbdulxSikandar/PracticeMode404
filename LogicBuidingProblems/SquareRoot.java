package LogicBuidingProblems;

public class SquareRoot {

    public static void main(String[] args) {
        
        System.out.printf("%.3f",calculateSquareRoot(18));
    
    }
    

    static double calculateSquareRoot(int x) {

        double guess = x;

        for (int i = 0; i < 20; i++) {
            guess = (guess + x / guess) / 2;
        }

        return guess;
    }


    //Newton’s method
    /*
    static double calculateSquareRoot(int x){
        double guess = x;

            while (Math.abs(guess * guess - x) > 0.0000001) {
                guess = (guess + x / guess) / 2;
            }

            return guess;

    }        
*/

}
