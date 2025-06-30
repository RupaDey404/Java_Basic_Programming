# Java_Basic_Programming
Java is an object oriented programming language. At first we learn about basic part of languages.

### for two number addition
```
public static void sumofTwoDigit(){
System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("enter the second number");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is: " + sum);
}
```

### command line argument--Its not clear
```
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
```
### swap program without using third variable
```
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
```

### swap program with bitwise operation.
```
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
```

### swap program with arithmatic operation
```
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
```

### Two Binary number addition
```
public static void addBinaryNum(){
        String num1, num2;
       System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.next();
        System.out.println("enter the second number");
        num2 = sc.next();
        int num11 = Integer.parseInt(num1,2);
        int num22 = Integer.parseInt(num2, 2);
        int sum = num11 + num22;
        String result = Integer.toBinaryString(sum);
       System.out.println("The sum is: " + result);

   }
```