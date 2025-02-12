import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class part3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

/// //////////////Third element///////////////
//       String element;
//       ArrayList <String> list=new ArrayList<>();
//        while (true)
//        {
//            element=in.nextLine();
//            if(element.equals("")){break;}
//            list.add(element);
//        }
//
//        System.out.println( list.get(2));

/// /////////////////////Second plus third//////////////
//
//       int element;
//       ArrayList <Integer> list=new ArrayList<>();
//        while (true)
//        {
//            element=in.nextInt();
//            if(element==0){break;}
//list.add(element);
//        }
//int sum=list.get(2)+list.get(1);
//        System.out.println(sum );

        /// ////////////////////////IndexOutOfBoundsException////////////////////
//        ArrayList<String> wordList = new ArrayList<>();
//
//        wordList.add("First");
//        wordList.add("Second");
//
//        System.out.println(wordList.get(3));

/// //////////List size//////////////////////
//        int count=0;
//        ArrayList<String> namelist = new ArrayList<>();
//        String name;
//        while (true)
//        {
//            name=in.nextLine();
//            if(name.equals("")){break;}
//            count++;
//
//        }
//        System.out.println(count);

/// //////////////Last in list///////////////////
//        int count=0;
//        ArrayList<String> namelist = new ArrayList<>();
//        String name;
//        while (true)
//        {
//            name=in.nextLine();
//            if(name.equals("")){break;}
//            namelist.add(name);
//            count++;
//
//        }
//        System.out.println(namelist.get(count-1));

        /// /////////////First and last///////////////
//                int count=0;
//        ArrayList<String> namelist = new ArrayList<>();
//        String name;
//        while (true)
//        {
//            name=in.nextLine();
//            if(name.equals("")){break;}
//            namelist.add(name);
//            count++;
//
//        }
//        System.out.println(namelist.get(0));
//        System.out.println(namelist.get(count-1));

/// //////////Remember these numbers///////////////
//            int count=0;
//        ArrayList<Integer> numberlist = new ArrayList<>();
//        int number;
//        while (true)
//        {
//            number=in.nextInt();
//            if(number==-1){break;}
//            numberlist.add(number);
//          count++;
//
//        }
//        for (int i=0;i<count;i++)
//        {
//            System.out.println(numberlist.get(i));
//        }

//////////////////Only these numbers//////////////
//         int where,from;
//            int count=0;
//        ArrayList<Integer> numberlist = new ArrayList<>();
//        int number;
//        while (true)
//        {
//            number=in.nextInt();
//            if(number==-1){break;}
//            numberlist.add(number);
//          count++;
//
//        }
//        System.out.print("From where?");
//        where=in.nextInt();
//        System.out.println("To where?");
//        from=in.nextInt();
//        for (int i=where;i<=from;i++)
//        {
//            System.out.println(numberlist.get(i));
//        }


        /// //////////////////Greatest in list////////////////
//
//        ArrayList<Integer> list = new ArrayList<>();
//        int Great=0;
//        int number;
//        while (true)
//        {
//            number=in.nextInt();
//            if(number==-1){break;}
//            list.add(number);
//      }
//        for(int i = 0; i < list.size(); i++) {
//             Great = list.get(0);
//            int numberloop = list.get(i);
//            if (Great <numberloop) {
//                Great= numberloop;
//            }
//        }
//        System.out.println(Great);

/// ///////////////////////////Index of////////////////
//
//        ArrayList<Integer> list = new ArrayList<>();
//        int number;
//        while (true)
//        {
//            number=in.nextInt();
//            if(number==-1){break;}
//            list.add(number);
//      }
//        System.out.print("Search for? ");
//        int search=in.nextInt();
//        for(int i = 0; i < list.size(); i++) {
//if(search==list.get(i))
//{
//    System.out.println(search+" is at index "+i);
//}
//
//        }



        /// /////////////////Index of smallest/////////////////

