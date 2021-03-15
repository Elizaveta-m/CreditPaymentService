public class CreditPaymentService {
    public int calculate(int amount, double percent, int time) {
      double i = percent / 12 / 100; //
      double coefficient = i * Math.pow(1 + i, time) / (Math.pow(1 + i, time) - 1);
      return ( int) (coefficient * amount);
   }
}
