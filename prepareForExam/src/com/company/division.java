package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class division implements Computation
{
    public double result(double a, double b) throws Exception
    {

        if(b==0)
        {
            throw new Exception("You can not divide with 0");
        }
        double result=a/b;

        return result;
    }
}
