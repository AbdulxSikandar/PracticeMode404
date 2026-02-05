package LogicBuidingProblems;

//Given an integer values n and k, the task is to find the value of Binomial Coefficient C(n, k).

public class BinomialCoefficient {
    public static void main(String[] args) {

        System.out.println(calculateBinoCoeff(5, 2));
        
    }
    static int calculateBinoCoeff(int x, int y){
        
        return facto(x)/(facto(y)*facto(x-y));


    }

    static int facto(int a){
        int facto = 1;
        if(a==0 || a==1){
            return facto;
        }
        for(int i = 1; i<=a;i++){
            facto = facto*i;
        }
        return facto;
    }
}
