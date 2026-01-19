import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainCarRental {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        // DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("RENTAL DATA");
        System.out.println("*******************");
        System.out.print("Car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Pickup at (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(scanner.nextLine());
        //LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);

        System.out.print("Drop-off at (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(scanner.nextLine());
        //LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        //BrasilTaxService taxService = new BrasilTaxService();
        //System.out.println(taxService.tax(390.0));

        scanner.close();
    }
}
