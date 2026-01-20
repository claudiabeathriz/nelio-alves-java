package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainPaypal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("CONTRACT DATA");
        System.out.println("*****************");

        System.out.print("Number: ");
        int number = scanner.nextInt();

        System.out.print("Date: ");
        LocalDate date = LocalDate.parse(scanner.next(), fmt);

        System.out.print("Total value: ");
        double totalValue = scanner.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Enter installments number: ");
        int installmentsNumber = scanner.nextInt();

        ContractService contractService = new ContractService(null);

        contractService.processContract(obj, installmentsNumber);

        System.out.println("Installments:");
        for(Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }

        scanner.close();

    }
}
