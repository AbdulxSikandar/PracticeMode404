# Parameter : 
    a parameter is a variable that is used to receive values when a method or constructor is called.
        Parameters are defined in the method declaration
        Values passed to parameters are called arguments

    public void add(int a, int b) {   // a and b are parameters
        System.out.println(a + b);
    }

    add(5, 10);   // 5 and 10 are arguments

    Types of Parameters in Java
        1️⃣ Formal Parameter
            Variables declared in the method definition
            Acts as a placeholder

            void display(int x) {          // x is a formal parameter
                System.out.println(x);
            }

        2️⃣ Actual Parameter (Argument)

            Values passed to the method during method call   
            
            display(10);   // 10 is an actual parameter

    
    ## Techniques/methods of parameter passing:

    👉 Important:
        ✅ Java supports ONLY Call by Value
        ❌ Java does NOT support Call by Reference

    1. Call by Value

        Definition:
        A copy of the variable’s value is passed to the method.
        Changes inside the method do NOT affect the original variable.

        Example : 
        public class Test {
            static void change(int x) {
                x = 50;
            }

            public static void main(String[] args) {
                int a = 10;
                change(a);
                System.out.println(a); // Output: 10
            }
        }

    2. Call by Reference (Conceptual)

        Definition:
        A reference (address) of the variable is passed.
        Changes inside the method DO affect the original variable.

        ❗ Java does NOT support this

        Example : 
        void change(int &x) {
            x = 50;
        }
    
    Java is strictly call by value.
    For primitive types, the value is copied.
    For objects, a copy of the reference is passed, allowing modification of object data but not the reference itself.

    | Feature                           | Call by Value      | Call by Reference  |
    | --------------------------------- | -----------------  | -----------------  |
    | What is passed                    | Copy of value      | Memory address     |
    | Primitive change affects caller   | ❌ No              | ✅ Yes             |
    | Object data change affects caller | ❌ No (value copy) | ✅ Yes             |
    | Java supports                     | ✅ Yes             | ❌ No              |
    | C++ supports                      | ✅ Yes             | ✅ Yes             |


    # Local & Instance variables have different - different memory location thats why call by value doesn't make any changes in instance variable value





# Binding in Java : 
    
    Binding is the process of linking a method call with its actual method implementation.

    In simple words:
    Which method will be executed when a method is called is called binding.

    🔹 Why Binding Is Important?

        ✔ Enables polymorphism
        ✔ Decides method execution at compile time or runtime
        ✔ Core concept of OOP

    ⭐ Types of Binding :

    Java has two types of binding:
        - Static Binding / Compile-time binding
        - Dynamic Binding / Runtime binding

    Static Binding (Compile-Time Binding) : 

        Binding that happens at compile time. The method call is resolved based on reference type, not object type.
        When Static Binding Happens?
            ✔ Method is static
            ✔ Method is final
            ✔ Method is private
            ✔ Method overloading

        class Parent {
            static void show() {
                System.out.println("Parent static");
            }
        }

        class Child extends Parent {
            static void show() {
                System.out.println("Child static");
            }
        }

        Parent p = new Child();
        p.show();    // Parent static



    Dynamic Binding (Runtime Binding) : 

        Binding that happens at runtime. The method call is resolved based on object type, not reference type.
        When Dynamic Binding Happens?
            ✔ Method is non-static
            ✔ Method is overridden

        class Parent {
            void show() {
                System.out.println("Parent instance");
            }
        }

        class Child extends Parent {
            @Override
            void show() {
                System.out.println("Child instance");
            }
        }
        
        Parent p = new Child();
        p.show();    // Child instance



        | Feature               | Static Binding         | Dynamic Binding             |
        | --------------------- | ---------------------- | --------------------------- |
        | Binding Time          | Compile time           | Runtime                     |
        | Decided by            | Reference type         | Object type                 |
        | Supports Polymorphism | ❌ No                  | ✔ Yes                       |
        | Method Types          | static, final, private | Overridden instance methods |
        | Performance           | Faster                 | Slightly slower             |


