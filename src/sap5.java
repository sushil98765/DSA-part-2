//57 default methods in Java
//interface camera{
//    void takesnap();
//    void recordV();
//    private void greet(){
//        System.out.println("Good Morning");
//    }
//    default void record4k(){
//        greet();
//        System.out.println("4k recording");
//    }
//
//}
//interface wifi{
//    String[] networks();
//    void connectedN(String networks);
//}
//class Myph{
//    void callno(int phoneno){
//        System.out.println("calling" + phoneno);
//    }
//    void pickcall(){
//        System.out.println("Picking : ");
//    }
//}
//class Mysm extends Myph implements camera,wifi{
//    public void takesnap(){
//        System.out.println("Taking Sanp");
//    }
//    public void recordV(){
//        System.out.println(" Recording video");
//    }
////    public void record4k(){
////        System.out.println("4k recording baaba babaaba ");
////    }
//
//    public String[] networks(){
//        System.out.println("connecting to networks");
//        String[] networks={"sushil", "prashant", "Shubham"};
//        return networks;
//    }
//    public void connectedN(String networks){
//        System.out.println("connecting :" + networks );
//    }
//}
//public class sap5 {
//    public static void main(String [] args){
//        Mysm my = new Mysm();
//        my.record4k();
//
//        String[] arr=my.networks();
//        for (String ele : arr){
//            System.out.println(ele);
//        }
//
//    }
//}
// 58 inheri in interface
//interface SI{
//    void meth1();
//    void meth2();
//
//}
//interface CSI extends SI{
//    void meth3();
//    void meth4();
//}
//class SPSI implements CSI{
//    public void meth1(){
//        System.out.println("meth1");
//    }
//
//    public void meth2(){
//        System.out.println("meth2");
//    }
//    public void meth3(){
//        System.out.println("meth3");
//    }
//
//    public void meth4(){
//        System.out.println("meth4");
//    }
//
//
//
//}
//public class sap5{
//    public static void main(String[] args) {
//        SPSI p=new SPSI();
//        p.meth1();
//        p.meth2();
//        p.meth3();
//        p.meth4();
//    }
//}
//// Polymorphism in java
//

//interface camera{
//        void takesnap();
//    void recordV();
//    private void greet(){
//        System.out.println("Good Morning");
//    }
//    default void record4k(){
//        greet();
//        System.out.println("4k recording");
//    }
//
//}
//interface wifi{
//    String[] networks();
//    void connectedN(String networks);
//}
//class Myph{
//    void callno(int phoneno){
//        System.out.println("calling" + phoneno);
//    }
//    void pickcall(){
//        System.out.println("Picking : ");
//    }
//}
//class Mysm extends Myph implements camera,wifi{
//    public void takesnap(){
//        System.out.println("Taking Sanp");
//    }
//    public void recordV(){
//        System.out.println(" Recording video");
//    }
////    public void record4k(){
////        System.out.println("4k recording baaba babaaba ");
//    }

//    public String[] networks(){
//        System.out.println("connecting to networks");
//        String[] networks={"sushil", "prashant", "Shubham"};
//        return networks;
//    }
//    public void connectedN(String networks){
//        System.out.println("connecting :" + networks );
//    }
//}
//public class sap5 {
//    public static void main(String [] args){
//         Mysm my = new Mysm();
//        camera c=new Mysm();
        //c.record4k();
      //  c.networks(); not allowed
//        my.record4k();
//
//        String[] arr=my.networks();
//        for (String ele : arr){
//            System.out.println(ele);
      //  }
//        my.networks();
//        my.callno(99999999);
//        my.pickcall();
//
//    }
//}


// 66 Access Modifier
class MY{
    public int a=8;
    protected int x=90;
    int y=98;
    private int z=7;
    public void meth1(){
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
public class sap5{
    public static void main(String[] args) {
        MY m= new MY();
        //m.meth1();
        System.out.println(m.a);
        System.out.println(m.x);
        System.out.println(m.y);
       // System.out.println(m.z);


    }
}




