package ProblemQuestion;

import java.util.Scanner;


public class AreaofRectangle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();   // reads first input (length)
        int B = sc.nextInt();   // reads second input (breadth)

        sc.close();

        int area_of_rectangle = (L * B);
        System.out.println("Area of rectangle is : " +area_of_rectangle);
    }
}
