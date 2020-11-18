package Hackerrank;
//https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
import java.util.*;
        import java.io.*;
//The height of a binary tree is the number of edges between the tree's root and its furthest leaf. For example, the following binary tree is of height :
class Node2 {
    Node2 left;
    Node2 right;
    int data;

    Node2(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Height_of_a_Binary_Tree {

    /*
    class Node2
        int data;
        Node2 left;
        Node2 right;
    */
    public static int height(Node2 root) {
        // Write your code here.
        if(root==null)
            return -1;
        return 1+ Math.max(height(root.left),height(root.right));
    }

    public static Node2 insert(Node2 root, int data) {
        if(root == null) {
            return new Node2(data);
        } else {
            Node2 cur;
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
        Node2 root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}