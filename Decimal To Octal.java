package decimaltooctal;

public class DecimalToOctal
{
    public static void main(String[] args)
    {
        int decimal = 78;
        int octal = ConvertDecimalToOctal(decimal);
        System.out.println(decimal + " in decimal \n" + octal + " in octal");
    }
    public static int ConvertDecimalToOctal(int decimal)
    {
        int octal = 0, i=1;
        while(decimal != 0)
        {
            octal += (decimal % 8) * i;
            decimal = decimal / 8;
            i = i*10;
        }
        return octal;
    }
}
