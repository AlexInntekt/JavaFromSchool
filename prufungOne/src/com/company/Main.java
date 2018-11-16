package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Article DespreBaieti = new Article("G","Georgel Matei", "UPB ", 14);
        Article DespreFete = new Article("K","Georgel Lenuta", "UPB ", 24);
        Article A = new Article("A","Georgel Lenuta", "UPB ", 24);

        Repository repo = new Repository();
                   repo.articole.add(DespreBaieti);
                   repo.articole.add(DespreFete);
                   repo.articole.add(A);
                   Collections.sort(repo.articole);
                   repo.checkRepo();
                   repo.display();


                   //System.out.println( repo.articole.get(0).compareTo(repo.articole.get(1)) );

        Map<String,Integer> map = new HashMap<String,Integer>();
                            map.put("first", 100);

                            System.out.println(map.get("first"));

        throw new java.lang.RuntimeException("this is not quite as bad");
    }
}

























