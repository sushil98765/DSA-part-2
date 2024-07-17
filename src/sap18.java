import java.util.*;
public class sap18 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);

        } else if (root.data < val) {
            root.right = delete(root.right, val);

        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node IS = insucc(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node insucc(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void Print(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            Print(root.left, x, y);
            System.out.print(root.data);
            Print(root.right, x, y);
        } else if (root.data >= y) {
            Print(root.left, x, y);
        } else {
            Print(root.right, x, y);
        }
    }

    public static void PrintPL(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);
        if (root.left == null && root.right == null) {
            printpath(path);
        } else {
            PrintPL(root.left, path);
            PrintPL(root.right, path);
        }
        path.remove(path.size() - 1);
    }


   public static void printpath(ArrayList<Integer> path) {
       for (int i = 0; i < path.size(); i++) {
           System.out.print(path.get(i) + " -->");
       }
       System.out.println();
   }


    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root =null;
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }

        PrintPL(root,new ArrayList<>());

        //inorder(root);

//        delete(root,4);
//        inorder(root);
       // Print(root,6,10);

//        if(search(root,3)){
//            System.out.println("found");
//        }
//
//        else{
//            System.out.println("not found");
//        }

    }
}
