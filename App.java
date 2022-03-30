package HW6;
import java.util.Scanner;
public class App {
    public static void main(String args[]) {
        Deck cards = new Deck();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter player 1 name: ");
        
        String name1 = input.nextLine();
        
        System.out.print("Please enter player 2 name: ");
        
        String name2 = input.nextLine();
        
        input.close();
        
        Player p1 = new Player(name1);
        Player p2 = new Player(name2);
        cards.shuffle();
        
        for(int i = 0; i < 52; i++){
            if(i % 2 == 0){
                p1.draw(cards);
            } else {
                p2.draw(cards);
            }
        }
        
        //p1.describe();
        //System.out.println("---------------------------------------------------");)
        //p2.describe();
        
        for(int i = 1; i < 27; i++){
        	Card c1 = p1.flip();
        	Card c2 = p2.flip();
            
            System.out.println(p1.getName() +" "+ c1.describe());
            System.out.println(p2.getName() +" "+ c2.describe());
            
            if(c1.getCardValue() > c2.getCardValue()) {
            	System.out.println(p1.getName() + " wins round "+ i);
            	p1.incrementScore();
            }
            
            if(c2.getCardValue() > c1.getCardValue()) {
            	System.out.println(p2.getName() + " wins round " + i);
            	p2.incrementScore();
            }
            
            if(c1.getCardValue() == c2.getCardValue()) {
            	System.out.println("DRAW! on round "+ i );
            }
        }
        
       System.out.println("---------------------------------------------------");
        
        if(p1.getScore() > p2.getScore()){
            System.out.println(p1.getName() + " is the winner!");
            System.out.println(p1.getName() + " Score: " + p1.getScore());
            
        }
        
        if(p2.getScore() > p1.getScore()){
            System.out.println(p2.getName() + " is the winner!");
            System.out.println(p2.getName() + " Score: " + p2.getScore());
        }
        
        if(p1.getScore() == p2.getScore()){
            System.out.println("DRAW!!!");
        }
    }
}