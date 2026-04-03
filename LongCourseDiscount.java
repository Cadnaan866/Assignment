class LongCourseDiscount implements DiscountStrategy {
    public double applyDiscount(double fee) {
        return fee * 0.9;
    }
}
