package LogicBuidingProblems;


//Given a number n, we need to print its table. 
public class MultiplicationTable {
    public static void main(String[] args) {
        
        printTable(5);
    }

    static void printTable ( int x){
        
        for (int i = 1; i<=10;i++){
            System.out.println(x + " x "+i+" = "+(x*i));
        }
    }
}
