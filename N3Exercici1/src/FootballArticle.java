public class FootballArticle extends Article {
    final double BASE_PRICE = 300;

    private String tournament;
    private String club;
    private String player;

    public FootballArticle(String headline, int score, double price) {
        super(headline, score, price);
    }

    @Override
    double calculateArticlePrice() {
        double finalPrice = BASE_PRICE;

        if (tournament.equalsIgnoreCase("Lliga de Campions")) {finalPrice=+100;}
        if (text.contains("Barça") || text.contains("Madrid")) {finalPrice=+100;}
        if (text.contains("Ferran Torres") || text.contains("Benzema")) {finalPrice=+50;}

        return finalPrice;
    }
}
