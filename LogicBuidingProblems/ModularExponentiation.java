package LogicBuidingProblems;
import java.lang.Math;
/*
Given three integers x, n, and M, compute (x^n) % M (remainder when x raised to the power n is divided by M).
*/
public class ModularExponentiation {
    public static void main(String[] args) {
        powerMod(3,2,4);
    }
    static void powerMod(int x, int n, int M){

        double power = (Math.pow(x,n))%M;

        System.out.println(power);
    }
}
