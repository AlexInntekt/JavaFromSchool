package com.company;



public class GameController
{

    Deck firstPlayer = new Deck();
    Deck secondPlayer = new Deck();

    int playerOneScore=0;
    int playerTwoScore=0;

    int turns = 0;

    public void prepareGame()
    {
        System.out.print("\nPlease wait! Loading game...");
        System.out.print("\nPreparing pack...");
        System.out.print("\nPreparing cards...");

        Deck myDeck = new Deck();

        myDeck.createFreshPack();


        System.out.print("\nShuffling the cards in pack..");
        myDeck.shuffle();


        System.out.print("\nAssigning cards for each player..");
        firstPlayer.listOfCards = myDeck.listOfCards.subList(0,myDeck.listOfCards.size()/2);
        secondPlayer.listOfCards = myDeck.listOfCards.subList(myDeck.listOfCards.size()/2,myDeck.listOfCards.size());

        System.out.print("\nThe cards of first player are: \n");
        firstPlayer.display();
        System.out.print("\n______\n");
        System.out.print("\nThe cards of second player are: \n");
        secondPlayer.display();


    }

    public void startGame()
    {
        System.out.print("\nReady to start the game! ");

        for(int i=0; i<25; i++)
        {
            confrontCards();
        }

        gameOver();
    }

    public void gameOver()
    {
        if(this.playerOneScore>this.playerTwoScore)
        {
            System.out.print("Player one is victorious!\n");
        }
        if(this.playerOneScore<this.playerTwoScore)
        {
            System.out.print("Player two is victorious!\n");
        }
        if(this.playerOneScore==this.playerTwoScore)
        {
            System.out.print("Egalitate!");
        }

        System.out.print("\nScore of player one: "+playerOneScore);
        System.out.print("\nScore of player two: "+playerTwoScore);

    }



    public void confrontCards()
    {
        this.turns += 1;
        System.out.print("\nConfrontaion no. " + this.turns + "\n");
        PlayingCard one = firstPlayer.listOfCards.get(this.turns-1);
        PlayingCard two = secondPlayer.listOfCards.get(this.turns-1);

        System.out.print("Player 1       vs       Player 2\n");
        System.out.print(one.itsRank + " " + one.itsSuit);

        if(one.itsRank.compareTo(two.itsRank)>0)
        {
            System.out.print("     >     ");
            this.playerOneScore++;
        }
        if(one.itsRank.compareTo(two.itsRank)<0)
        {
            System.out.print("     <     ");
            this.playerTwoScore++;
        }
        if(one.itsRank.compareTo(two.itsRank)==0)
        {
            System.out.print("     =     ");
        }


        System.out.print(two.itsRank + " " + two.itsSuit);

        System.out.print("\n");

    }


}
