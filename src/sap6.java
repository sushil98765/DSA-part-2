// 69 multithreading in JAVA
//class MyThread extends Thread{
//    public void run(){
//        int i=0;
//        while(i<=900){
//            System.out.println("My thread 1 is running ");
//            System.out.println("Thread ");
//            i++;
//        }
//    }
//}
//class MyThread1 extends Thread{
//    public void run(){
//        int i=0;
//        while(i<=900){
//            System.out.println("My thread 2 4738939 is running ");
//            System.out.println("Thread3333 ");
//            i++;
//        }
//    }
//}
//public class sap6 {
//    public static void main(String[] args) {
//        MyThread t1=new MyThread();
//        MyThread1 t2=new MyThread1();
//        t1.start();
//        t2.start();
//
//    }
//}

//71 By implementing Runnable interface
//class Myth implements Runnable{
//    public void run(){
//        System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//        System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//        System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//        System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//        System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//        System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//        System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//        System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//
//    }
//}
//class Myth1 implements Runnable{
//    public void run(){
//        System.out.println("kabhi dekhaa ");
//        System.out.println("kabhi dekhaa ");
//        System.out.println("kabhi dekhaa ");
//        System.out.println("kabhi dekhaa ");
//        System.out.println("kabhi dekhaa ");
//        System.out.println("kabhi dekhaa ");
//        System.out.println("kabhi dekhaa ");
//        System.out.println("kabhi dekhaa ");
//
//
//    }
//}

//public class sap6{
//    public static void main(String[] args) {
//        Myth t1=new Myth();
//        Thread gun1=new Thread(t1);
//
//        Myth1 t2=new Myth1();
//        Thread gun2=new Thread(t2);
//        gun1.start();
//        gun2.start();
//    }
//}
//
// constructor in Thread
//class Mythr extends Thread{
//    public Mythr(String name){
//        super(name);
//    }
//    public void run() {
//        int i=15;
//        System.out.println("Thanq");
//       // while(true) {
//           // System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//       // }
//    }
//}
//
//public class sap6 {
//    public static void main(String[] args) {
//        Mythr t1 = new Mythr("harry");
//        t1.start();
//        System.out.println("The id is given by me is "+ t1.getId());
//
//    }
//}
//
//// 74 thread priorities

//class Mythr extends Thread{
//    public Mythr(String name){
//        super(name);
//    }
//    public void run() {
//        int i=15;
//        System.out.println("Thanq"+ this.getName());
//        // while(true) {
//        // System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
//        // }
//    }
//}
//
//public class sap6 {
//    public static void main(String[] args) {
//        Mythr t1 = new Mythr("harry");
//        Mythr t2 = new Mythr("harry2");
//        Mythr t3 = new Mythr("harry3");
//        Mythr t4 = new Mythr("harry4");
//        Mythr t5 = new Mythr("harry4");
//        t5.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        //t5.setPriority(Thread.MAX_PRIORITY);
//
//
//
//    }
//}

// methods in Thread
class Mythr extends Thread{

    public void run() {

         while(true) {
         System.out.println("kabhi dekhaa ishidsknsdhi sisjjdksm");
         try {
             Thread.sleep(500);
         }
         catch(Exception e) {
             e.printStackTrace();
         }
         }
         }
    }


class Mythr1 extends Thread{

    public void run() {

        while(true) {
            System.out.println("kabhi dekhaa ");
        }
    }

}

public class sap6 {
    public static void main(String[] args) {
        Mythr t1 = new Mythr();
        Mythr1 t2 = new Mythr1();

        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}