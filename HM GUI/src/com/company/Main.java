package com.company;
import java.awt.*;
import java.io.*;
import java.awt.event.*;


public class Main
{

    public static void main(String[] args)
    {

        BookFrame m = new BookFrame();
        m.setVisible(true);





    }


}

class BookFrame extends Frame
{
    public TextField text;
    public TextArea tArea;
    private Button button1;
    Panel p=new Panel();
    Panel p2=new Panel();

    Label labelOne = new Label("Primul numar: ");
    TextField textFieldOne=new TextField("1",20);


    Label labelTwo = new Label("Al doilea numar: ");
    TextField textFieldTwo=new TextField("2",20);


    Label output = new Label("Rezultat ");


    String currentOperation="addition";


    public void add()
    {
        currentOperation="addition";
    }

    public void substraction()
    {
        currentOperation="substraction";
    }

    public void multiplication()
    {
        currentOperation="multiplication";
    }

    public void division()
    {
        currentOperation="division";
    }


    public BookFrame()
    {

        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                output.setText("Ok Button clicked.");
            }


        super("Add new book");



            setSize(400,600);
            //setLayout(new GridLayout(12,12));
            setLayout(new GridLayout(12,12));

            add(labelOne);
            add(textFieldOne);
            add(labelTwo);
            add(textFieldTwo);
            add(output);



            button1 = new Button ("Save");
            //add(button1);
        button1.setLabel("Add");

        });


        p.add(button1,0);

        add(p);
        add(p2);
    }
}







