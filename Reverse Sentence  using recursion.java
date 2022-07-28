package reversesentence;
import java.lang.String.*;

public class ReverseSentence 
{
    public static void main(String[] args) 
    {
        String s1 = "Government";
        String rev = rev(s1);
        System.out.println(" The reversed string is : " + rev);
    }
    public static String rev(String s1)
    {
        if (s1.isEmpty())
        return s1;
    
        return rev(s1.substring(1)) + s1.charAt(0);
    }
}
