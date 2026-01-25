## Set : 

    A Set is a Collection that does NOT allow duplicate elements and usually does NOT maintain insertion order (depends on implementation).

    Key Properties:
        ✅ No duplicates
        ✅ Can have only one null (most implementations)
        ✅ Faster lookups than List (in many cases)
        ✅ Used when uniqueness matters

    📌 Set is an Interface

        public interface Set<E> extends Collection<E>

        Comparision :

        | Implementation | Order              | Speed       | Use case         |
        | -------------- | -----------------  | ---------    | --------------- |
        | HashSet        | ❌ No order        | ⚡ Fastest | General purpose  |
        | LinkedHashSet  | ✅ Insertion order | ⚡ Fast    | Ordered unique   |
        | TreeSet        | ✅ Sorted order    | 🐢 Slower  | Sorted data      |

       
        Code intialization : 
            Set<Integer> set = new HashSet<>();
            Set<Integer> set = new LinkedHashSet<>();
            Set<Integer> set = new TreeSet<>();

        
        Important Set Methods: 

        | Method      | Use        |
        | ----------- | ---------- |
        | add(e)      | Insert     |
        | remove(e)   | Delete     |
        | contains(e) | Search     |
        | size()      | Count      |
        | isEmpty()   | Check      |
        | clear()     | Remove all |

        
        | Collection | Stores      | Key Rule                   |
        | ---------- | ----------- | -------------------------- |
        | List       | Elements    | Allows duplicates, ordered |
        | Set        | Elements    | No duplicates              |
        | Map        | Key → Value | Keys unique                |
