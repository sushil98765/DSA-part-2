
// 53 Abstract classess
//abstract class Parent2{
//    public Parent2(){
//        System.out.println(" Mian conctructior bo");
//    }
//    public void sayhello(){
//        System.out.println("hello bachoo");
//    }
//    abstract public void greet();
//    abstract public void greet1();
//
//}
//class child2 extends Parent2{
//    @Override
//    public void greet(){
//        System.out.println("good morning");
//    }
//    public void greet1(){
//        System.out.println("good afternoon");
//    }
//}
//abstract class child3 extends Parent2 {
//    public void th(){
//        System.out.println(" i am the th yaar");
//    }
//}
//public class sap4 {
//    public static void main(String[] args) {
//        //Parent2 p=new Parent2();
//        child2 c= new child2();
//
//    }
//}
 // 54 interfaces in java
interface BC{
    int a=45;
    void appylbrake(int dec);
    void speedup(int inc);

}
interface  HM{
    void him();
    void how();
}
class AC implements BC,HM{
    void blow(){
        System.out.println("Pee pooo");
    }
    public void appylbrake(int dec){
        System.out.println("Apply brake");
    }
    public void speedup(int inc){
        System.out.println("sppedd upp in the morning");
    }
    public void him(){
        System.out.println(" fastested ");
    }
    public void how(){
        System.out.println(" hunter");
    }

}
public class sap4{
    public static void main(String[] args) {
        System.out.println(" interfacesss");
        AC h=new AC();
        h.appylbrake(8);
        System.out.println(h.a);
        h.him();
        h.how();

    }
}




















