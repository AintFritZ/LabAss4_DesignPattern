public class Main {
    public static void main(String[] args) {
        FurnitureItem[] furnitureItems = {new Chair(), new Table(), new Sofa()};
        ShippingCostCalculator shippingCalculator = new StandardShippingCalculator();
        
        for (FurnitureItem item : furnitureItems) {
            item.accept(shippingCalculator);
        }
    }
}
