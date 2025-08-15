# JavaBasics-Programmes

//Check a number is Armstrong or Not.

//import java.util.Scanner;
//public class armstrong
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter any positive integer: ");
//        int num = sc.nextInt();
//
//        int originalNum = num;
//        int digits = String.valueOf(num).length(); // Count digits
//        int sum = 0;
//
//        while (num > 0)
//        {
//            int digit = num % 10;
//            sum += Math.pow(digit, digits); // Raise digit to the power of total digits
//            num /= 10;
//        }
//
//        if (sum == originalNum)
//        {
//            System.out.println(originalNum + " is an Armstrong number.");
//        }
//        else
//        {
//            System.out.println(originalNum + " is NOT an Armstrong number.");
//        }
//    }
//}
