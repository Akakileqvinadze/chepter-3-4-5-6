
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Ace_Clubs","2_Clubs","3_Clubs","4_Clubs","5_Clubs","6_Clubs","7_Clubs","8_Clubs","9_Clubs","10_Clubs","Jack_Clubs","Queen_Clubs","King_Clubs",
                          "Ace_Diamonds,","2_Diamonds,","3_Diamonds,","4_Diamonds,","5_Diamonds,","6_Diamonds,","7_Diamonds,","8_Diamonds,","9_Diamonds,","10_Diamonds,","Jack_Diamonds,","Queen_Diamonds,","King_Diamonds,",
                          "Ace_Hearts,","2_Hearts,","3_Hearts,","4_Hearts,","5_Hearts,","6_Hearts,","7_Hearts,","8_Hearts,","9_Hearts,","10_Hearts,","Jack_Hearts,","Queen_Hearts,","King_Hearts,",
                          "Ace_Spades,","2_Spades,","3_Spades,","4_Spades,","5_Spades,","6_Spades,","7_Spades,","8_Spades,","9_Spades,","10_Spades,","Jack_Spades,","Queen_Spades,","King_Spades" };
        Random rann = new Random();
        int karti= rann.nextInt(0,52);
        System.out.println("The card you picked is "+array[karti]);
    }
}




