package com.company;


import java.util.Collections;

public class Main
{

    public static void main(String[] args)
    {
//	   Deck myDeck = new Deck();
//	   Deck one = new Deck();
//	   Deck two = new Deck();




	   //myDeck.createFreshPack();
	   //myDeck.shuffle();
	   //myDeck.display();

        GameController game = new GameController();
        game.prepareGame();
        game.startGame();



    }
}
