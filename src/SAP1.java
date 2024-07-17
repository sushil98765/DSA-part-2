//21 loop controls statement in java

//public class SAP1 {
//    public static void main (String [] args){
//        System.out.println("loop controls");
//        int i =1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Finishesd");
//        while(true){
//            System.out.println("hell google");
//        }
//    }
//}
//22 do while loops in java
//public class SAP1 {
//    public static void main (String [] args){
//        System.out.println("loop controls");
//        int i =10;
//        do{
//            System.out.println(i);
//            i++;
//
//        }while(i>=455);
//
//    }
//}
//public class SAP1 {
   // public static void main (String [] args){
       // System.out.println("using loops break and continue controls");
//        for(int i=0; i<19;i++){
//            System.out.println(i);
//        }
//        int n=100;
//        for(int i=0;i<n;i++){
//            System.out.println(2*i+1);
//        }
//        int n=100;
//        for (int i=n;i>0;i--){
//            System.out.println(i);
//        }

//        for (int i=0; i<5;i++){
//            System.out.println(i);
//            System.out.println("using for loop");
//            if (i==2){
//                System.out.println("ending loop");
//                break;
//            }
//        }
//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//
//            }
//            i++;
//      /
//26 Arrays in Java

//public class SAP1{
//    public static void main (String[] args){
//        //int [] marks1= new int [5];
//       // int []marks1;
//       // marks1 = new int[5];
//        int [] marks1={1000,76,8,7,9,7};
//
////        marks1[0]=100;
////         marks1[1]= 70;
////         marks1[2]=87;
////         marks1[3]=89;
////         marks1[4]=86;
////         marks1[4]=90;
//        System.out.println(marks1[4]);
//
//    }
//}
////
//27 For each loop in Array
//public class SAP1{
//    public static void main (String[] args){
//        int [] marks={87,67,44,22,22,44};
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        System.out.println(marks[5]);
//        System.out.println("using direct");
//        System.out.println("using direct loop");
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        System.out.println("using reverse loop");
//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
//        System.out.println("using for each lop");
//        for(int el : marks){
//            System.out.println(el);
//        }
//
//    }
//}
//28 For multidimensional Array in Java;
public class SAP1{
    public static void main (String[] args){
        int [][] flats;
        flats =new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}