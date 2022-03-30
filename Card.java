public class Card {
    private int value;
    private String name;
    
    public Card(int value, String name){
        if(value > 1 && value < 15){
            this.value = value;
        } else {
            throw new IllegalArgumentException("Invalid card value");
        }
        
        switch(name.toUpperCase()){
            case "DIAMONDS":
                this.name = name;
                break;
            case "HEARTS":
                this.name = name;
                break;
            case "CLUBS":
                this.name = name;
                break;
            case "SPADES":
                this.name = name;
                break;
            default:
                throw new IllegalArgumentException("Invalid card name");
        }
    }
    
    public String getCardName(){
        String value;
        
        switch(this.value){
            case 11:
                value = "Jack";
                break;
            case 12:
                value = "Queen";
                break;
            case 13:
                value = "King";
                break;
            case 14:
                value = "Ace";
                break;
            default:
                value = String.valueOf(this.value);
        }
        
        return value + " of " + this.name;
    }
    
    public int getCardValue(){
        return this.value;
    }
    
    public void setCardChange(String name, int value){
        if(value > 1 && value < 15){
            this.value = value;
        } else {
            throw new IllegalArgumentException("Invalid card value");
        }
        
        switch(name.toUpperCase()){
            case "DIAMONDS":
                this.name = name;
                break;
            case "HEARTS":
                this.name = name;
                break;
            case "CLUBS":
                this.name = name;
                break;
            case "SPADES":
                this.name = name;
                break;
            default:
                throw new IllegalArgumentException("Invalid card name");
        }
    }
    
    public void describe(){
        System.out.println("This card is the " + this.getCardName() + " and the value is " + this.getCardValue());
    }
}