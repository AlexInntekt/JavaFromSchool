package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class division implements Computation
{
    public double result(double a, double b)
    {
        double result=0;
        try
        {
            result = a/b;
        }
        catch(IOException e)
        {
//            System.out.println(e);
        }



        return result;
    }
}
