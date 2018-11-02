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
    private Button button1, button2, button3;

     Label labelOne = new Label("Title: ");
     TextField textFieldOne=new TextField("Moara cu Noroc",20);


     Label labelTwo = new Label("ISBN: ");
     TextField textFieldTwo=new TextField("F823Y08F2Y3",20);





     public BookFrame()
    {


        super("Add new book");



        setSize(400,600);
        //setLayout(new GridLayout(12,12));
        setLayout(new GridLayout(4,8));

        add(labelOne);
        add(textFieldOne);
        add(labelTwo);
        add(textFieldTwo);

        add(new Label("Used: "));
        add(new Checkbox("yes/no", null, true));

        CheckboxGroup cbg = new CheckboxGroup();
        add(new Label("Binding: "));
        add(new Checkbox("Hardblahblah", cbg, true));
        add(new Checkbox("paperback", cbg, false));


        add(new Label("Type of book: "));
        List list1 = new List(1, false);
        list1.addItem("Beletristica");
        list1.addItem("Psihologie");
        list1.addItem("Dezvoltare personala");
        add(list1);



        button1 = new Button ("Save");
        add(button1);
        button1.setLabel("Add");
        button2 = new Button ("Clear");
        add(button2);
        button3 = new Button ("Exit");
        add(button3);

        Panel p=new Panel();
        p.setSize(200, 150);
        Panel[] pi=new Panel[3];
        for(int i=0; i<3; i++) {
            pi[i] = new Panel();
            pi[i].setSize(200, 50);
            switch (i) {
                case 0:
                    pi[0].setBackground(Color.red);
                    break;
                case 1:
                    pi[1].setBackground(Color.yellow);
                    break;
                case 2:
                    pi[2].setBackground(Color.blue);
            }
            p.add(pi[i]);
        }


        add(p);
    }
}







