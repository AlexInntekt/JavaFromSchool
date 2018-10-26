package com.company;

public class BinarySearchTree<T>
{

    /* Class containing left and right child of current node and key value*/
    class Node<T extends Comparable<T>>
    //class Node<T> implements Comparable<T>
    {
        T key;
        Node left, right;

        public Node(T item)
        {
            key = item;
            left = right = null;
        }


        public int compareTo(Node<T> b)
        {
            int result;

            if (((Comparable)this.key).compareTo((Comparable)b.key)>0)
                result = 1;

            return result;
        }

    }



    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(T key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, T key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            Node<Integer> anew = new Node(key);
            root = anew;
            return root;
        }

        /* Otherwise, recur down the tree */
        if(root.key.compareTo(key)>1)
            root.left = insertRec(root.left, key);
        else  //(root.key.compareTo(key)>1)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void display()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }



}
