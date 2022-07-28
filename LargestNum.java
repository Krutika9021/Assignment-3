package largestnum;

public class LargestNum 
{
    public static void main(String[] args) 
    {
        int n1 = 50, n2 = 70, n3 = 20;
        if(n1 > n2 && n1 > n3)
        {
            System.out.println("Largest Number is : " + n1);
        }
        else if(n2 > n1 && n2 > n3)
        {
            System.out.println("Largest Number is : " + n2);
        }
        else
        {
            System.out.println("Largest Number is : " + n3);
        }
      
    }
    
}
