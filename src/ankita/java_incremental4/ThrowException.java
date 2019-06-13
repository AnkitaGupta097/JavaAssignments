package ankita.java_incremental4;

import java.lang.Exception;

/*
*
* Create three new types of exceptions. Write a class with a method that throws all three.
* In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
* Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

 */


//three new user defined exception
class NewException extends Exception{

NewException(String str)
{
    super(str);

}
NewException()
{

}

}
class NewExceptionTwo extends Exception{

    NewExceptionTwo(String str)
    {
        super(str);

    }
    NewExceptionTwo()
    {

    }

}
class NewExceptionThree extends Exception{

    NewExceptionThree(String str)
    {
        super(str);

    }
    NewExceptionThree()
    {

    }

}

//class having a method throwing all three types of exception

public class ThrowException
{
void method1(String st) throws NewException,NewExceptionTwo,NewExceptionThree
{

        if (st.equalsIgnoreCase("throw exception one")) {
            throw new NewException();
        } else if (st.equalsIgnoreCase("throw exception two")) {
            throw new NewExceptionTwo();
        } else if (st.equalsIgnoreCase("throw exception three")) {
            throw new NewExceptionThree();
        }



}


//main method handling all three types of exception by one catch block and excecuted finally block

    public static void main(String[] args) {

       ThrowException e=new ThrowException();
       try {
           e.method1("throw exception one");
       }
       catch (Exception exception)
       {
           System.out.println("handling exception");
       }
    finally
        {
            System.out.println("finally block excecuted");
        }
    }

        }