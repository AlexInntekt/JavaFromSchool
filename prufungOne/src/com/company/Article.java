package com.company;
import java.util.Date;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Article implements Comparable<Article>
{
    public Article()
    {

    }

    public Article(String n, String firstAuth, String uni, int pag)
    {
        this.name = n;
        this.authors.add(firstAuth);
        this.university = uni;
        this.pages = pag;

    }

    public String name;
    public List authors = new ArrayList<String>();
    public String university;
    public int pages;
    //Date submissionDate = new Date();

    @Override
    public int compareTo(final Article o)
    {
        int res = 0;

        res = this.name.compareTo(o.name);

        return res;

    }

}
