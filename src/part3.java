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

    }
}
