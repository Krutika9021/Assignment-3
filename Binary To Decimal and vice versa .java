package binarytodecimal;

public class BinaryToDecimal 
{
    public static void main(String[] args)
    {
        String binary = "01011011";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary : " + binary + "\ndecimal " + decimal);
        
        int dec= 18;
        String bin = Integer.toBinaryString(dec);
        System.out.println ("*******************************");
        System.out.println("Decimal " + dec + "\nBinary: " + bin );
    }   
}
