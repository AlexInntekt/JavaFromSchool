package com.company;



public class MyList<T>
{
    public class Node
    {
        T Data;
        Node next;

       // Node(int d) {this.Data = d;}

        public Node(T value){
            this.Data = value;
            this.next = null;
        }
    }

    Node first;
    int count;

    public MyList()
    {

    }

    public void add(T value)
    {
        if(count==0)
        {
            Node newNode = new Node(value);
            this.first = newNode;
            this.count = 1;
        }
        else
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


    }

    //return true if it deleted something
    //UNFINISHED remove(T e)
    public boolean remove(T e)
    {
        boolean result=false;

        if(this.count==0)
        {
            return false;
        }

        Node current = first;

        while(current.next != null)
        {

            if(current.next.Data==e)
            {
                if(current.next.next != null)
                {
                    current.next=current.next.next;
                }
                else
                {
                    current.next=null;
                }


                count--;
                result=true;
            }

            current=current.next;
        }

        return result;
    }

        //return true if it deleted something
    public boolean remove()
    {
        if(this.count==0)
        {
            return false;
        }

        Node current = first;

        if(this.count == 1)
        {
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


    public T getElementAt(int index)
    {

        int i=0;

        Node current = first;

        T result = current.Data;

        while( (current.next != null) )
        {
            current = current.next;
            i++;
            if(i==index)
            {
                result = current.Data;
            }
        }

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
