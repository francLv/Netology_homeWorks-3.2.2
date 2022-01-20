package bill;

public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        final int taxIncome = 13;
        return amount / 100 * taxIncome;
    }
}
