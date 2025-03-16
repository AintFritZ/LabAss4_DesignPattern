class StandardShippingCalculator implements ShippingCostCalculator {
    @Override
    public int visitChair(Chair chair) {
        return 10; 
    }
    
    @Override
    public int visitTable(Table table) {
        return 25; 
    }
    
    @Override
    public int visitSofa(Sofa sofa) {
        return 50; 
    }
}