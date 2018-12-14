package com.company;

import java.io.*;
import java.util.ArrayList;

public class ArchiveManager
{
    public static void update(String setProduct, double setPrice, int quantity)
    {


        Product updated = new Product(setProduct,setPrice,quantity);

        ArrayList<Product> archive=new ArrayList<>();
        if(read()!=null)
        {
            archive = read();
        }

        for(int i=0;i<archive.size();i++)
        {
            if(archive.get(i).product==setProduct)
            {
                archive.remove(i);
            }
        }
        archive.add(updated);

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(archive);


            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /users/alex/desktop/DataStreamLab/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void write(String setProduct, double setPrice)
    {


        Product one = new Product(setProduct,setPrice);

        ArrayList<Product> archive=new ArrayList<>();
        if(read()!=null)
        {
            archive = read();
        }

        archive.add(one);

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(archive);


            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /users/alex/desktop/DataStreamLab/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static ArrayList<Product> read()
    {
        ArrayList<Product> list=new ArrayList<>();



        try {
            FileInputStream fileIn = new FileInputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            list = (ArrayList<Product>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return null;
        }




        System.out.print("\n\n");

        for(int i=0;i<list.size();i++)
        {
            Product current = list.get(i);
            System.out.println("Deserialized Product...");
            System.out.println("Name: " + current.product);
            System.out.println("Price: " + current.price);

            System.out.println("\n\n\n___________________\n");
        }

        return list;
    }


    public static void initiate()
    {
        //constructor:
        //(setName, setSurname, setSSN, setAge, setGender, setCity, setCountry)
        Product one = new Product("banane",23);


        ArrayList<Product> archive=new ArrayList<>();

        archive.add(one);



        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(archive);


            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /users/alex/desktop/DataStreamLab/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }


//    public static String getAsString()
//    {
//
//
//        ArrayList<Product> list = read();
//        String output="";
//
//        for(int i=0; i<list.size(); i++)
//        {
//            Product c = list.get(i);
//           // String str = i +") "+c.name + " " + c.surname + ". Age: " + c.age + " years old. Gender: "+ c.gender + ". Country: " + c.country + "\n";
//            output=output+str;
//        }
//
//        return output;
//
//    }
}
