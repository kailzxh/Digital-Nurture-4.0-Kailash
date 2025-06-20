public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return calculateFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialAmount = 1000.0; // Initial investment
        double growthRate = 0.05;      // 5% annual growth
        int years = 10;

        double futureValue = calculateFutureValue(initialAmount, growthRate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }
}
