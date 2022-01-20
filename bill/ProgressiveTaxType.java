package bill;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        final int progressPoint = 100_000;
        final int taxBefore_100 = 10;
        final int taxAfter_100 = 15;
        return (amount <= progressPoint ? amount / 100 * taxBefore_100 : amount / 100 * taxAfter_100);
    }
}
