package HW6;
import java.util.*;

public class Player{
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;
    
    public Player(String name){
        this.name = name;
        this.score = 0;
    }
    
    public void draw(Deck cards){
        hand.add(cards.draw());
    }
    
    public Card flip(){
        return this.hand.remove(0);
    }
    
    public void incrementScore(){
        score++;
    }
    
    public void describe(){
        System.out.println("Player: "+ this.name);
        System.out.println("Number of cards on hand: " + hand.size());
        System.out.println("Current cards on hand: ");
        for(Card c : hand){
            c.describe();
        }
    }
    
    public int getScore(){
        return this.score;
    }
    
    public String getName(){
        return this.name;
    }
}