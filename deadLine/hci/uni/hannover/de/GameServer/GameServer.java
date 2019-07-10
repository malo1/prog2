package hci.uni.hannover.de.GameServer;

public class GameServer{
    private Client[] players;
    private int turnOf;


    public void GameServer(Client[] players){
        this.turnOf = 0;
        this.players = players;

    }
}