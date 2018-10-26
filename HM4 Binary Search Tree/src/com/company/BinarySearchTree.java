package com.company;

public class BinarySearchTree<T>
{

    /* Class containing left and right child of current node and key value*/
    class Node<T extends Comparable<T>>
    {
        T key;
        Node left, right;

        public Node(T item)
        {
            key = item;
            left = right = null;
        }


        public int compareTo(Node b)
        {
            int result;

            result = this.key.compareTo(b.key);

            return result;
        }

        // int firstCompare = this.name.compareTo(compareWith.name);
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
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key.compareTo(root.key))
            root.left = insertRec(root.left, key);
        else if (root.key.compareTo(key))
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
