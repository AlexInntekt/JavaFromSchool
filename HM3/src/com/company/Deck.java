package com.company;
import java.util.ArrayList;
import java.util.List;

public class Deck
{

   List<PlayingCard> listOfCards = new ArrayList<PlayingCard>();

   public void createPack()
   {
       for (suit d : suit.values()) {
           System.out.println(d);
       }
   }
}
