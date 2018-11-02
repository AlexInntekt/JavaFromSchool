package com.company;
import java.awt.*;
import java.io.*;




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
        setLayout(new GridLayout(12,2));

        add(labelOne);
        add(textFieldOne);
        add(labelTwo);
        add(textFieldTwo);

        add(new Label("Used: "));

        add(new Checkbox("yes/no", null, true));

        add(new Label("Type of book: "));
        List list1 = new List(1, false);
        list1.addItem("Beletristica");
        list1.addItem("Psihologie");
        list1.addItem("Dezvoltare personala");
        add(list1);

//        Canvas c=new Canvas();
////        c.resize(40,40);
////        c.setBackground(Color.black);
////        add(c);


    }
}







