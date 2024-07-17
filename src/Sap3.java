
// 38 OOPs in java
//class Employee{
//    int id;
//    String name;
//    int salary;
//    public void pd(){
//        System.out.println("The id :" + id);
//        System.out.println("The name is :"+ name);
//        //System.out.println("Employee salary : "+ salary);
//    }
//    public int getSalary(){
//        return salary;
//    }
//
//}
//public class Sap3 {
//    public static void main(String[] args){
//        Employee sus=new Employee();
//        Employee john=new Employee();
//
//        sus.id=76;
//        sus.name="Sushil";
//        sus.salary=1000;
//
//        john.id=98;
//        john.name="John Johny";
//        john.salary=9000;
//
//
//        sus.pd();
//        john.pd();
//        int salary=john.getSalary();
//        System.out.println(salary);


        //System.out.println(sus.id);
        //System.out.println(sus.name);


//
//    }
//}
//

// 40 getter and setter
// class myEp{
//    private int id;
//    private String name;
//
//    public void  setname(String n){
//        this.name =n;
//    }
//    public String getname(){
//        return name;
//
//    }
//    public void setId(int i){
//        this.id=i;
//
//    }
//    public int getId(){
//        return id;
//    }
//
//}
//public class Sap3{
//    public static void main(String[] args) {
//        myEp ep=new myEp();
//        //ep.id =89;
//       // ep.name="Sushil pal ";
//        ep.setname("Sushil");
//        System.out.println(ep.getname());
//        ep.setId(90);
//
//        System.out.println(ep.getId());
//
//
//
//    }
//}
// 42 Constructor in java
//class myEp{
//    private int id;
//    private String name;
//    public myEp(String nam,int i){
//        id=i;
//        name=nam;
//    }
//
//    public void  setname(String n){
//        this.name =n;
//    }
//    public String getname(){
//        return name;
//
//    }
//    public void setId(int i){
//        this.id=i;
//
//    }
//    public int getId(){
//        return id;
//    }
//
//}
//public class Sap3{
//    public static void main(String[] args) {
//        myEp ep=new myEp("Sushil",24);
//        //ep.id =89;
//       // ep.name="Sushil pal ";
//       // ep.setname("Sushil");
//        System.out.println(ep.getname());
//       // ep.setId(90);
//
//        System.out.println(ep.getId());
//
//
//
//    }
//}

// 45 inheritence in java
//class Base {
//    int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        System.out.println("nOW I AM SETTING X");
//        this.x = x;
//    }
//
//    public void printme() {
//        System.out.println("I am a CONSTRUCTOR");
//    }
//}
//
//    class Derived extends Base {
//        int y;
//
//        public int getY() {
//            return y;
//        }
//
//        public void setY(int y) {
//            System.out.println("Now I am setting y");
//            this.y = y;
//        }
//    }
//
//    public class Sap3 {
//        public static void main(String[] args) {
//            Base b = new Base();
//            b.setX(6);
//            System.out.println(b.getX());
//
//            Derived d = new Derived();
//            d.setX(7);
//            System.out.println(d.getX());
//
//        }
//    }
//

//  connstructor in Inheritence
//class base{
//    base(){
//        System.out.println(" I am base  constructor");
//    }
//    base(int a){
//        System.out.println(" i am overloaded: "+ a);
//    }
//}
//class Derived extends base{
//
//    Derived() {
//       // super(0);
//        System.out.println(" i am derived claas const");
//    }
//    Derived(int a, int b){
//        super(a);
//        System.out.println(" i ma derived overlaoadd:"+ b);
//    }
//}
//class cDerived extends Derived{
//
//    cDerived() {
//        // super(0);
//        System.out.println(" i am cccderived claas const");
//    }
//    cDerived(int a, int b,int c){
//        super(a,b);
//        System.out.println(" i ma ccccderived overlaoadd:"+ c);
//    }
//}
//public class Sap3{
//    public static void main(String[] args) {
//        //System.out.println();
//        //base b= new base();
//        cDerived d= new cDerived(4,5,7);
//
//
//    }
//}

// 47 this keyward
//class Ekclass{
//    int a;
//
//    public int getA() {
//        return a;
//    }
//
//    Ekclass (int v){
//        this.a=v;
//    }
//    public int returnone(){
//        return 1;
//    }
//}
//class Doclass extends Ekclass{
//    Doclass(int c){
//        super(c);
//        System.out.println("I am constructoddk");
//    }
//}
//public class Sap3{
//    public static void main(String[] args) {
//        //Ekclass ek = new Ekclass(6);
//        Doclass d=new Doclass(5);
//        System.out.println(d.getA());
//
//    }
//}

// 48 method overriding in java
//class A{
//    public int a;
//    public int sushil(){
//        return 5;
//
//    }
//    public void meth2(){
//        System.out.println(" I am method 2 of class A");
//    }
//}
//class B extends A{
//    @Override
//    public void meth2(){
//        System.out.println(" I am method 2 of class B");
//    }
//    public  void meth3(){
//        System.out.println("I am meth3 of B class");
//    }
//}
//
//public class Sap3{
//    public static void main(String[] args) {
//        A a = new A();
//        a.meth2();
//        B b =new B();
//        b.meth2();
//
//    }
//}

// 49 Dynamic Dispatch
class Phone{
    public void showtime(){
        System.out.println("time is 8 am ");
    }
    public void on(){
        System.out.println(" phone is turning on Phoen ");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("music ");
    }
    public void on(){
        System.out.println(" phone is turning on smartphone ");
    }
}

public class Sap3{
    public static void main(String[] args){
        Phone obj=new SmartPhone();
        obj.showtime();
        obj.on();


    }
}