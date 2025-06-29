package JavaProgrammingB2A;

import java.util.Scanner;

public class Test {
    //summation of two Number
    public static void sumofTwoDigit(){
        int num1,num2,sum =0;
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("enter the second number");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
    //command line argument--Its not clear
    public static void cmdLineArg(String[]args){

        if (args.length > 0) {
            System.out.println(
                    "The command line arguments are:");
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                    + "arguments found.");
    }
    //swap program with two variables
    public static void swapTwoNumber(){
        int num1,num2;
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("enter the second number");
        num2 = sc.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 -num2;

        System.out.println("Swapper numbers are :" + num1+ " " +num2);
    }

    public static void swapTwoNumerusingBitwise(){
        int num1,num2;
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("enter the second number");
        num2 = sc.nextInt();

        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("Swapper numbers are :" + num1+ " " +num2);
    }

    public static void swaptwoNumUsingArithmetaic(){
        int num1,num2;
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("enter the second number");
        num2 = sc.nextInt();
        num1 = (num1+num2) - (num2=num1);
        System.out.println("Swapper numbers are :" + num1+ " " +num2);
    }

    public static void main(String[] args) {
        //sumofTwoDigit();
         //cmdLineArg(args);
         swapTwoNumber();
        System.out.println("--------------");
         swapTwoNumerusingBitwise();
         System.out.println("--------------");
         swaptwoNumUsingArithmetaic();

//        System.out.println("Hello JavaProgrammingB2A");
    }
}
