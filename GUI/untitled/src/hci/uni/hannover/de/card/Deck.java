package hci.uni.hannover.de.card;


import java.util.Collection;
import java.util.Collections;
import java.util.*;

/**
 * @author Daniel Hennies
 * @Version 1.0
 * The deck consist 32 elements of the type Cards
 */


public class Deck {
    ArrayList<Cards> deck = new ArrayList<Cards>();
    public Deck(){
        Collections.addAll(deck,Cards.HERZACHT,Cards.HERZASS,Cards.HERZBUBE,Cards.HERZDAME, Cards.HERZKOENIG,Cards.HERZNEUN,Cards.HERZSIEBEN,Cards.HERZZEHN,Cards.KAROACHT,Cards.KAROASS,Cards.KAROBUBE,Cards.KARODAME,Cards.KAROKOENIG,Cards.KARONEUN,Cards.KAROSIEBEN,Cards.KAROZEHN,Cards.KREUZACHT,Cards.KREUZASS,Cards.KREUZBUBE,Cards.KREUZDAME,Cards.KREUZKOENIG,Cards.KREUZNEUN,Cards.KREUZSIEBEN,Cards.KREUZZEHN,Cards.PIKACHT,Cards.PIKASS,Cards.PIKBUBE,Cards.PIKDAME,Cards.PIKKOENIG,Cards.PIKNEUN,Cards.PIKSIEBEN,Cards.PIKZEHN);
    }

    public Cards getCard(){
        return deck.get(deck.size()-1);
    }

    public void setCards(Cards card){
        deck.add(card);
    }

    public void shuffle(){
        ArrayList<int> positions = new ArrayList<int>;
        for (int i = 0; i < 32; i++) {
            positions[i]=i;
        }
        positions.shuffle();
        for (int i = 0; i < 32; i++) {
            deck[i].position = positions[i];
        }


    }


}

