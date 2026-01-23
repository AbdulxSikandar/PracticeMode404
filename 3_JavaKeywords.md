

## Final Keyword : 
    1. Final Variable :
        After initialization, cannot be modified or updated
        final int x = 5;

        If Try to modify then compile-time error
        final int x = 10;
        x = 20;   // ❌ Compile-time error

    2. Final Method : 
        Cannot be overridden by its subclass
        final  void display(){
            System.out.println("hello world");
        }

        If try to override the final method
        class Parent {
            final void show() {
                System.out.println("Parent show()");
            }
        }

        class Child extends Parent {
            @Override
            void show() {   // ❌ Compile-time error
                System.out.println("Child show()");
            }
        }

    3. Final Class : 
        Cannot be extended or inherited
        but we can modify/change the object of that class

        final class A { 

        }

        class B extends A {   
            // ❌ Compile-time error
        }
        
        -- Can we modify/change the object of a final class
        final class Person {
            int age;
        }

        Person p = new Person();
        p.age = 30;   // ✅ Allowed


## This Keyword : 
The this keyword refers to the current object and is used to access instance variables and methods. It cannot be used in static context.

    public class this_class {  
        int a = 5;
        int b = 10;
        public void greater( int x, int y){
                if (x > y){
                    this.a = x;
                    this.b = y
                    System.out.println("Greatest Number : " + x );
                }else{
                    System.out.println("Greatest Number : " + y );
                }
            }
    }

The this keyword is used to invoke methods of the current object (instance), not the class.
    
    class Test {
        void show() {
            System.out.println("Show method");
        }

        void display() {
            this.show();   // ✅ refers to current object
        }
    }


Used to invoke constructors of the current class

    class Test {
        Test() {
            this(10);   // ✅ calls parameterized constructor
            System.out.println("Default constructor");
        }

        Test(int x) {
            System.out.println("Parameterized constructor: " + x);
        }
    }

## Static Keyword : 
The static keyword in Java is used to create class-level members that can be accessed without creating an object and are shared among all instances of the class.

    Why is main() static? ---> ✔ JVM must call it without creating an object
    Can we override static methods? ---> NO (method hiding)
    Can we overload static methods? ---> ✔ YES

    | Restriction                        | Reason                 |
    | ---------------------------------- | ---------------------- |
    | Cannot access non-static variables | They belong to objects |
    | Cannot use `this` keyword          | No object reference    |
    | Cannot override static methods     | Method hiding happens  |

    Static Block : 
        - Used to initialize static variables
        - Executes only once when class is loaded
        - Runs before main()

        class Test {
            static int age;

            static {
                age = 23;
                System.out.println("Static block executed");
            }

            public static void main(String[] args) {
                System.out.println(age);
            }
        }

    Static Method (Class Method) : 

        - Can be called using class name
        - Can access only static data
        - Cannot use this or super

        class MathUtil {
            static int add(int a, int b) {
                return a + b;
            }
        }

        int sum = MathUtil.add(10, 20);


    The static can be:
        a. Variable (also known as a class variable): 
            if we declare a variable static, all objects of the class share the same static variable.
        b. Method (also known as a class method): 
            we can invoke static methods directly using the class name.
        c. Block: 
            static blocks are used to initialize the static variables.
            
            i. // static variable: static int age;
            ii. // static block: static {age =23; }
        
        d. Nested class


