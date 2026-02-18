public class MotorcylingArticle extends Article{
    final double BASE_PRICE = 100;

    private String team;

    public MotorcylingArticle(String headline, int score, double price) {
        super(headline, score, price);
    }

    @Override
    double calculateArticlePrice() {
        double finalPrice = BASE_PRICE;

        if (team.equalsIgnoreCase("Honda") ||
            team.equalsIgnoreCase("Yamaha")) {
            finalPrice=+50;
        }
        return finalPrice;
    }
}
