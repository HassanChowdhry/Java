public class IntegerToString
{

    /*
        Given an int num (e.g. 193), return it in String format ("193") WITHOUT USING BUILT-IN METHODS LIKE Integer.toString()
     */


    public static String intToString(int num)
    {

        if (num == 0)
        {
            return "0";
        }
        String s = "";
        while(num > 0) {
            int digit = num % 10;
            num /= 10;
            s = singleDigitIntToString(digit) + s  ;
        }

        return s;
    }

    public static String singleDigitIntToString(int num)
    {
        return num + "";
    }

    public static void main(String[] args)
    {
        int num = 193;
        int num1 = 0;
        int num2 = 9;
        int num3 = 26523623;
        System.out.println("Expected: " + num + " | Actual: " + intToString(num));
        System.out.println("Expected: " + num1 + " | Actual: " + intToString(num1));
        System.out.println("Expected: " + num2 + " | Actual: " + intToString(num2));
        System.out.println("Expected: " + num3 + " | Actual: " + intToString(num3));
    }

}
