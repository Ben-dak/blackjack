package blackjack;

public class Card {
//    The other classes depend on the cards so start here (main object)
//        A - indicates that the field or method is private
//        A + indicates that the field or method is public

private String suit;
private String rank;
private boolean isFaceUp;

// Card constructor can be turned into an object with these instances
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.isFaceUp = false;
    }

    public String getSuit(){
        // only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }

    public String getRank(){
        // only return the value if the card is face up
        if(isFaceUp){
            // this is the string value of the card
            // i.e. A, K, Q, J, 10, 9 ...
            return rank;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        // only return the value if the card is face up
        if (this.isFaceUp) {
            int pointValue;

            switch (this.rank) {
                case "2":
                    pointValue = 2;
                    break;
                case "3":
                    pointValue = 3;
                    break;
                case "J", "Q", "K":
                    pointValue = 10;
                    break;
                case "A":
                    pointValue = 11;
                    break;
                default:
                    pointValue = 0;
                    break;
            }
            return pointValue;
            // determine point value and return it
            // all numeric cards are equal to their face value
        } else {
            return 0;
        }
    }

    public boolean isFaceUp(){
        return isFaceUp;
    }

    public void flip(){
        isFaceUp = !isFaceUp;
    }

}
