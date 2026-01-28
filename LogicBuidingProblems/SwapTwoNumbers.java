package LogicBuidingProblems;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        numberSwaping(15, 24);
        xorNumberSwaping(175, 234);
    }
    static void numberSwaping(int x, int y){

        System.out.println( "Numbers Before Swaping : "+"x : "+x+", y : "+y);
        int temp = x;
        x = y;
        y = temp;

        System.out.println( "Numbers After Swaping : "+"x : "+x+", y : "+y);
    }

    static void xorNumberSwaping(int x, int y){

        System.out.println( "Numbers Before Swaping : "+"x : "+x+", y : "+y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println( "Numbers After Swaping : "+"x : "+x+", y : "+y);
    }
}
