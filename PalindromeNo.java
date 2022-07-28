package palindromeno;

public class PalindromeNo 
{
    public static void main(String[] args)
    {
        int n=252, reverse=0, remainder;
        int original=n;
        
        while(n != 0)
        {
            remainder = n%10;
            reverse = reverse*10 + remainder;
            n = n/10;
        }
        if (original == reverse)
        {
            System.out.println(original + " is Palindrome");
        }
        else
        {
            System.out.println(original + " is not Palindrome ");
        }
              
    }
    
}
