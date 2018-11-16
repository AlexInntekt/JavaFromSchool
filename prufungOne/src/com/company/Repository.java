package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Repository
{
    public List<Article> articole = new ArrayList<Article>();

    public void checkRepo()
    {
        for(int i=0; i<this.articole.size(); i++)
        {
            for(int j=0; j<this.articole.size(); j++)
            {
                if(i!=j && this.articole.get(i).name==this.articole.get(j).name)
                {
                    this.articole.get(j).name = this.articole.get(j).name + "copy";
                    System.out.println("ohfowhG0H");
                }
            }

        }
    }

    public void display()
    {
        for(int i=0; i<this.articole.size(); i++)
        {
            Article ar = new Article();
            ar = this.articole.get(i);
            System.out.println(ar.name);
        }
    }

}
