import java.util.ArrayList;
import java.util.List;

public class TennisArticle extends Article{
    final double BASE_PRICE = 150;

    private String tournament;
    private List<String> players = new ArrayList<String>();


    public TennisArticle(String headline, int score, double price) {
        super(headline, score, price);
    }

    @Override
    double calculateArticlePrice() {
        double finalPrice = BASE_PRICE;

        for (String player : players) {
            if (player.equalsIgnoreCase("Federer") ||
                    player.equalsIgnoreCase("Nadal") ||
                    player.equalsIgnoreCase("Djokovic")) {

                finalPrice=+100;
                break;
            }
        }

        return finalPrice;
    }
}
