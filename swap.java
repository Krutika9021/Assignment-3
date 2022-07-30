package swap;

public class swap
{
    public static void main (String args[])
    {
        int first = 45, second = 50;
        
        System.out.println("Before swap = ");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
        int temp = first;
        first = second;
        second = temp;
        
        System.out.println("After swap = ");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
    }
}
