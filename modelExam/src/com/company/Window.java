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

    public Company c = new Company();

    public Window(Company setc)
    {
        this.c = setc;

        setSize(500,300);

        //setLayout(new GridLayout(12,12));
        setLayout(new GridLayout(1,2));

        panelBeta.setLayout(new GridLayout(5,2,5,5));


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


        MenuBar mb=new MenuBar();
        Menu m=new Menu("File");
                MenuItem mi1=new MenuItem("New Project");
                m.add(mi1);
        MenuItem mi2=new MenuItem("Open Project");
                m.add(mi2);
        Menu m1=new Menu("Import project");
                MenuItem mi3=new MenuItem("Import as ZIP");
                m1.add(mi3);
        MenuItem mi4=new MenuItem("Import as Eclipse project");
                m1.add(mi4);
        m.add(m1);
        m.addSeparator();
        MenuItem exit=new MenuItem("Exit");
                m.add(exit);
        mb.add(m);
        setMenuBar(mb);



        add.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String typeOfEmployee = cb.getSelectedCheckbox().getLabel();
                if(typeOfEmployee=="Engineer")
                {
                    Engineer newEng = new Engineer(Integer.valueOf(projectIdField.getText()),employeeNameField.getText());
                    System.out.println(newEng);
                    c.addEmployee(newEng);
                }


                System.out.println(' ');

            }
        });
    }






}
