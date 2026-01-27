## Exception Handling 

    Exception = an unexpected runtime problem that stops normal program flow.

    Examples:
        Divide by zero
        File not found
        Null object access
        Array index out of bounds


    Java has classes that are used to handle built in Exceptions and provision to create user defined exception.

    Exception handling is a mechanism to handle unwanted interruptions like exceptions and continue with normal flow of the program.

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }


    Java Exception Hierarchy:

    Object
    |
    Throwable
    |
    ├── Error (serious system issues)
    |
    └── Exception
            |
            ├── RuntimeException (Unchecked)
            |
            └── Checked Exceptions


    Error (don’t handle usually)
        Examples:
            OutOfMemoryError
            StackOverflowError
            VirtualMachineError

    Exceptions (compile-time)
        Must be handled or declared.
        Examples:
            IOException
            SQLException
            FileNotFoundException
            class not found exception
        
    Unchecked Exceptions (runtime)
        Not forced to handle.
        Examples:
            NullPointerException
            ArithmeticException
            NumberFormatException
            ArrayIndexOutOfBoundsException
            StringIndexOutOfBoundException


    ## How Programs Handle Exceptions :

        1️⃣ Try-Catch
        2️⃣ Try-Catch-Finally
        3️⃣ Throw & Throws
       
        try → risky code
        catch → handle problem
        finally → always runs (cleanup)

        
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Always executes");
        }


    Throw vs Throws : 
        throw (manually throw exception)
            throw new ArithmeticException("Invalid calculation");

        throws (declare exception)
            void readFile() throws IOException {
                FileReader f = new FileReader("abc.txt");
            }

        | throw             | throws              |
        | ----------------- | ------------------- |
        | Creates exception | Declares exception  |
        | Inside method     | In method signature |
        | One exception     | Multiple allowed    |


    ## Final vs Finally vs Finalize :
        • final variable → constant
        • final method → can’t override
        • final class → can’t extend

        finally (block) : Always executes (cleanup).
        finally {
            closeConnection();
        }

        finalize() (method) : Called by Garbage Collector before object destroyed.
        protected void finalize() {
            System.out.println("Object destroyed");
        }


    ## Custom Exceptions️ Exceptions (User-defined) :

        class InvalidAgeException extends Exception {
            InvalidAgeException(String msg){
                super(msg);
            }
        }

    ✔ Exception = runtime problem
    ✔ Throwable is root class
    ✔ Checked vs Unchecked
    ✔ try-catch-finally handles safely
    ✔ throw creates exception
    ✔ throws declares exception
    ✔ final ≠ finally ≠ finalize
    ✔ custom exceptions possible