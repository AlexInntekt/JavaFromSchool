package com.company;
import java.io.*;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        //constructor:
        //(setName, setSurname, setSSN, setAge, setGender, setCity, setCountry)
        Person one = new Person("Keli","Malinghton",124,22,"F","Thompson","UK", "Bvd Etilka 23");
        Person two = new Person("Richard","Wolshire",331,31,"M","Thompson","Netherlands", "str Roses, 91");




        ArrayList<Person> archive=new ArrayList<>();
                            archive.add(one);
                            archive.add(two);



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






        ArrayList<Person> list=new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            list = (ArrayList<Person>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
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





    }
}
