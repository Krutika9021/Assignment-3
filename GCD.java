package gcd;

public class GCD 
{
    public static void main(String[] args)
    {
        int i;
        int n1 = 15, n2 = 200;
        int gcd = 1;
        for( i = 1; i <= n1 && i <= n2; i++)
        {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is : " + gcd );
    }
    
}
