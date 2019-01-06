package com.company;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Window extends Frame
{
    Panel panelAlpha=new Panel();
    Panel panelBeta=new Panel();
    public Label title = new Label("title");
    public TextArea textArea = new TextArea("Projects");
    public Button getProjects = new Button("get projects");

    public Label projectId = new Label("Project ID:");
    public TextField projectIdField = new TextField("");
    public Label employeeName = new Label("Employee Name: ");
    public TextField employeeNameField = new TextField("");

    public CheckboxGroup cb = new CheckboxGroup();

    public Button add = new Button("Submit");

    public Window()
    {
        setSize(500,300);

        //setLayout(new GridLayout(12,12));
        setLayout(new GridLayout(1,2));



        panelAlpha.add(textArea);
        panelAlpha.add(new Label("Projects"));
        panelAlpha.add(getProjects);

        panelBeta.add(projectId);

        panelBeta.add(projectIdField);

        panelBeta.add(employeeName);
        panelBeta.add(employeeNameField);

        //panelBeta.add(cb);
        panelBeta.add(new Checkbox("Engineer", cb, true));
        panelBeta.add(new Checkbox("Manager", cb, false));
        panelBeta.add(add);


        add(panelAlpha);
        add(panelBeta);

        add.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String typeOfEmployee = cb.getSelectedCheckbox().getLabel();
                if(typeOfEmployee=="Engineer")
                {
                    Engineer newEng = new Engineer(Integer.valueOf(projectIdField.getText()),employeeNameField.getText());
                    System.out.println(newEng);
                }


                System.out.println(' ');

            }
        });
    }





}
