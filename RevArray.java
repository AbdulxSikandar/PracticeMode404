import java.util.ArrayList;

public class RevArray {
    public static void main(String[] args) {
        int[] revarr = {4, 7, 9, 3, 2, 5, 6, 1, 2};
        ArrayList<Integer> newarr = new ArrayList<>();
        for (int i = revarr.length - 1; i >= 0; i--) {
            newarr.add(revarr[i]);
        }

        System.out.println("Original Array : ");
        for (int i = 0; i < revarr.length; i++) {
            System.out.print(revarr[i] + " ");
        }
        System.out.println();

        System.out.println("New Rev Array : ");
        for (int i = 0; i < newarr.size(); i++) {
            System.out.print(newarr.get(i) + " ");
        }
        System.out.println();
    }
}
