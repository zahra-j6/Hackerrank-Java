package Hackerrank;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


// Recursive Java program to find key closest to k in given Binary Search Tree.
public class closest_element_in_BST {

//



        static int min_diff, min_diff_key;

        /* A binary tree node has key, pointer to left child
        and a pointer to right child */
        static class Node
        {
            int key;

            Node left, right;
        };

/* Utility that allocates a new node with the
given key and null left and right pointers. */

        static Node newnode(int key)
        {

            Node node = new Node();
            node.key = key;
            node.left = node.right = null;
            return (node);
        }
    static  HashMap<Integer,Integer>hm=new HashMap<>();
    static int closest(Node head, int k){
            inorder(head,k);
            int min=Integer.MAX_VALUE;
            for(int v:hm.keySet()){
                min=Math.min(min,v);
            }
            int op=hm.get(min);

        hm.clear();
        return op;

        }

    static void inorder(Node head, int k) {
        if (head != null) {
            inorder(head.left, k);
            if (head.key == k)
                hm.put(0, k);
            else hm.put(Math.abs(head.key - k), head.key);
            inorder(head.right, k);
        }
    }

            // Driver program to run the case
        public static void main(String args[])
        {

            Node root = newnode(9);
            root.left = newnode(4);
            root.right = newnode(17);
            root.left.left = newnode(3);
            root.left.right = newnode(6);
            root.left.right.left = newnode(5);
            root.left.right.right = newnode(7);
            root.right.right = newnode(22);
            root.right.right.left = newnode(20);
            int k = 18;
            System.out.println( closest(root, k));//17
            System.out.println( closest(root, 4));//4
            System.out.println( closest(root, 12));//9


        }
    }
//contributed by Arnab Kundu


