public class Socks extends Clothing {

    private int pairsInPack;

    public Socks() {
    }

    public Socks(String name, double price, int availableCopies,
                 String size, String color, int pairsInPack) {
        super(name, price, availableCopies, size, color);
        this.pairsInPack = pairsInPack;
    }

    public int getPairsInPack() {
        return pairsInPack;
    }

    public void setPairsInPack(int pairsInPack) {
        this.pairsInPack = pairsInPack;
    }

    @Override
    public String getCategory() {
        return "Clothing - Socks";
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nPrice: " + getPrice() +
                "\nAvailable Copies: " + getAvailableCopies() +
                "\nCategory: " + getCategory() +
                "\nSize: " + getSize() +
                "\nColor: " + getColor() +
                "\nPairs In Pack: " + pairsInPack;
    }
}