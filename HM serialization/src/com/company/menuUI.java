package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuUI extends Frame
{
    Label labelOne = new Label("Name ");
    TextField Name=new TextField("Ionel",20);

    Label labelTwo = new Label("Surname ");
    TextField Surname=new TextField("Petrescu",20);

    Label output = new Label("City ");
    TextField City=new TextField("Bucharest",20);

    TextArea itsOutput = new TextArea("-//-");


    private Button insert;
    private Button show;

    Panel p=new Panel();
    Panel p2=new Panel();

    public menuUI()
    {
        super("Insert a person in the DB");

        setSize(600,750);
        setLayout(new GridLayout(6,2));
//        p.setLayout(new GridLayout(12,12));
//        p2.setLayout(new GridLayout(12,12));



        add(labelOne);
        add(Name);
        add(labelTwo);
        add(Surname);
        add(output);
        add(City);




        insert = new Button ("Insert a new person");
        show = new Button("Show DB");
        add(insert);
        add(show);

        add(itsOutput);

//        add(p);
//        add(p2);

        insert.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                System.out.print("\n Serialize object 'person' \n");



                ArchiveManager.write(Name.getText(),Surname.getText(),23,22,"M",City.getText(),"Romania","1 mai");
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



                  itsOutput.setText(ArchiveManager.getAsString());
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