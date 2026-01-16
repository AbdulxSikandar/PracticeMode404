import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Starting Point for the Odd Numbers in the array: ");
        int start_point = sc.nextInt();
        if (start_point %2 == 0) {
            start_point += 1;  
        }
        int[] numbers = new int[size];
        
        sc.close();
        System.out.println("Odd Numbers in the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = start_point + 2*i;
        }
            
        for ( int num : numbers) {
            System.out.print(num + " ");
        }

    }
}