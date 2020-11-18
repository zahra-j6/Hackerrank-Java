package Hackerrank;


import java.io.*;
        import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
public class Remove_duplicates_from_LL {

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node temp=head, prev=head;
        int d=0;
        ArrayList<Integer>arr=new ArrayList<>();
        if(head==null)
            return head;
        while(temp!=null){

            if(arr.contains(temp.data)){
                prev.next=temp.next;
                break;
            }else{
                prev=temp;
                arr.add(temp.data);
                temp=temp.next;
            }
        }
        if(temp!=null)
            removeDuplicates(head);
        return head;


    }

    public static  Node insert(Node head,int data)
        {
            Node p=new Node(data);
            if(head==null)
                head=p;
            else if(head.next==null)
                head.next=p;
            else
            {
                Node start=head;
                while(start.next!=null)
                    start=start.next;
                start.next=p;

            }
            return head;
        }
        public static void display(Node head)
        {
            Node start=head;
            while(start!=null)
            {
                System.out.print(start.data+" ");
                start=start.next;
            }
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            Node head=null;
            int T=sc.nextInt();
            while(T-->0){
                int ele=sc.nextInt();
                head=insert(head,ele);
            }
            head=removeDuplicates(head);
            display(head);

        }
    }