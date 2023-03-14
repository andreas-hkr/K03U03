import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in bränsleförbrukningen i miles/gallon
        // Översätt till liter/mil och skriv ut
        // 1 mile = 1,609 km
        // 1 gallon = 3,785 liter

        Scanner input = new Scanner(System.in);
        System.out.print("Ange miles/gallon: ");
        double milesPerGallon = input.nextDouble();

        double kmPerGallon = milesPerGallon * 1.609;
        double kmPerLiter = kmPerGallon / 3.785;
        double literPerMil = 10 / kmPerLiter;

        System.out.println("Det skulle motsvara " + literPerMil + " liter/mil");
    }
}