package LogicBuidingProblems;

public class TwoPointDistance {
    public static void main(String[] args) {
        distance(3, 4, 4, 3);

    }
    static void distance(double x1, double y1, double x2, double y2){
        
        double ydis = (y2 - y1); 
        double xdis = (x2 - x1 );

        double sumofSquars = ydis*ydis+xdis*xdis;

        double distance = Math.sqrt(sumofSquars);
        System.out.printf("Distance between given 2 Points : "+"%.4f", distance);
    }


}
