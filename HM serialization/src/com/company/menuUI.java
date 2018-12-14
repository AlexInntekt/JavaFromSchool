package com.company;

import java.awt.*;

public class menuUI extends Frame
{
    Label labelOne = new Label("Product ");
    TextField textFieldOne=new TextField("1",20);

    Label labelTwo = new Label("Quantity ");
    TextField textFieldTwo=new TextField("2",20);

    Label output = new Label("Total ");
    TextField textFieldThree=new TextField(" ",20);

    public menuUI()
    {
        super("Insert a person in the DB");

        setSize(400,400);
        //setLayout(new GridLayout(12,12));
        setLayout(new GridLayout(6,24));

        add(labelOne);
        add(textFieldOne);
        add(labelTwo);
        add(textFieldTwo);
        add(output);
        add(textFieldThree);
    }

}