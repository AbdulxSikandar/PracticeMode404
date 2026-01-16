
public class DscArray {
    public static void main(String[] args) {
        int[] arr = {1,5,7,6,2,7,9,11,4,15,21,3,8,10};
        System.out.print("Original Array : ");
        for ( int i = 0; i < arr.length;i++ ){
            System.out.print(arr[i]+" ");
        }
        int temp = 0;
        for (int a=0; a< arr.length; a++){
            for(int b = a+1;b<arr.length; b++ ){
                if(arr[b]> arr[a]){
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp; 
                }
            }
        }
        System.out.println();
        System.out.print("Descending Array : ");
        for ( int i = 0; i < arr.length;i++ ){
            System.out.print(arr[i]+" ");
        }

    }
}
