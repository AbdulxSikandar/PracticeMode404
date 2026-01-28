package LogicBuidingProblems;

public class OppositeFaceOfDice {
    public static void main(String[] args) {

        oppositeFaceOfDice(5);
        oppositeFace(3);
        
    }
    static void oppositeFaceOfDice(int x){
        switch (x) {
            case 1:
                System.out.println("Opposite Number : 6");
                break;
            case 2:
                System.out.println("Opposite Number : 5");
                break;
            case 3:
                System.out.println("Opposite Number : 4");
                break;
            case 4:
                System.out.println("Opposite Number : 3");
                break;
            case 5:
                System.out.println("Opposite Number : 2");
                break;
            case 6:
                System.out.println("Opposite Number : 1");
                break;
            default:
                break;
        }
    }

    static void oppositeFace(int x){

        System.out.println( "Opposite Number : " +(7-x));
    }
    
}
