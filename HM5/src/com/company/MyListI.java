package com.company;

public interface MyListI<T>
{
    public void add(T val);
    public T getElementAt(int index);
    public int size();
    //public MyIteratorI IteratorI();
}


//    add( val : T) adds a new T at the end of the list
//         getElementAt( index : int): T returns element at position index
//         size(): int returns size of the list
//         iterator():IteratorI<T> r