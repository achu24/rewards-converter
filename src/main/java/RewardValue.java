public class RewardValue{
    private final double cashValue;
    private static final double milesToCash = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convetToCash(milesValue);
    }
    private static int convertToMiles(double cashValue){
        return (int) (cashValue / milesToCash);
    }
    
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }

}
