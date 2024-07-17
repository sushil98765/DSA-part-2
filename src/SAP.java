
//java program

//public class SAP {
//    public static void main(String[] args){
//        System.out.println("Google, apple , sap, adobe, Mphasis,IBM etc I am coming to counter on you");
//
//
//
//    }
//}
// java variables

//public class SAP{
//    public static void main (String[] args){
//        int num1=5;
//        int num2=5;
//        int num3=9;
//        int sum= num1+num2+num3;
//        System.out.println(sum);
//    }
//}

//java literals and Data types

//public class SAP{
//    public static void main (String[] args){
//        byte age=34;
//        long ln= 88888888333L;
//        boolean a =true;
//        int age2=45;
//        short age5=45;
//        float f= 5.6f;
//        double d= 5.788888;
//        char c ='A';
//        System.out.println(age);
//        String str ="sushil";
//        System.out.println(str);
//
//
//    }
//}

//getting user input in java

//import java.util.Scanner;
//
//public class SAP{
//    public static void main (String[] args){
//        Scanner sc=new Scanner(System.in);
////        System.out.println("Enter no. 1");
////        float a =sc.nextFloat();
////        //int a =sc.nextInt();
////        System.out.println("Enter no. 2");
////        float b=sc.nextFloat();
////       // int b =sc.nextInt();
////      //  int sum=a+b;
////        float sum=a+b;
//        System.out.println("sum of these no. is");
//        System.out.println(sum);
//        boolean b1 =sc.hasNextInt();
//        System.out.println(b1);
//        String str=sc.next();
//        System.out.println(str);
//    }
//}

// 8Java Operators
//public class SAP{
//    public static void main(String[] args){
////        int a=4;
////        int b=6%a;
//        int b=8;
//        b +=8;
//        System.out.println(b);
//        System.out.println(66>9);
//        System.out.println(64>6 || 64<8);
//        System.out.println(2&3);
//
//    }
//}
// java associativity
//public class SAP{
//    public static void main(String[] args){
//        int a= 6*5-34/2;
//        int b= 60/5-34*2;
//        System.out.println(a);
//        System.out.println(b);
//        int x=6;
//        int y=1;
//        int k= x*y/2;
//        System.out.println(k);
//        int a=2;
//        int b=4;
//        int c=1;
//        int k=b*b-(4*a*c)/(2*a);
//        System.out.println(k);
//
//
//    }
//}
//10DATA TYPE / incre /decre
//public class SAP{
   // public static void main(String[] args){
//        byte x=5;
//        int y=6;
//        short z=8;
//        int a=y+z;
//        float b=6.54f+x;
//        System.out.println(b);
//        int i=55;
//        int j =70;
//        int c=++j;
//        System.out.println(c);
//        System.out.println(i++);
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(i);
//        int y=8;
//        System.out.println(++y *8);
//        char c='a';
//        System.out.println(++c);
//    }
//
//}

//13S,14 string.java
//import java.util.Scanner;

//public class SAP{
   // public static void main(String[] args){
        //String str = new String("Sushil");
        //String str="Sushil";
//        System.out.println(str);
//        int a=6;
//        float b=6.44f;
//        System.out.printf("The value of a is %d and value of b is %f",a,b);
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//        System.out.println(a);
        //methods
//        String name ="Sushilsushil";
//        //System.out.println(name);
////        int nm=name.length();
////        System.out.println(nm);
////        String lstring=name.toLowerCase();
////        System.out.println(lstring);
////        String ustring=name.toUpperCase();
////        System.out.println(ustring);
////        String tm=name.trim();
////        System.out.println(tm);
////        String sub=name.substring(2);
////        String sub1=name.substring(1,5);
////        System.out.println(sub1);
////        System.out.println(sub);
////        String rep1=name.replace("u","bbbb");
////
////        System.out.println(rep1);
////        System.out.println(name.endsWith("shil"));
////        System.out.println(name.startsWith("hshsh"));
//        System.out.println(name.charAt(3));
//        System.out.println(name.indexOf("shi",2));
//        System.out.println(name.indexOf("shi",4));
//        System.out.println(name.lastIndexOf("shi",4));
//        System.out.println(name.equals("Sushil"));
//        System.out.println("sushil is a good boy \n is dkskfnsk\t");
// }
//}

// 16 conditionals in java 17 Relation operators

//public class SAP{
//    public static void main(String[] args){
//        int age=8;
//        boolean cond=(age==18);
//        if(cond){
//            System.out.println("You can drive my boy");
//        }
//        else{
//            System.out.println("You can not drive my boy");
//        }
//        boolean a=true;
//        boolean b=false;
//        boolean c=true;
//        if(a ||b || c){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println(false);
//        }
//        if(a &&b && c){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println(false);
//        }
//        System.out.println("Not logical operators");
//        System.out.println("Not(a) is a ");
//        System.out.println(!a);
//        System.out.println("Not(b) is a ");
//        System.out.println(!b);
//
//    }
//}

//18 switch statement
import java.util.Scanner;
public class SAP{
    public static void main (String[] args){
      //  Scanner sc=new Scanner(System.in);
      //  System.out.println("Enter your age ");
        //int age =sc.nextInt();
        char age ='r';
        switch (age){
            case 'r':
                System.out.println("Your are going to be adult");
                break;
            case 'c':
                System.out.println("You are going to get a job");
                break;
            case 'd':
                System.out.println("You are going to be retired");
                break;
            default:
                System.out.println("nothing else baby");

        }
        System.out.println("End the loop ao the  are  is created by the system");
//        if(age>56){
//            System.out.println("You are experienced");
//        }
//        else if (age>46){
//            System.out.println("you are semi experienced");
//        }
//        else if (age>36){
//            System.out.println("you aree semi-semi exp");
//        }
//        else{
//            System.out.println("you are not experineced");
//        }
//        if (age>2){
//            System.out.println("you are not a baby");
//        }





    }
}