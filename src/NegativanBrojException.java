public class NegativanBrojException extends Exception {
    private String podatak;
    public NegativanBrojException(String podatak) {
        super(" ne moze biti negativan broj.");
        this.podatak = podatak;
    }

    @Override
    public String getMessage() {
        return podatak + super.getMessage();
    }
}
