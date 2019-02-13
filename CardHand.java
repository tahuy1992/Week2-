package cardgameweek4;
/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 */

public class CardHand {

        private int handSize = 52;
	public Card[] cards = new Card[handSize];
           //Array of Card objects
	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
                /*
                The java compiler internally adds the
                values() method when it creates an enum. 
                
                The values() method returns an array 
                containing all the values of the enum.
                */
                
                
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        //Creating objects using constructor and 
                        //assigning values of emun fields 
                        //from list of possible discrete values
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method
