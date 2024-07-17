import java.util.*;

public class sap10 {
    public static void main(String[] args) {
        LinkedList<String>  l=new LinkedList<>();
        l.addFirst("a");
        l.addFirst("is");
        l.addFirst("This");
        l.add("list");
        System.out.println(l.size());
        for(int i=0; i<l.size();i++){
            System.out.print(l.get(i)+"->");

        }
        System.out.println("Null");
        l.removeFirst();
        l.removeLast();
        System.out.println(l);




    }
}
