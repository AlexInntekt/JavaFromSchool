package com.company;

import java.awt.*;
import java.awt.event.*;

public class myW extends Frame
{
    public TextArea ta = new TextArea("Hey :)");
    public CheckboxGroup cbg = new CheckboxGroup();

    public Panel alfa = new Panel();
    public Panel beta = new Panel();

    public Button btn = new Button("press me :)");

    public List list = new List();

    public Choice ch = new Choice();

    public myW()
    {
         setSize(500,500);
         setLayout(new GridLayout(1,2));

         alfa.add(ta);
         alfa.add(new Checkbox("male",cbg,true));
         alfa.add(new Checkbox("female",cbg,false));
         list.addItem("portocale");
         list.addItem("lamai");
         ch.addItem("esti prost");
         ch.addItem("esti natang");
         ch.addItem("sau nu stii sa numeri");

         alfa.add(ch);
         alfa.add(list);

         btn.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
                {

                    System.out.println(cbg.getSelectedCheckbox().getLabel());
                    System.out.println(ta.getText());
                    System.out.println(list.getSelectedItem());
                    System.out.println(ch.getSelectedItem());
                }

        });

         add(alfa);
         add(beta);

        beta.add(btn);
    }
}
