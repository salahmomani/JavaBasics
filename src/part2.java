import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/// ///////////////////////////Squared//////////////////
//        int sqr=in.nextInt();
//        System.out.println(sqr*sqr);

        /// /////////////////Square root of sum////////////////
//        int num1=in.nextInt();
//        int num2=in.nextInt();
//        int sum=num1+num2;
//        System.out.println(Math.sqrt(sum));
//

        /////// ///////////////////////Absolute Value//////////////////////////
//    int abs=in.nextInt();
//        System.out.println(Math.abs(abs));

/// /////////////////////////////////////Comparing Numbers////////////////////

//        int num1=in.nextInt();
//        int num2=in.nextInt();
//
//        if(num1>num2)
//        {
//
//            System.out.println(num1+" is greater than "+num2);
//        } else if (num2>num1) {
//            System.out.println(num1+" is smaller than "+num2);
//
//        }
//        else {
//            System.out.println(num1+" is equal to"+num2);
//        }



//        /// ////////////////////Carry on?/////////////////
//while (true)
//{
//    System.out.println("Shall we carry on?");
//    String carry= in.nextLine();
//    if(carry.equals("No"))
//    {break;}
//
//}


        /// /////////////////////Are we there yet?////////////////
//while (true)
//{
//    System.out.println("Give a number:");
//    int val= in.nextInt();
//    if(val==4)
//    {break;}
//
//}


///// //////////////////////////Only positives/////////////////////
//while (true)
//{
//    System.out.println("Give a number:");
//    int num= in.nextInt();
//    if(num==0)
//    {break;}
//    else if (num<0) {
//        System.out.println("Unsuitable number");
//    }
//    else {
//        System.out.println(Math.pow(num,2));
//    }
//
//}
/// ////////////////////Number of Numbers////////////////
//
//int count=0;
//
//while (true){
//    System.out.println("Give a number:");
//    int num= in.nextInt();
//    if (num==0)
//    {break;}
//    else {count++;}
//
//}
//        System.out.println("Number of numbers: "+count);


 ////////////////////////Number of negative numbers///////////////
//        int count=0;
//
//        while (true){
//    System.out.println("Give a number:");
//    int num= in.nextInt();
//    if (num==0)
//    {break;}
//    else if (num<0) {
//        count++;
//    }
//
//}
//        System.out.println("Number of numbers: "+count);
/// /////////////////////////////////////////Sum of Numbers///////////////////////

///////////////////////Number of negative numbers///////////////
//        int sum=0;
//
//        while (true){
//    System.out.println("Give a number:");
//    int num= in.nextInt();
//    if (num==0)
//    {break;}
//    else{
//        sum+=num;
//    }
//
//}
//        System.out.println("Sum of the numbers:  "+sum);

/// /////////////////Number and sum of numbers////////////////////
//    int sum=0;
//    int count=0;
//         while (true){
//    System.out.println("Give a number:");
//    int num= in.nextInt();
//    if (num==0)
//    {break;}
//    else{
//        sum+=num;
//        count++;
//    }
//
//}
//        System.out.println("Number of numbers: :  "+count);
//
//        System.out.println("Sum of the numbers:  "+sum);
/// //////////////////////Average of numbers/////////////////
//
//    int sum=0;
//    int count=0;
//    double avg;
//         while (true){
//    System.out.println("Give a number:");
//    int num= in.nextInt();
//    if (num==0)
//    {break;}
//    else{
//        sum+=num;
//        count++;
//    }
//
//}
//         avg= (double) sum /count;
//        System.out.println("Average of the numbers:  "+avg);

/// ///////////////////////////Average of positive numbers////////////////////\
//
//        double avg;
//    int sum=0;
//    int count=0;
//         while (true){
//    System.out.println("Give a number:");
//    int num= in.nextInt();
//    if (num==0)
//    {break;}
//    else if(num>0){
//        sum+=num;
//        count++;
//    }
//
//}
//         if(count==0)
//         {
//             System.out.println("Cannot calculate the average");
//         }
//         else {
//             avg = (double) sum / count;
//             System.out.println(avg);
//         }
///////////////////////////////////////////Counting//////////////////
//        int count=in.nextInt();
//
//        for (int i=0;i<=count;i++)
//        {
//            System.out.println(i);
//
//        }

/// ///////////////////////////////////Counting to hundred//////////////////
//
//        int count=in.nextInt();
//
//        for (int i=count;i<=100;i++)
//        {
//            System.out.println(i);
//
//        }

/// //////////////From where to where? (2 parts)///////////////Part1
//
//        System.out.println("Where to?");
//        int num=in.nextInt();
//
//        for (int i=1;i<=num;i++)
//        {
//            System.out.println(i);
//
//        }
///// //////////////From where to where? (2 parts)///////////////Part2
//        System.out.println("Where to?");
//        int num1=in.nextInt();
//
//        System.out.println("Where from?");
//        int num2=in.nextInt();
//
//        for (int i=num2;i<=num1;i++)
//        {
//            System.out.println(i);
//
//        }
///// //////////////////////////////Sum of a sequence////////////////////////
//        int sum=0;
//        System.out.print("Last number?");
//        int num=in.nextInt();
//        for(int i=1;i<=num;i++)
//        {
//            sum+=i;
//        }
//        System.out.println("the sum is "+sum);


        /// //////////////////////////////Sum of a sequence - the sequel//////
//        int sum=0;
//        System.out.println("First number? ");
//        int num1=in.nextInt();
//        System.out.println("last number? ");
//        int num2=in.nextInt();
//
//        for (int i=num1;i<=num2;i++)
//        {
//            sum+=i;
//
//        }
//        System.out.println("the sum is "+sum);

