
public class Main {
    public static void main(String[] args) {
        Card card= new Card();
        System.out.println(card);
        Suit suit= new Suit("трефы");
        System.out.println(suit);
        Rank value = new Rank("Буби", "король");
        System.out.println(value);
    }
}


