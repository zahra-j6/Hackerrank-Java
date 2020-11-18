package Hackerrank;

import java.util.*;
import java.io.*;

    class Node3 {
        Node3 left;
        Node3 right;
        int data;

        Node3(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

public class Lowest_common_ancestor {

        /*
        class Node3 
            int data;
            Node3 left;
            Node3 right;
        */
        public static Node3 lca(Node3 head, int v1, int v2) {
            // Write your code here.
            if (v1<head.data && v2<head.data)
                return lca(head.left,v1,v2);
            else if(v2>head.data && v1>head.data)
                return lca(head.right,v1,v2)  ;
            else
                return head;
        }

        public static Node3 insert(Node3 root, int data) {
            if(root == null) {
                return new Node3(data);
            } else {
                Node3 cur;
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
            Node3 root = null;
            while(t-- > 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            scan.close();
            Node3 ans = lca(root,v1,v2);
            System.out.println(ans.data);
        }
    }
