public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;
    // declaring the BrasilTaxService class directly is not a good practice
    // because RentalService becomes exclusively dependent on it.

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        super();
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        carRental.setInvoice(new Invoice(50.0, 10.0));
    }
}
