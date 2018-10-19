package com.company;

public class Rectangle extends GeometricalForm
{
    public Rectangle(int x, int y, int width, int height)
    {
       super(x,y);
    }

    int width;
    int height;

    public int getwidth()
    {
        return  this.width;
    }

    public int getlength()
    {
        return  this.height;
    }


}