//
//        ArrayList<Integer> list = new ArrayList<>();
//        int smallest=0;
//        int number;
//        while (true)
//        {
//            number=in.nextInt();
//            if(number==9999){break;}
//            list.add(number);
//      }
//        for(int i = 0; i < list.size(); i++) {
//             smallest = list.get(0);
//            int numberloop = list.get(i);
//            if (smallest >numberloop) {
//                smallest= numberloop;
//            }
//        }
//                System.out.println("Smallest number "+smallest);
//                //int search=smallest;
//        for(int i = 0; i < list.size(); i++) {
//if(smallest==list.get(i))
//{
//    System.out.println("Found at index:"+i);
//}
//
//        }


        /// ///////////////Sum of a list////
//        ArrayList<Integer> list = new ArrayList<>();
//        int sum=0;
//        int number;
//        while (true)
//        {
//            number=in.nextInt();
//            if(number==-1){break;}
//            list.add(number);
//      }
//        for(int i = 0; i < list.size(); i++) {
//             sum += list.get(i);
//
//            }
//        System.out.println(sum);

/// //////////////////Average of a list////////////////
//int count=0;
//double avg=0;
//        ArrayList<Integer> list = new ArrayList<>();
//        int sum=0;
//        int number;
//        while (true)
//        {
//            number=in.nextInt();
//            if(number==-1){break;}
//            list.add(number);
//            count++;
//      }
//        for(int i = 0; i < list.size(); i++) {
//             sum += list.get(i);
//
//            }
//        avg=1.0*sum/count;
//        System.out.println(avg);
/// ///////////////////On the list?/////////
//
//        ArrayList<String> namelist = new ArrayList<>();
//        String name,search;
//        boolean list=false;
//        while (true)
//        {
//            name=in.nextLine();
//            if(name.equals("")){break;}
//            namelist.add(name);
//        }
//        System.out.print("Search for?");
//        search=in.nextLine();
//        for(int i=0;i<namelist.size();i++)
//        {
//
//            if(search.equals(namelist.get(i)))
//            {
//                System.out.println(search+" was found");
//                list=true;
//                break;
//            }
//
//        }
//        if(list==false) {
//            System.out.println(search+" was not found");
//        }

/// ////////////////Print in range//////////////////
//        ArrayList<Integer> numtest=new ArrayList<>();
//
//        numtest.add(3);
//        numtest.add(2);
//        numtest.add(6);
//        numtest.add(-1);
//        numtest.add(5);
//        numtest.add(1);
//
//        System.out.println("The numbers in the range [0, 5]");
//        printNumbersInRange(numtest, 3, 10);
///// ////////////sum/////////
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(6);
//        numbers.add(-1);
//        System.out.println(sum(numbers));
//
//        numbers.add(5);
//        numbers.add(1);
//        System.out.println(sum(numbers));


/// //////////Remove last///////////////
//        ArrayList<String> strings = new ArrayList<>();
//
//        strings.add("First");
//        strings.add("Second");
//        strings.add("Third");
//
//        System.out.println(strings);
//
//        removeLast(strings);
//        removeLast(strings);
//
//        System.out.print(strings);




    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit)
    {
        ArrayList<Integer> num=new ArrayList<>();
        for (int i=0;i<numbers.size();i++)
        {
         if(numbers.get(i)>=lowerLimit && numbers.get(i)<=upperLimit)
         {
             num.add(numbers.get(i));
         }
        }
        System.out.println(num);
    }
    public static int sum(ArrayList<Integer> numbers)
    {
        int sum=0;
        for (int i=0;i<numbers.size();i++)
        {
            sum+=numbers.get(i);
        }
return sum;
    }

    public static void removeLast(ArrayList<String> strings)
    {
        for (int i=0;i<strings.size();i++)
        {
            if(i==strings.size()-1)
            {
                strings.remove(strings.size()-1);
            }
        }
    }
}
