package bill;

public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        final int taxVA = 18;
        return amount / 100 * taxVA;
    }
}
