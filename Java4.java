package java4;

public class Java4
{
    public static void main(String[] args) 
    {
        int x = 200, y = 100;
        
        System.out.println("Before swapping : ");
        System.out.println("First : " + x);
        System.out.println("Second : " + y);
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("After swapping");
        System.out.println("First : " + x);
        System.out.println("Second : " + y);    
    }
    
}
