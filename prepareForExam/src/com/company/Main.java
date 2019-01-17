package com.company;

public class Main
{
    public enum Procesor{I1, I2, I3};

    public static void main(String[] args)
    {
        Procesor mypro = Procesor.I1;
//        System.out.print(mypro);
        division mydiv = new division();

        System.out.println(mydiv.result(3,0));



	// write your code here
    }
}
