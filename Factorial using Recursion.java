package factrecursion;

public class FactRecursion 
{
    public static void main(String[] args)
    {
        int n=5;
        int factorial = multiplyNo(n);
        System.out.println("Fcatorial of " + n + " is : " + factorial);
    }
    public static int multiplyNo(int n)
    {
        if (n >= 1)
        {
            return n * multiplyNo(n-1);
        }
        else
        {
            return 1;
        }
    }  
}
