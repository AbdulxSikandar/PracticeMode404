public class DuplicateElement {
    public static void main( String[] args){
        int [] arr = {1,4,8,6,2,4,7,6,3,5};
        System.out.print("Duplicate Elements in given array: ");
        for (int i = 0;i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.print( arr[j] + " ");
                }
            }
        }
    }
    
}
