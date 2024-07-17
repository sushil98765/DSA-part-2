import java.util.Scanner;

// ERRORSS IN JAVA / Try-Catch  Block in java
/*
public class sap7 {
    public static void main(String[] args) {
        int a=900;
        int b=0;
        try {
            int c = a / b;
            System.out.println( "The value of c is given by :"+ c);
        }
        catch(Exception e){
            System.out.println("Hello ");
            System.out.println(e);
        }
        System.out.println( "END OF THE pROGRAM");


    }
}
*/

/*
public class sap7 {
    public static void main(String[] args) {
        int [] marks={78,98,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index.");
        int ind=sc.nextInt();
        System.out.println("Enter the no.");
        int num=sc.nextInt();

        try {
            System.out.println( "The value of c is given by :"+ marks[ind]);
            System.out.println("Answer"+ marks[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("arithmeticException Hello exception ");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" ArrayIndexOutOfBoundsException Hello exception ");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Hello exception ");
            System.out.println(e);
        }
        System.out.println( "END OF THE pROGRAM");


    }
}
*/


/*

public class sap7 {
    public static void main(String[] args) {
        int[] marks = {78, 98, 7};
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the index.");
        //int ind = sc.nextInt();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the index.");
            int ind = sc.nextInt();


            try {
                System.out.println(" Marks ");
                try {

                    System.out.println(marks[ind]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(" This index not not exit");
                    System.out.println("Eror in level d");
                }

            } catch (Exception e) {
                System.out.println("Hello exception ");
                System.out.println(e);
            }
            System.out.println("END OF THE pROGRAM");


        }
    }
}

*/

// 83 exception class
//class myE extends Exception{
//    public String toString(){
//        return "I am to string";
//    }
//    public String getMessage(){
//        return" I am get Message";
//    }
//}
//public class sap7{
//    public static void main(String[] args) {
//        int a;
//        Scanner sc = new Scanner(System.in);
//         a =sc.nextInt();
//         if(a<9) {
//             try {
//                // throw new myE();
//                 throw new ArithmeticException();
//             }
//             catch (Exception e){
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 //System.out.println(e);
//                 e.printStackTrace();
//                 System.out.println("Finished");
//             }
//         }
//
//
//    }
//}
//class Negt extends Exception {
//    public String toString() {
//        return " Negtiverad";
//    }
//
//    public String getMessage() {
//        return " Negative raid";
//    }
//}
//
//public class sap7 {
//
//    public static double area(int r) throws Negt {
//        if (r < 0) {
//            throw new Negt();
//        }
//        double result = Math.PI * r * r;
//        return result;
//    }
//
//
//    public static int divide(int a, int b) throws Exception{
//
//        int result =a/b;
//        return result;
//
//    }
//    public static void main(String[] args) {
//        try {
//           // int c = divide(6, 0);
//           // System.out.println(c);
//            double ar= area(6);
//            System.out.println(ar);
//        }
//            catch (Exception e){
//                System.out.println("exception");
//            }
//        }
//
//    }
//
//
//
// finally block

public class sap7{
    public static int greet(){
        try {
            int a = 50;
            int b = 2;
            int c = a / b;
            return c;


        }
        catch ( Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally block in the world  ");
        }
        return -1;
    }
    public static void main(String[] args) {
        //greet();
        int k = greet();
        System.out.println(k);
        int a=8;
        int b=2;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println(" I am finallay"+ b);
            }
            b--;
        }


    }
}













































