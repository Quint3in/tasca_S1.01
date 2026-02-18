public class F1Article extends Article {
    final double BASE_PRICE = 100;

    private String constructorTeam;


    public F1Article(String headline, int score, double price) {
        super(headline, score, price);
    }

    @Override
    double calculateArticlePrice() {
        double finalPrice = BASE_PRICE;

        if(constructorTeam.equalsIgnoreCase("Ferrari") ||
           constructorTeam.equalsIgnoreCase("Mercedes") ){
            finalPrice=+50;
        }
        return finalPrice;
    }
}
