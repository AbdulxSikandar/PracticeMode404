package LogicBuidingProblems;

public class ClosestNumber {
    public static void main(String[] args) {
        findClosestNumber(-17, 6);
        System.out.println(findClosestNumber(-17, 6));
    }

    static int findClosestNumber(int n, int m)  {
        int q = n / m;
         
        // 1st possible closest number
        int n1 = m * q;
         
        // 2nd possible closest number
        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
         
        // if true, then n1 is the required closest number
        if (Math.abs(n - n1) < Math.abs(n - n2))
            return n1;
         
        // else n2 is the required closest number    
        return n2;    
    }

}
