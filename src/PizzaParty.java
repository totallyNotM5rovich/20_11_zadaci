import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Koliko pizza je naruceno?");
            int brojPizza = scanner.nextInt();
            if(brojPizza < 0) {
                throw new NegativanBrojException("Broj narucenih pizza");
            }
            System.out.println("Koliko je ljudi na zabavi?");
            int brojLjudi = scanner.nextInt();
            if(brojLjudi < 0) {
                throw new NegativanBrojException("Broj ljudi");
            }

            int brojSnitaPoOsobi = izracunajSnite(brojPizza, brojLjudi);
            System.out.println("Svaka osoba dobiva " + brojSnitaPoOsobi + " snita/e.");

        } catch (InputMismatchException e) {
            System.out.println("Greska: Molimo unesite samo cijele brojeve.");
        } catch (ArithmeticException e) {
            System.out.println("Greska: Ne mozemo podijeliti pizzu na 0 ljudi.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int izracunajSnite(int brojPizza, int brojLjudi) {
        return brojPizza * 8 / brojLjudi;
    }

}
