/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Random;
import java.util.Scanner;

//Modifier: Darshit SOneji
//Student ID: 991707975
public  class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // call to random number generator here
            c.setSuit(Card.SUITS[random.nextInt(4)]); // call to random number between 0-3 for suits
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(3); //Setting the lucky cqrd number for the magic hand
        luckyCard.setSuit("Diamonds"); //Setting the lucky card suit
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card from 1-13: ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter the suit of your card( Hearts, Diamonds, Spades , Clubs):");
        String userSuit = scanner.nextLine();
        
        Card userCard= new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        boolean found = false;
        for (Card card : magicHand){
            if(card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit()));
            {
                found = true;
                break;
            }
        }
        if(found){
    System.out.println("Congratulations, your card is in the Magic Hand");
    }
    else{
    System.out.println("Sorry, your card is not in the magic Hand");
        }
    }
    
}
    
