package hci.uni.hannover.de.Server;

import hci.uni.hannover.de.GameServer;
import hci.uni.hannover.de.Client;
import java.util.concurrent.TimeUnit;
import hci.uni.hannover.de.Controller;

public class Server{
    private Client[] players;
    private Cards[][] hands;
    private String[] names;
    private int n;
    public  int startButton;

/**
 * start a server on a device.
 */
public void Server(){
        n = 1;
        waitForPlayers();

        this.players = new Client[n];
        //get players from Connection function, todo

        //Now create instances of the cards.
        hands = new Cards[n+1][3];
        Deck deck = new Deck();
        //Now we have to shuffle the cards.
        deck = deck.shuffle();
        //Give each of the n players 3 cards.
        hands = deck.getHands(n+1);
        Card[] queue = deck.getQ(n+1);

        //Create instances of Clients/players by their name.
        players[0] = new Client(names[0],hands[0]);
        players[1] = new Client(names[1],hands[1]);
        players[2] = new Client(names[2],hands[2]);
        players[3] = new Client(names[3],hands[3]);
        Card[] stack = new Card[3];
        stack = hands[n+1];
        Controller.setHand(hands[0]);
        Controller.setStack(stack);

        //Start the game.
        GameServer game = new GameServer(players, deck, hands);
    }
/**
 * Waiting until the lobby is full (4 players) or until the host decides to start.
 */
public void waitForPlayers(){
        startButton = 0;
        while(startButton == 0 && n < 4){
            TimeUnit.SECONDS.sleep(1);
        }
    }


}