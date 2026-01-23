
## Class 
A class in Java is a blueprint or template for creating objects. It is a fundamental component of the object-oriented programming (OOP) model, defining the structure and behavior that all objects of that class will share. 
Static, Final, Abstract, Concrete and Singleton Class.

    1. Concrete Class : 
    A normal class with full implementation.

    class Car {
        void run() {
            System.out.println("Car is running");
        }
    }

    2. Abstract Class : 
    A class declared using abstract keyword.
    ✔ Can have abstract & concrete methods
    ❌ Cannot create object directly
    ✔ Supports inheritance

    abstract class Vehicle {
        abstract void move();
    }

    3. Static Class : 
    Java does NOT allow a top-level static class
    Only nested (inner) classes can be static
    A static class in Java is a static nested class—a class defined inside another class using the static keyword.

    class Outer {
        static class Inner {
            void show() {
                System.out.println("Static Inner Class");
            }
        }
    }


    4. Final Class : 
    A class declared using final keyword.
       
        final class Constants {
            }
    ❌ Cannot be inherited
    ✔ Used for security
    ✔ Example: String


    5. Singleton Class :
    In object-oriented programming, a singleton class is a class
    that can have only one object (an instance of the class) at a
    time.
    ✔ Used in logging, config, DB connection
    class Singleton {
        private static Singleton obj = new Singleton();
        private Singleton() {}
        public static Singleton getInstance() {
            return obj;
        }
    }


## Object :
    In Java, an object is an instance of a class.

    Example

    | Real World       | Java      |
    | ---------------- | --------- |
    | Car              | Class     |
    | Red Car          | Object    |
    | Speed, Color     | Variables |
    | Drive(), Brake() | Methods   |

    # New keyword:
    ClassName obj = new ClassName();

