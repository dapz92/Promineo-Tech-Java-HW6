import java.util.*;

public class Deck{
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    
    public Deck(){
        String[] cardName = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        for(String name : cardName){
            for(int i = 2; i < 15; i++){
                this.cards.add(new Card(i, name));
            }
        }
    }
    
    public void shuffle(){
        Collections.shuffle(this.cards);
        System.out.println("Deck Shuffled!");
    }
    
    public Card draw(){
        return this.cards.remove(0);
    }
}