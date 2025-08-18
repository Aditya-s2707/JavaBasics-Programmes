//Check a Power of a number.

import java.util.Scanner;
public class power_of_number
{
    public static void main(String[] args)
    {
        int base,power;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of base");
        base=sc.nextInt();

        System.out.println("enter the value of power");
        power=sc.nextInt();

        double result=Math.pow(base,power);//Math.pow returns double value always
        System.out.println(result);






    }
}
