package com.company;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Window extends Frame
{
    Panel panelAlpha=new Panel();
    public Label title = new Label("title");

    public Window()
    {
        setSize(400,400);
        //setLayout(new GridLayout(12,12));
        setLayout(new GridLayout(6,24));
        
        panelAlpha.add(title);
        add(panelAlpha);
    }



}
