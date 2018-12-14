package com.company;

import java.io.*;
import java.util.ArrayList;

public class ArchiveManager
{
    public static void write(String setName, String setSurname, int setSSN, int setAge, String setGender, String setCity, String setCountry, String setAdress)
    {

        Person one = new Person(setName,setSurname,setSSN,setAge,setGender,setCity,setCountry, setAdress);

        ArrayList<Person> archive=new ArrayList<>();
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

    public static ArrayList<Person> read()
    {
        ArrayList<Person> list=new ArrayList<>();


        try {
            FileInputStream fileIn = new FileInputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            list = (ArrayList<Person>) in.readObject();
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
            Person current = list.get(i);
            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + current.name + " " + current.surname);
            System.out.println("Gender: " + current.gender);
            System.out.println("Age: " + current.age);
            System.out.println("City: " + current.city);
            System.out.println("Country: " + current.country);
            System.out.println("Adress: " + current.adress);
            System.out.println("SSN: " + current.SSN);
            System.out.println("\n\n\n___________________\n");
        }

        return list;
    }


    public ArchiveManager()
    {
        //constructor:
        //(setName, setSurname, setSSN, setAge, setGender, setCity, setCountry)
        Person one = new Person("Keli","Malinghton",124,22,"F","Thompson","UK", "Ave Etilka 23");
        Person two = new Person("Richard","Mollen",331,31,"M","Thompson","USA", "str Roses, 91");
        Person three = new Person("Vasile","Dumitrescu",273,29,"M","Thompson","Romania", "str Lorry, 23 bis");


        ArrayList<Person> archive=new ArrayList<>();

        archive.add(one);
        archive.add(two);
        archive.add(three);


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


    public static String getAsString()
    {
        ArrayList<Person> list = read();
        String output="";

        for(int i=0; i<list.size(); i++)
        {
            Person c = list.get(i);
            String str = i +") "+c.name + " " + c.surname + ". Age: " + c.age + " years old. Gender: "+ c.gender + ". Country: " + c.country + "\n";
            output=output+str;
        }

        return output;

    }
}
