public class RewardValue{
    private final double cashValue;
    public static final double milesToCash = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }
    private static int convertToMiles(double cashValue){
        return (int) (cashValue / milesToCash);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * milesToCash;
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }

}