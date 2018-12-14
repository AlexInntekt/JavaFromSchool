package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuUI extends Frame
{
    Label labelOne = new Label("Name ");
    TextField textFieldOne=new TextField("Ionel",20);

    Label labelTwo = new Label("Surname ");
    TextField textFieldTwo=new TextField("Petrescu",20);

    Label output = new Label("City ");
    TextField textFieldThree=new TextField("Bucharest",20);

    private Button insert;
    private Button show;

    Panel p=new Panel();
    Panel p2=new Panel();

    public menuUI()
    {
        super("Insert a person in the DB");

        setSize(400,750);
        //setLayout(new GridLayout(12,12));
        setLayout(new GridLayout(12,12));

        add(labelOne);
        add(textFieldOne);
        add(labelTwo);
        add(textFieldTwo);
        add(output);
        add(textFieldThree);

        insert = new Button ("Insert a new person");
        show = new Button("Show DB");
        add(insert);
        add(show);

        insert.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                System.out.print("\n Serialize object 'person' \n");

                ArchiveManager.write("alex","manolescu",23,22,"M","Furth","Romania","1 mai");
//                System.out.println("result");
//
//
//
//                currentResult=Double.valueOf(textFieldOne.getText())*Double.valueOf(textFieldTwo.getText());
//
//                textFieldThree.setText(String.valueOf(currentResult));

            }
        });

        show.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                System.out.print("\n Displaying objects. Deserialize\n");

                  ArchiveManager.read();
//                System.out.println("result");
//
//
//
//                currentResult=Double.valueOf(textFieldOne.getText())*Double.valueOf(textFieldTwo.getText());
//
//                textFieldThree.setText(String.valueOf(currentResult));

            }
        });
    }

}