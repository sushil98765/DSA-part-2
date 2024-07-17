class sap9{
    Node head;
    private int size;
    sap9(){
        size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;

        }
    }
    // add
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }

    // add-last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode =head;
        while(currNode.next !=null){
            currNode = currNode.next;
        }
        currNode.next=newNode;
    }
    //print
    public void Print(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data +"->");
            currNode=currNode.next;

        }
        System.out.println("Null");
    }

//    delete
    public void deletefirst(){
        if(head==null){
            System.out.println("Empty list we can't do anything");
            return;

        }
        size--;
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("Empty list we can't do anything");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while(lastNode.next !=null){
            secondlast=secondlast.next;
            lastNode=lastNode.next;

        }
        secondlast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode !=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public Node reverseR(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead= reverseR(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }


    //public void
    public static void main(String[] args) {
        sap9 ll=new sap9();
//        ll.addFirst("is");
//        ll.addFirst("a");
//        ll.Print();
//        ll.addLast("list");
//        ll.addFirst("This");
//        ll.Print();
//        ll.deletefirst();
//        ll.Print();
//        ll.deletelast();
//        ll.Print();
//        System.out.println(ll.getSize());

        ll.addFirst("is");
        ll.addLast("list");
        ll.addFirst("a");
        ll.addFirst("This");
        ll.Print();
        ll.head=ll.reverseR(ll.head);
        ll.Print();


    }

}

/*
1. Tell me about yourself ?
2.What is your family background ?
3.Why do you u want to work for icici bank?
4.what do u know about icici bank and how it is different from other private sectors banks in india?
5.What are your strengths and  weakness?
5.1Where do you see yourself five years?
6.What are your salary expectations?

7.Why do you want to choose banking as your career option?
7.1.Why did you choose to apply for the PO exam?
8.Why should ICICI Bank hire you?
8.1.What qualities make you suitable for the position of probationary officer?
10.How would you handle a dissatisfied customer?
11.How do you handle constructive feedback and incorporate it into your work?
13.What is the job nature of probationary officers?

18. How do you handle stress and high-pressure situations?
19.Can you describe a time when you made a mistake and how you handled it?


14.What do you understand by accounting?/What is marketing?/Define a finance field./
What is the full form of ICICI?
15.What is market capitalization??/
What is the difference between a current account and a savings account?
16.What does CRR stand for and what does it signify?/. What is NRI banking?
17.How does a bank earn money?Do you know what types of products ICICI Bank offers?
What do you know about KYC?
21.Explain the term ‘Repo Rate’ and its significance.?What is a Fixed Deposit (FD)?
23.Who is the governor of RB?!What is CRR?
24.What was the name of first bank established in India?
25.Tell me about your project you have done in your college?
9. How do you maintain accuracy in your work?




 */

