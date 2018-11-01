package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Deck
{

   List<PlayingCard> listOfCards = new ArrayList<PlayingCard>();

   public void removeAll()
   {
       listOfCards.clear();
   }

   public void createFreshPack()
   {
       listOfCards.clear();

       for (rank r : rank.values())
       {
           //System.out.println(r);

           for (suit s : suit.values())
           {
               //System.out.print(s);
               //System.out.println(" " + r);

               PlayingCard addnew = new PlayingCard(s,r);
               this.listOfCards.add(addnew);
           }
       }
   }

   public void display()
   {
       for(int i=0; i<listOfCards.size(); i++)
       {
           System.out.print(listOfCards.get(i).itsRank + "  ");
           System.out.print(listOfCards.get(i).itsSuit + " \n");
       }
   }


   public void shuffle()
   {
       Collections.shuffle(this.listOfCards);
   }


   public PlayingCard popOutCard()
   {
       return listOfCards.remove(0);
   }
}
