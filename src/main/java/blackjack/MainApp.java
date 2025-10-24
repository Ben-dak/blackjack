package blackjack;

public class MainApp {
    // Separate the data and logic into 3 separate classes
    // MainApp only needs to know where it can find the information and which objects can do the work
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        // deal 5 cards
        for(int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);

        // WHAT TO DO NEXT

        //Use the class definitions that we have discussed in this module to create classes
        //for a card game. You will need a deck of cards, and you will need to be able to
        //deal cards to each players hand.
        //The examples we have covered do not track the player names. Add any variables
        //and/or classes that you think are necessary to meet these requirements.
        //Start the game by prompting the user for the name of each player.
        //Create a deck and shuffle the cards, then deal 2 cards to each hand. Display each
        //player's hand and determine which player is closest to 21 without going over.
        //Declare that player as the winner.
        //Scoring:
        //All number cards are worth their numeric value
        //Face cards are worth 10 points
        //Ace is worth 11 points
        //Optional Bonus
        //Prompt the user for the number of players that will be playing the game. Then
        //create that many Hands.
        //If you have time. Take turns and allow each player to choose if they want to Hit
        //to take another card, or to Stay.
        //Ace is worth 11 points by default. Add logic to count Ace as 1 point if 11 would
        //cause the hand to bust.
    }
}
