package LogicBuidingProblems;

public class ValidTriangle {

    public static void main(String[] args) {
        System.out.println(checkValidity(2, 10,5));
    }

    static boolean checkValidity(int a, int b, int c){

        if(a+b>c && a+c>b && b+c>a){
            return true;
        }

        return false;
    }
    
}


/*
Time: O(1)
Space: O(1)
*/