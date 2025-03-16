class Table implements FurnitureItem {
    @Override
    public void accept(ShippingCostCalculator visitor) {
        System.out.println("Shipping cost for Table: $" + visitor.visitTable(this));
    }
}