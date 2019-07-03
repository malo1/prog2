package hci.uni.hannover.de.card;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author Daniel Hennies
 */
public class Hand {


    private ArrayList<Cards> hand;
    public Hand(ArrayList<Cards> card){
        this.hand = card;
    }

    public Cards getCard(int index){
        return this.hand.get(index);
    }

    public void changeCards(Cards cardHand, Cards cardStack, int indexHand,int indexStack,Stack s){
        hand.remove(indexHand);
        s.changeCardofStack(cardHand,indexStack);
        this.hand.add(indexHand,cardStack);

    }

}
