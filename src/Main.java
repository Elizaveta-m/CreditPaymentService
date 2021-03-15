public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int paymentForOneYear = service.calculate(1_000_000, 9.99, 12);
        System.out.println(paymentForOneYear);

        int paymentForTwoYears = service.calculate(1_000_000, 9.99, 24);
        System.out.println(paymentForTwoYears);

        int paymentForThreeYears = service.calculate(1_000_000, 9.99, 36);
        System.out.println(paymentForThreeYears);
    }
}