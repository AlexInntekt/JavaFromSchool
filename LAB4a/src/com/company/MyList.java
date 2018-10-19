package com.company;



public class MyList
{
    public class Node
    {
        Object Data;
        Node next;

       // Node(int d) {this.Data = d;}

        public Node(Object value){
            this.Data = value;
            this.next = null;
        }
    }

    Node first;
    int count;

    public MyList(Object setData)
    {
        Node newNode = new Node(setData);
        this.first = newNode;
        this.count = 0;
    }

    public void add(Object value)
    {
        Node current = this.first;
        Node temp = new Node(value);

        if(current == null){
            this.first = temp;
            count+=1;
            return;
        }

        while(current.next != null){
            current = current.next;
        }
        current.next=temp;
        count += 1;
    }

    public boolean remove(int e)
    {
        if(this.count==0)
        {
            return false;
        }

        Node current = first;

        if(this.count == 1) {
            this.first = null;
            count--;
            return true;
        }

        while(current.next.next != null)
        {
            current = current.next;
        }
        current.next = null;
        count--;

        return true;
    }

    public int getElementAt(int index)
    {
        int result=0;

        return result;
    }

    public int size()
    {
        return count;
    }

    public boolean isEmpty()
    {
        boolean result=true;

        if(this.count == 0)
        {
            result=true;
        }
        else
        {
            result=false;
        }

        return result;
    }

    public void parcurge()
    {
        Node current = first;

        System.out.print( current.Data + "\n");

        while(current.next != null)
        {
            current = current.next;
            System.out.print( current.Data + "\n");
        }
    }
}
