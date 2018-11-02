package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class MySortedList<T> extends MyList<T>
{


     public void add(T e)
    {
        if (this.size == elements.length)
        {
            ensureCapacity();
        }
        elements[this.size++] = e;

        sort();
    }

    public void sort()
    {
        //System.out.print(this.elements);
        Arrays.sort(this.elements);
    }



}

