class Sofa implements FurnitureItem {
    @Override
    public void accept(ShippingCostCalculator visitor) {
        System.out.println("Shipping cost for Sofa: $" + visitor.visitSofa(this));
    }
}