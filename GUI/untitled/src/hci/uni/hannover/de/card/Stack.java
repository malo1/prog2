package hci.uni.hannover.de.card;

import java.util.ArrayList;

public class Stack {

    private ArrayList<Cards> stack;

    public Stack(Cards card){
        this.stack.add(card);
    }

    public Cards getCard(int index){
        return this.stack.get(index);
    }

    void changeCardofStack(Cards card,int index){
        stack.remove(index);
        stack.add(index,card);
    }



}
