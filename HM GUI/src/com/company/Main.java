package com.company;
import java.awt.*;
import java.io.*;
import java.awt.event.*;


public class Main
{

    public static void main(String[] args)
    {

//        calculator m = new calculator();
//        m.setVisible(true);

        shoper n = new shoper();
        n.setVisible(true);





    }
}



class shoper extends Frame
{
    public TextField text;
    public TextArea tArea;
    double currentResult=0;
    private Button buy;

    Panel p=new Panel();
    Panel p2=new Panel();

    Label labelOne = new Label("Product ");
    TextField textFieldOne=new TextField("1",20);


    Label labelTwo = new Label("Quantity ");
    TextField textFieldTwo=new TextField("2",20);


    Label output = new Label("Total ");
    TextField textFieldThree=new TextField(" ",20);





    public shoper()
    {



        super("shoppul mieu :P");



        setSize(400,400);
        //setLayout(new GridLayout(12,12));
        setLayout(new GridLayout(6,24));

        add(labelOne);
        add(textFieldOne);
        add(labelTwo);
        add(textFieldTwo);
        add(output);
        add(textFieldThree);



        buy = new Button ("buy");

        p.add(buy,0);


        add(p);
        add(p2);


        buy.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               System.out.println("result");

                currentResult=Double.valueOf(textFieldOne.getText())*Double.valueOf(textFieldTwo.getText());

                textFieldThree.setText(String.valueOf(currentResult));

            }
        });


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



        super("un caculatol :P");



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







