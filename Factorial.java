// hello

public class Factorial
{
    public static Long pureRecursive(int n) throws IllegalArgumentException
    {
        long inputNumber = (long) n;
        long factorial = 0;

        if (n <= 0)
        {
            throw new IllegalArgumentException();
        }
        else if (n == 1)  // Base case.
        {
            factorial = inputNumber * 1;
        }
        else    // Recurrence relation.
        {
            factorial = inputNumber * pureRecursive(n-1);
        }

        return factorial;
    }

    // A kickoff method for tail recursion; it should call only the tail() method.
    public static long tailRecursive(int n) throws IllegalArgumentException
    {
        long inputNumber = (long) n;
        long factorial = 0;

        if (n <= 0)
        {
            throw new IllegalArgumentException();
        }

        factorial = tail(inputNumber, inputNumber -1);

        return factorial;
    }

    // A private method called by the tail recursion kickoff method. Parameters left
    // to student's discretion but the method may only be called from itself and
    // the kickoff method.
    private static long tail(long factorial, long n)
    {
        if (n <= 1) // Base case.
        {
            return factorial * 1;
        }

        // Recursive case.
        return tail(factorial*n, n -1);

    }

    // An iterative version of the factorial calculation. This method should be an 'unwound'
    // version of tailRecursive(). It should not call itself or any other method and
    // should calculate the factorial via looping control structure.
    public static long iterative(int n) throws IllegalArgumentException
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException();
        }

        int inputNumber = n;
        long factorial = (long) n;

        while (inputNumber > 1)
        {
            factorial = factorial * (long) (inputNumber - 1);
            inputNumber -= 1;
        }

        return factorial;
    }
}