//        /// ////////////////////////////Factorial///////////////
//        int fact=1;
//        System.out.print("Give a number:");
//        int num=in.nextInt();
//        for(int i=1;i<=num;i++)
//        {
//            fact*=i;
//        }
//        System.out.println("the Factorial is "+fact);

/////////////////////Repeating, breaking and remembering (5 parts)//////////
// int sum=0;
// int count=0;
// double avg;
// int oddcount=0;
// int evencount=0;
//    System.out.println("Give numbers:");
//      while(true)
//           {
//                int num=in.nextInt();
//              if(num==-1){break;}
//              if(num%2==0){evencount++;}
//              else{oddcount++;}
//              sum+=num;
//           count++;
//           }
//      avg=1.0*sum/count;
//        System.out.println("Thx! Bye!" );
//        System.out.println("Sum: "+sum);
//        System.out.println("number: "+count);
//        System.out.println("average: "+avg);
//        System.out.println("even: "+evencount);
//        System.out.println("odd: "+oddcount);

/// /////////////In a hole in the ground/////////////////////
     //   printText();
///// //////////////////Reprint////////////
//        System.out.println("How many times?\n");
//        int repprint=in.nextInt();
//        for (int i=0;i<repprint;i++)
//        {
//            printText();
//        }
/// //////////////From one to parameter////////////////////
//printUntilNumber(5);

/// ////////////////From parameter to one//////////////////////
//printFromNumberToOne(5);
/// //////////////Division/////////////////////
//division(3,5);
/// /////////////Divisible by three////////
//divisibleByThreeInRange(2,10);

        /// /////////////////////////Number uno//////////
       // System.out.println(  numberUno());
/// ////////////////Word////////////
       // System.out.println(word());
/// /////////////////////////////Summation//////////////////////////
        //System.out.println(sum(4,3,6,1));
/// //////////////Smallest/////////////////////
//int ans=smallest(2,7);
//        System.out.println(ans);
/// /////////////////////////////////////Greatest//////////////////////////
//        int ans=greatest(2,7,10);
//        System.out.println(ans);


/// //////////////Averaging/////////////////////
       // System.out.println(average(4,3,6,1));
//////////////////////Star sign///////////////4part

/// ///////////part1/////////
//        printStars(5);
//        printStars(3);
//        printStars(9);

/// //////part2///////////////
        //printSquare(4);
/// ///////////////////////////part3////////////
        //printRectangle(17,3);
/// ///////////////////part4//////////////
//printTriangle(4);
/// /////////////Advanced astrology (3 parts)////////////////
        /// ///////////Printing stars and spaces/////////////part1
//      printSpaces(5);
//        System.out.println("///");
//        printStars(3);
        /// ///////////////////////////////Printing a right-leaning triangle////part2
        //printTriangleadvanced(4);
/// /////////////////////Printing a Christmas tree/////////////part3
        //printchristmasTree(10);




    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");    }

    public  static void printUntilNumber(int num){
        for (int i=1;i<=num;i++) {
            System.out.println(i);
        }
    }


    public  static void printFromNumberToOne(int num){
        for (int i=num;i>=1;i--) {
            System.out.println(i);
        }
    }
    public static void division(int numerator, int denominator)
    {
        double div=1.0*numerator/denominator;
        System.out.println(div);
    }

    public static void divisibleByThreeInRange(int beginning, int end)
    {
        for (int i=beginning;i<=end;i++)
        {
            if(i%3==0)
            {
                System.out.println(i);
            }
        }
    }
    public static int numberUno(){

        return 1;
    }

    public static String word(){
        return" Atypon";

    }

    public static int sum(int number1, int number2, int number3, int number4) {
       int sum=number1+number2+number3+number4;
        return sum;
    }

    public static int smallest(int number1, int number2) {
        int small;
        if(number1>number2)
        {
            small=number2;
        }
        else{small=number1;}
    return small;
    }

    public static int greatest(int number1, int number2, int number3) {
        int great;
        if(number1<number2 && number3<number2)
        {
            great=number2;
        }
        else if(number1>number2 && number3<number1)
        {
            great=number1;
        }
        else{great=number3;}
        return great;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int sumre=sum(number1,number2,number3,number4);
        double avg=1.0*sumre/4;
        return avg;
    }

    public static void printStars(int number) {
        for (int i=0;i<number;i++)
        {
            System.out.print("*");

        }
        System.out.print("\n");
    }


    public static void   printSquare(int size)
    {
        for (int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    public static void   printRectangle(int width, int height)
    {
        for (int i=0;i<height;i++)
        {
            for (int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    public static void printTriangle(int size)
    {
        for (int i=1;i<=size;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.print("\n");

        }

    }



    public static void printTriangleadvanced(int size)
    {
        for (int i=1;i<=size;i++)
        {
            for(int j=size;j>=i;j--){
                System.out.print(" ");

            }
for(int k=1;k<=i;k++)
{
    System.out.print("*");

}
            System.out.println(" ");
        }
    }


    public static void  printSpaces(int number)
    {
        for (int i=0;i<number;i++)
        {
            System.out.print(" ");

        }
    }


    public static void  printchristmasTree(int height)
    {
        int cons=1;
for (int i=1;i<=height;i++)
{
   for(int j=height-1;j>=i;j--)
   {
       System.out.print(" ");
   }
    for(int k=0;k<cons;k++)
    {
        System.out.print("*");

    }
    System.out.print("\n");
cons+=2;
}

        }

    }




