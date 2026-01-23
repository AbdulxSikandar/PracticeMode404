# Array : 
    An array is a collection of similar data types stored in continuous memory locations and accessed using an index.

    ✔ Fixed size
    ✔ Zero-based index
    ✔ Stored as an object in heap memory

    int[] arr = {10, 20, 30, 40};
    System.out.println(arr[0]); // 10

    🔹Why Do We Need Arrays?
        Store multiple values using a single variable
        Fast access using index → O(1)
        Useful for sorting, searching, iteration


    🔹Types of Arrays in Java
        1️⃣ One-Dimensional Array (1D Array)
            Linear list of elements
                int[] numbers = new int[5];
                numbers[0] = 10;
                numbers[1] = 20;
                or
                int[] numbers = {10, 20, 30, 40};


        2️⃣ Two-Dimensional Array (2D Array)
            Array of arrays (Matrix form)
                int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6}
                };
                System.out.println(matrix[1][2]); // 6


        3️⃣ Multidimensional Array :
            More than two dimensions (rare in real projects)

                int[][][] data = new int[2][3][4];
                
                Used in:
                    Scientific calculations
                    3D games
                    Image processing

        4️⃣ Primitive Type Array
            Stores primitive values
                int[] a = {1, 2, 3};
                double[] b = {1.1, 2.2};
                char[] c = {'A', 'B'};


        5️⃣ Object (Reference) Array
                Stores references of objects
                Ex:
                
                class Student {
                    int id;
                    String name;
                }

                Student[] students = new Student[2];
                students[0] = new Student();

                String[] names = {"Alex", "John", "Sara"};


        🔹 Jagged Array
            ➡ 2D array with unequal columns  
            It is an array of arrays with different number of columns.
            Ex : 
            int[][] jagged = new int[3][];   //Columns are not fixed
            jagged[0] = new int[2];
            jagged[1] = new int[4];
            jagged[2] = new int[1];

            Row 0 → 2 elements
            Row 1 → 4 elements
            Row 2 → 1 element


        🔹 Anonymous Array: 
                An anonymous array is an array without a reference variable name.
                It is created and used at the same time, usually when passing an array directly to a method.
                It is used only once.

                Why Use Anonymous Arrays?
                ✔ When array is needed only once
                ✔ Cleaner code
                ✔ Avoids unnecessary variable declaration
                ✔ Common in method calls

                class Test {
                    static void sum(int[] arr) {
                        int total = 0;
                        for (int x : arr) {
                            total += x;
                        }
                        System.out.println(total);
                    }

                    public static void main(String[] args) {
                        sum(new int[] {1, 2, 3, 4});
                    }
                }

                ✔ No array variable declared
                ✔ Array used directly

                for (int x : new int[] {5, 10, 15}) {
                    System.out.println(x);
                }


    🔹Array Declaration :
        int[] a;    // Preferred
        int a[];    // Valid but not recommended

    🔹Array vs ArrayList : 
        | Feature           | Array    | ArrayList            |
        | ----------------- | -------- | -------------------- |
        | Size              | Fixed    | Dynamic              |
        | Performance       | Faster   | Slightly slower      |
        | Stores primitives | ✅ Yes   | ❌ No               |
        | Part of           | Language | Collection Framework |

    🔹Error : 
        Index out of range --> ArrayIndexOutOfBoundsException  
        Array reference is null --> NullPointerException

           
    🔹Array is an Object
        Stored in Heap memory
        Reference stored in Stack

    🔹Methods/properties:
        length : Variable/Property, NOT a method
            Tells number of elements in array and Fixed once array is created
            
            int[] arr = {10, 20, 30};
            System.out.println(arr.length); // 3
            arr.length(); // ❌ Compile-time error


    🔹Java arrays don’t have methods directly.
        We use java.util.Arrays utility class.      

        System.out.println(Arrays.toString(arr)); //Prints array in readable format
        Arrays.sort(arr); //Sorts array in ascending order   //Time Complexity: O(n log n)
        Arrays.binarySearch() //Search element in sorted array  --> int index = Arrays.binarySearch(arr, 30);
        Arrays.equals()   //Compares two arrays element by element  -->System.out.println(Arrays.equals(a, b));
        Arrays.copyOf()  //Creates new array with given size --> int[] a = {1, 2, 3};   int[] b = Arrays.copyOf(a, 5);
        Arrays.copyOfRange()  //Copy specific range ---> int[] b = Arrays.copyOfRange(a, 1, 3);
        Arrays.fill()  //Fill array with same value   ---> int[] a = new int[5];   Arrays.fill(a, 7);  //[7, 7, 7, 7, 7]
        Arrays.deepToString() //Prints 2D array in readable format