package com.company;

 enum suit
{
    CLUBS, DIAMONDS, SPADES, HEARTS
}

 enum rank
{
    A, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K
}

public class PlayingCard
{
   public PlayingCard(suit s, rank r)
   {
       this.itsSuit = s;
       this.itsRank = r;
   }

   public suit itsSuit;
   public rank itsRank;
}


