import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Koliko pizza je naruceno?");
            int brojPizza = scanner.nextInt();
            System.out.println("Koliko je ljudi na zabavi?");
            int brojLjudi = scanner.nextInt();

            int brojSnitaPoOsobi = izracunajSnite(brojPizza, brojLjudi);
            System.out.println("Svaka osoba dobiva " + brojSnitaPoOsobi + " snita/e.");

        } catch (InputMismatchException e) {
            System.out.println("Greska: Molimo unesite samo cijele brojeve.");
        } catch (ArithmeticException e) {
            System.out.println("Greska: Ne mozemo podijeliti pizzu na 0 ljudi.");
        }
    }

    public static int izracunajSnite(int brojPizza, int brojLjudi) {
        return brojPizza * 8 / brojLjudi;
    }

}
