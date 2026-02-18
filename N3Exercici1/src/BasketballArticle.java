public class BasketballArticle extends Article{
    final double BASE_PRICE = 250;

    private String tournament;
    private String club;

    public BasketballArticle(String headline, int score, double price) {
        super(headline, score, price);
    }

    @Override
    double calculateArticlePrice() {
        double finalPrice = BASE_PRICE;

        if (tournament.equalsIgnoreCase("EuroLliga")) {finalPrice=+75;}
        if (text.contains("Barça") || text.contains("Madrid")) {finalPrice=+75;}

        return finalPrice;
    }
}
