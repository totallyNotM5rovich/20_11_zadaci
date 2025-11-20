import java.util.Scanner;

public class IzbacivacIzKluba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Unesite svoje godine:");
            int dob = scanner.nextInt();
            provjeriDob(dob);
        } catch (IllegalArgumentException e) {
            System.out.println("Ulaz zabranjen: " + e.getMessage());
        }
    }

    public static void provjeriDob(int dob) {
        if (dob < 18) { throw new IllegalArgumentException("Premlad za ulazak.");}
        if (dob > 100) { throw new IllegalArgumentException("Osobna iskaznica izgleda lazno.");}
        System.out.println("Dobrodosli u klub!");
    }
}
