package com.company;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Main
{

    public static void main(String[] args)
    {

//        calculator m = new calculator();
//        m.setVisible(true);

        //ArchiveManager.initiate();
        //ArchiveManager.write("kaki",4);

        shoper n = new shoper();
        n.setVisible(true);





    }
}



class shoper extends Frame implements ItemListener
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


    Choice productChooser = new Choice();

    ArrayList<Product> list = new ArrayList<Product>();
    Product current = new Product();


    public shoper()
    {



        super("shoppul mieu :P");



        setSize(400,400);
        //setLayout(new GridLayout(12,12));
        setLayout(new GridLayout(6,24));




                           list=ArchiveManager.read();
        for(int i=0; i<list.size();i++)
        {
            productChooser.add(list.get(i).product);
        }
        productChooser.addItemListener(this);


        textFieldTwo.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                //displayMessage("Focus gained", e);
            }

            public void focusLost(FocusEvent e)
            {
                double sum=0;
                for(int i=0; i<list.size(); i++)
                {
                    if(list.get(i)==current)
                    {
                        sum = Double.valueOf( String.valueOf(textFieldTwo.getText())  ) * Double.valueOf(current.price);

                        System.out.print("Price: " + current.price);
                    }
                }
                textFieldThree.setText(String.valueOf(sum));
            }

//            void displayMessage(String prefix, FocusEvent e) {
//                System.out.println(prefix
//                        + (e.isTemporary() ? " (temporary):" : ":")
//                        + e.getComponent().getClass().getName()
//                        + "; Opposite component: "
//                        + (e.getOppositeComponent() != null ? e.getOppositeComponent().getClass().getName()
//                        : "null"));
//            }

        });


        add(labelOne);
        add(productChooser);
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


    public void itemStateChanged(ItemEvent e)
    {
        String str = productChooser.getSelectedItem();         // returns the selected item as a string
        int num = productChooser.getSelectedIndex();           // returns the selected item as a integer
        System.out.println(">>"+str);

        for(int i=0;i<list.size();i++)
        {
            current = list.get(i);
        }

    }



}














