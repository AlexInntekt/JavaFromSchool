package com.company;

public interface MyListI<T>
{
    public void add(T val);
    public T getElementAt(int index);
    public int size();
    //public MyIteratorI IteratorI();
}

