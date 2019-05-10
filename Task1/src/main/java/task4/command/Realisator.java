package task4.command;

public class Realisator {
    private Command addProductIntoCard;
    private Command showAllProducts;
    private Command showProductsInCard;

    private Realisator(RealisatorBuilder realisatorBuilder) {
        this.addProductIntoCard = realisatorBuilder.addProductIntoCard;
        this.showAllProducts = realisatorBuilder.showAllProducts;
        this.showProductsInCard = realisatorBuilder.showProductsInCard;
    }

    public void addProduct(){
        addProductIntoCard.execute();
    }

    public void showAllProducts(){
        showAllProducts.execute();
    }

    public void showProductsInCard(){
        showProductsInCard.execute();
    }

    public static class RealisatorBuilder{
        private Command addProductIntoCard;
        private Command showAllProducts;
        private Command showProductsInCard;

        public RealisatorBuilder setAddProductIntoCard(Command addProductIntoCard) {
            this.addProductIntoCard = addProductIntoCard;
            return this;
        }

        public RealisatorBuilder setShowAllProducts(Command showAllProducts) {
            this.showAllProducts = showAllProducts;
            return this;
        }

        public RealisatorBuilder setShowProductsInCard(Command showProductsInCard) {
            this.showProductsInCard = showProductsInCard;
            return this;
        }

        public Realisator build(){
            return new Realisator(this);
        }
    }


}
