package Hackerrank;
//https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
import java.util.*;
import java.io.*;

public class BST {

        public static void preOrder( Node1 root ) {

            if( root == null)
                return;

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

 /* Node11 is defined as :
 class Node1 
    int data;
    Node1 left;
    Node1 right;
    
    */

        public static Node1 insert(Node1 root,int data) {

            if(root==null)
                root=new Node1(data);
            else{
                if(data<root.data){
//                    if(root.left!=null)
                        root.left=insert(root.left,data);
                 //   root.left=new Node1(data);
                }else{
  //                  if(root.right!=null)
                        root.right=insert(root.right,data);
                   // root.right=new Node1(data);
                }
            }

            return root;
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
            preOrder(root);
        }
    }
