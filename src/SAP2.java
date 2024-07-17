
// 31 methods in java
//public class SAP2 {
//     int logic(int x,int y){
//        int z;
//        if (x>y){
//            z=x+y;
//        }
//        else{
//            z=x+y*5;
//        }
//        return z;



//    }
//    public static void main (String [] args){
//        System.out.println(" Now  I am practicing methods in java while driving a car in google ");
//        int a=40;
//        int b=80;
//        int c;
//        SAP2 sp=new SAP2();
//        c=sp.logic(a,b);
//        //c= logic(a,b);
////        if (a>b){
////            c=a+b;
////        }
//        else{
//            c=a+b*5;
//        }
//       int a1=2;
//       int b1=1;
//
//       int c1 ;
//      // c1= logic(a1,b1);
//        c1= sp.logic(a1,b1);
////        if (a1>b1){
////            c1=a1+b1;
////        }
////        else{
////            c1=a1+b1*5;
////        }
//        System.out.println(c);
//        System.out.println(c1);
//    }
//}

// 32 method overloading
//public class SAP2{
//    static void change(int a){
//        a=98;
//    }
//    static void change2(int [] arr){
//        arr[0]=98;
//    }

//    static void telljoke(){
//        System.out.println(" I Invented a mia football ball is a ");
//    }
//    static void foo(){
//        System.out.println("good morning shyaam sundar laal form magarda");
//    }
//    static void foo(int a){
//        System.out.println("good morning shyaam sundar laal form magarda"+ a);
//    }
//    static void foo(int a, int b){
//        System.out.println("good morning shyaam sundar laal form magarda" "+ "b);
//        System.out.println("good morning shyaam sundar laal form magarda"+ a);
//    }
    //public static void main (String[] args){
//        telljoke();
//        int x=45;
//        change(x);
//        System.out.println(x);
//        int [] marks={34,55,56,76,76,67};
//        change2(marks);
//        System.out.println(marks[0]);
//        foo();
//        foo(990);
//        foo(800,900);
//
//
//    }
//}

//33 method variable arguments

//public class SAP2{
//    static int sum(int x, int ...arr){
//        int result=x;
//        for (int a:arr){
//            result= result+a;
//
//        }
//        return result;
//    }
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }
//    public static void main(String[] args){
//        System.out.println(" Variable and arguments are studying by mee");
//        System.out.println(sum(1));
//        System.out.println(sum(2,4,5));
//        System.out.println(sum(2,4,5,5));
//
//
//    }
//}
// 34 recursion in java
//public class SAP2{
//    static int factorial(int n) {
//        if (n==0 || n==1){
//            return 1;
//
//        }
//        else{
//            return n*factorial(n-1);
//        }
//    }
//    public static void main (String [] args){
//        int x=4;
//        System.out.println(factorial(x));
//
//
//    }
//}
public class SAP2{
    static int factorial(int n) {
        if (n==0 || n==1){
            return 1;

        }
        else{
            int pd=1;
            for(int i=1;i<=n;i++){
                pd=pd*i;
            }
            return pd;
        }
    }
    public static void main (String [] args){
        int x=4;
        System.out.println(factorial(x));


    }
}