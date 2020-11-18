package Hackerrank;
import java.util.*;
import java.io.*;
//https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
class Node1{
        int data;
        Node1 left;
        Node1 right;

    public Node1(int data) {
        this.data=data;
        left=right=null;
    }
}

public class Level_order_traversal {




        public static void levelOrder(Node1 root) {
            LinkedList<Node1>q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node1 val=q.poll();
                System.out.print(val.data+" ");
                if(val.left!=null)
                    q.add(val.left);
                if(val.right!=null)
                    q.add(val.right);

            }



        }




    public static Node1 insert(Node1 root, int data) {
        if(root == null) {
            return new Node1(data);
        } else {
            Node1 cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node1 root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}

