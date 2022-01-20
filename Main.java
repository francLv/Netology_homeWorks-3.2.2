import bill.*;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(200_000, new TaxType(), taxService),
                new Bill(150_000, new IncomeTaxType(), taxService),
                new Bill(300_000, new VATaxType(), taxService),
                new Bill(90_000, new ProgressiveTaxType(), taxService),
                new Bill(150_000, new ProgressiveTaxType(), taxService)
        };
        for (Bill bill : payments) bill.payTaxes();
    }
}
