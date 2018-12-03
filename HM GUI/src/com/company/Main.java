package com.company;
import java.awt.*;
import java.io.*;
import java.awt.event.*;


public class Main
{

    public static void main(String[] args)
    {

        calculator m = new calculator();
        m.setVisible(true);







    }


}

class calculator extends Frame
{
    public TextField text;
    public TextArea tArea;

    private Button add;
    private Button substract;
    private Button multiply;
    private Button divide;

    Panel p=new Panel();
    Panel p2=new Panel();

    Label labelOne = new Label("Primul numar: ");
    TextField textFieldOne=new TextField("1",20);


    Label labelTwo = new Label("Al doilea numar: ");
    TextField textFieldTwo=new TextField("2",20);


    Label output = new Label("Rezultat ");


    String currentOperation="addition";
    double currentResult=0;


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


    public calculator()
    {



        super("Add new book");



            setSize(400,600);
            //setLayout(new GridLayout(12,12));
            setLayout(new GridLayout(12,12));

            add(labelOne);
            add(textFieldOne);
            add(labelTwo);
            add(textFieldTwo);
            add(output);



            add = new Button ("add");
            substract = new Button ("substract");
            multiply = new Button ("multiply");
            divide = new Button ("divide");




        p.add(add,0);
        p.add(substract,0);
        p.add(multiply,0);
        p.add(divide,0);

        add(p);
        add(p2);


        add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                currentResult=Double.valueOf(textFieldOne.getText())+Double.valueOf(textFieldTwo.getText());

                output.setText(String.valueOf(currentResult));
            }
        });

        substract.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                currentResult=Double.valueOf(textFieldOne.getText())-Double.valueOf(textFieldTwo.getText());

                output.setText(String.valueOf(currentResult));
            }
        });


        multiply.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                currentResult=Double.valueOf(textFieldOne.getText())*Double.valueOf(textFieldTwo.getText());

                output.setText(String.valueOf(currentResult));
            }
        });


        divide.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(textFieldOne.getText().equals("0"))
                {
                    output.setText("infinity :P");
                }
                else
                {
                    currentResult=Double.valueOf(textFieldOne.getText())/Double.valueOf(textFieldTwo.getText());
                    output.setText(String.valueOf(currentResult));
                }



            }
        });


    }
}







