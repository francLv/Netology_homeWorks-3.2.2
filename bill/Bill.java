package bill;

public class Bill {
    private final double amount;
    private final TaxType taxType;
    private final TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        double taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}
