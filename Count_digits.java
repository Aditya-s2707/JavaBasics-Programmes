//Programme to count digits in a number.

import java.util.Scanner;
public class Count_digits
{
    public static void main(String[] args)
    {
        //Q.count digits in a number
        System.out.println("Enter a number");

    int n,count=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Number of digits is "+count);
    }
}
