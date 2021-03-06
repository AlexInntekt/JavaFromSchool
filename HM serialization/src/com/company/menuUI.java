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

    CheckboxGroup gender = new CheckboxGroup();

    Label output = new Label("City ");
    TextField City=new TextField("Bucharest",20);

    Label countryLabel = new Label("Country ");


    TextArea itsOutput = new TextArea("-//-");

    List country;


    private Button insert;
    private Button show;

    Panel p=new Panel();
    Panel p2=new Panel();

    public menuUI()
    {
        super("Insert a person in the DB");

        setSize(600,750);
        setLayout(new GridLayout(12,2));
//        p.setLayout(new GridLayout(12,12));
//        p2.setLayout(new GridLayout(12,12));



        country=new List(1, false);
        country.add("Romania");
        country.add("USA");
        country.add("Germany");
        country.add("Italy");
        country.add("France");
        country.add("Norway");





        add(labelOne);
        add(Name);
        add(labelTwo);
        add(Surname);
        add(countryLabel);
        add(country);
        add(output);
        add(City);

        add(new Checkbox("Male", gender, true));
        add(new Checkbox("Female", gender, false));



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

                if(ArchiveManager.read()==null)
                {
                    ArchiveManager.initiate();
                }

                ArchiveManager.write(Name.getText(),Surname.getText(),23,22,gender.getSelectedCheckbox().getLabel(),City.getText(),country.getSelectedItem().toString(),"1 mai");
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

                if(ArchiveManager.read()==null)
                {
                    ArchiveManager.initiate();
                }

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