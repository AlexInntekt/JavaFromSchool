package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args)
    {
        Employee s = new Employee();
        s.name = "Reyan Ali";
        s.address = "Phokka Kuan, Ambehta Peer";
        s.SSN = 11122333;
        s.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /users/alex/desktop/DataStreamLab/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }






        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("/users/alex/desktop/DataStreamLab/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
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

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);

    }
}
