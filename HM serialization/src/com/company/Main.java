package com.company;
import java.io.*;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        Employee s = new Employee();
        s.name = "Reyan Ali";
        s.address = "Phokka Kuan, Ambehta Peer";
        s.SSN = 11122333;
        s.number = 101;

        Employee d = new Employee();
        d.name = "Mulhabar";
        d.address = "Palaka Mahalakaa";
        d.SSN = 53636;
        d.number = 45;

        ArrayList<Employee> archive=new ArrayList<>();
                            archive.add(s);
                            archive.add(d);



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






        ArrayList<Employee> list=new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            list = (ArrayList<Employee>) in.readObject();
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
            Employee current = list.get(i);
            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + current.name);
            System.out.println("Address: " + current.address);
            System.out.println("SSN: " + current.SSN);
            System.out.println("Number: " + current.number);
            System.out.println("\n___________________\n\n");
        }





    }
}
