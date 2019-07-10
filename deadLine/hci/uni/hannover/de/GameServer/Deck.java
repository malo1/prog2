package hci.hannover.de.GameServer;

import java.util.*;


public class Deck{
    private Card[] gameCards;

    Deck(){
        int j = 0;
        gameCards = new Card[32];
        private Object[] cardData = new Object[]{
                KREUZASS, 11, PIKASS, 11, HERZASS, 11, KAROASS, 11,
                KREUZKOENIG, 10, PIKKOENIG, 10, HERZKOENIG, 10, KAROKOENIG, 10,
                KREUZDAME, 10, PIKDAME, 10, HERZDAME, 10, KARODAME, 10,
                KREUZBUBE, 10, PIKBUBE, 10, HERZBUBE, 10, KAROBUBE, 10,
                KREUZZEHN, 10, PIKZEHN, 10, HERZZEHN, 10, KAROZEHN, 10,
                KREUZNEUN, 9, PIKNEUN, 9, HERZNEUN, 9, KARONEUN, 9,
                KREUZACHT, 8, PIKACHT, 8, HERZACHT, 8, KAROACHT, 8,
                KREUZSIEBEN, 7, PIKSIEBEN, 7, HERZSIEBEN, 7, KAROSIEBEN, 7
        }

        for (int i = 0; i < 64; i += 2) {
            gameCards[j] = new Card(cardData[i], cardData[i+1];
        }

    }

    private Card[] shuffle(){
        List cards = Collections.shuffle(Arrays.asList(this));
        return cards.toArray();
    }

    private Card[][] getHands(int n){
        Card[][] hands = new Card[n][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hands[i][j] = gameCards.getCard(i*3 + j);
            }
        }
    }
    private Card[] getQ(int n){
        Card[] queue = new Card[32-n*3];
        for (int i = 0; i < 32-n*3; i++) {
            queue[i] = gameCards[i+n*3];
        }
    }

    private void setCard(Card set, int position){
        gameCards[position] = set;
    }
    private Card getCard(int position){
        return gameCards[position];
    }
}