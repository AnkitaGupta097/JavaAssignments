package ankita.java_incremental4;

import java.lang.Exception;

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