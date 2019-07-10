package hci.uni.hannover.de.Client;

import hci.uni.hannover.de.GameServer.Cards;

public class Client{
    private Cards[] hand;
    private String name;
    private String move;

    public void Client(String name, Cards[] hand){
        this.name = name;
        this.hand = hand;


    }

    public void sendMove(){
        /*
        // upstream.start;
         //
        // Server.send(move);
         //
         upstream.flush();
         upstream.close();
         server.getUpdate();
        */
            System.out.println(move);
        }



}