public class App {
    public static void main(String args[]) {
        Deck cards = new Deck();
        Player p1 = new Player("Donel");
        Player p2 = new Player("Mirna");
        cards.shuffle();
        
        for(int i = 0; i < 52; i++){
            if(i % 2 == 0){
                p1.draw(cards);
            } else {
                p2.draw(cards);
            }
        }
        
        p1.describe();
        System.out.println("---------------------------------------------------");
        p2.describe();
        
        for(int i = 0; i < 26; i++){
            int p1Value = p1.flip().getCardValue();
            int p2Value = p2.flip().getCardValue();
            
            if(p1Value > p2Value){
                p1.incrementScore();
            } 
            
            if(p2Value > p1Value){
                p2.incrementScore();
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