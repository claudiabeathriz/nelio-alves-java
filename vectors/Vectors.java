import java.util.Locale;
import java.util.Scanner;

public class Vectors {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Product[] vect = new Product[n];

        for(int i = 0; i < n; i++){
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            scanner.nextLine();

            vect[i] = new Product(name, price);

            System.out.println("DEBUG -> name: [" + name + "]");
            System.out.println("DEBUG -> price: " + price);
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / n;
        System.out.println("Average price: $ " + avg);

        scanner.close();
    }
}
