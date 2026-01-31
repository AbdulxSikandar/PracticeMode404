package LogicBuidingProblems;

public class FractionsAddition {
    public static void main(String[] args) {
        int [] x = {1,3};
        int [] y = {5,9};
        calculateFractionsaddition(x,y);
    }
    static void calculateFractionsaddition(int[] x, int[] y) {

        int denom1 = x[1];
        int denom2 = y[1];

        int lcm = (denom1 * denom2) / gcd(denom1, denom2);

        int numerator =
                x[0] * (lcm / denom1) +
                y[0] * (lcm / denom2);

        System.out.println(numerator + "/" + lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
