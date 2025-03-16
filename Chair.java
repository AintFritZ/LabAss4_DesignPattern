class Chair implements FurnitureItem {
    @Override
    public void accept(ShippingCostCalculator visitor) {
        System.out.println("Shipping cost for Chair: $" + visitor.visitChair(this));
    }
}