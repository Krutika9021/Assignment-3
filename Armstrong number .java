package armstrongno;

public class ArmstrongNo
{
    public static void main(String[] args)
    {
        int num = 153, original, remainder, result=0;
        original = num;
        while(original != 0)
        {
            remainder = original % 10;
            result += Math.pow(remainder, 3);
            original /= 10;
        }
        if (result == num)
            System.out.println(num + " is an armstrong number");
        else
            System.out.println(num + " is not armstrong number");
    }
    
}
