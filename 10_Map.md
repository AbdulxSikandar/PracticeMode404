# Map
Map is an interface in java.util used to store data in key–value pairs.
    
    - Keys are unique
    - Values can be duplicate
    - One key maps to one value
    - Map is NOT part of the Collection interface

    Example :
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Apple");
    map.put(2, "Banana");
    map.put(3, "Mango");

    System.out.println(map.get(2)); // Banana


    Common Map Methods : 
        - put(k,v)	: Add key–value
        - get(k)	: Get value
        - remove(k) :	Delete entry
        - containsKey(k) :	Check key
        - containsValue(v) :	Check value
        - keySet() :	Get all keys
        - values() :	Get all values
        - entrySet() : Key–value pairs

        marks.put("Math", 85); // Updates value from 80 → 85
        marks.replace("Science", 78);   

        marks.put("English", marks.get("English") + 5);  //Increase value 
        marks.compute("Math", (k, v) -> v + 2);

        marks.put("Science", marks.get("Science") - 3);  // Decrease value
        marks.compute("Science", (k, v) -> v - 1);



    Hashmap Allows one null key and Allows multiple null values
    
    When to use Hashmap :
        - When order does NOT matter
        - When performance is important

    LinkedHashMap : 
        - Maintains insertion order
        - Internally uses HashMap + Doubly Linked List
        ✔ Maintains insertion order
        ✔ Allows one null key
        ✔ Slightly slower than HashMap
        
        Map<Integer, String> map = new LinkedHashMap<>();

        When to use LinkedHashMap :
            - When order matters
            - When predictable iteration is needed

    TreeMap : 
        Stores keys in sorted order
        Uses Red-Black Tree
        Sorting is natural or custom

        Map<Integer, String> map = new TreeMap<>();

        Key Points :
            ✔ Allows null values
            ✔ Sorted map
            ✔ Time complexity: O(log n)
            ❌ Does NOT allow null keys

        When to use?
            ✔ When sorted data is required
            ✔ When range queries are needed

    Comparison Table : 
        Feature	        HashMap	    LinkedHashMap	    TreeMap
        Order	        No	        Insertion	        Sorted
        Data Structure	Hash Table	Hash Table + DLL	Red-Black Tree
        Null Key	    ✔ One	    ✔ One	            ❌
        Null Values	       ✔	    ✔	                ✔
        Performance	    Fastest	    Medium	            Slowest
        Thread-safe	    ❌	        ❌	                ❌

    HashMap does not maintain order and offers O(1) performance, while TreeMap maintains sorted order with O(log n) complexity.
    Why TreeMap does not allow null key? -Because comparison is required for sorting, and null cannot be compared.
    Which Map maintains insertion order ? - LinkedHashMap
    Which Map is fastest? - HashMap

    Real-Life Example
        HashMap → User sessions
        LinkedHashMap → Recently viewed items
        TreeMap → Sorted reports, rankings