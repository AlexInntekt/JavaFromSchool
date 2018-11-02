package com.company;
import java.awt.*;
import java.io.*;
import java.util.List;



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
    private Button button1, button2;

     Label labelOne = new Label("Title: ");
     TextField textFieldOne=new TextField("Moara cu Noroc",20);


     Label labelTwo = new Label("ISBN: ");
     TextField textFieldTwo=new TextField("F823Y08F2Y3",20);





     public BookFrame()
    {
        super("Add new book");
        setSize(400,600);
        setLayout(new GridLayout(8,4));

        add(labelOne);
        add(textFieldOne);
        add(labelTwo);
        add(textFieldTwo);

        add(new Label("Used: "));

        add(new Checkbox("yes/no", null, true));

//
//        text = new TextField(20);
//        text.setText("introdu date");
//
//        add(text);
//
//        button1 = new Button ("Save");
//        add(button1);
//
//        button1.setLabel("Save as");
//        button2 = new Button ("Cancel");
//        add(button2);
//
//        tArea=new TextArea(10,20);
//        add(tArea);
//        tArea.setText("Hi");
//        tArea.append("John");
//        tArea.insert(" ",2);
    }
}







