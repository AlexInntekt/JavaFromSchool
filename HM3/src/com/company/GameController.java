import com.company.Deck;
import com.company.PlayingCard;

import java.util.Collections;

public class GameController
{

    Deck firstPlayer = new Deck();
    Deck secondPlayer = new Deck();

    public void prepareGame()
    {
        firstPlayer.createFreshPack();
        firstPlayer.shuffle();

        secondPlayer.createFreshPack();
        secondPlayer.shuffle();
    }

    public void startGame()
    {
        confrontCards();
    }



    public void confrontCards()
    {
        PlayingCard one = firstPlayer.popOutCard();
        PlayingCard two = secondPlayer.popOutCard();

        System.out.print("Player 1: " + one.itsRank + " " + one.itsSuit);
    }


}
