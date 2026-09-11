public class Shirt extends Clothing {

    private String material;

    public Shirt() {
    }

    public Shirt(String name, double price, int availableCopies,
                 String size, String color, String material) {
        super(name, price, availableCopies, size, color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getCategory() {
        return "Clothing - Shirt";
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nPrice: " + getPrice() +
                "\nAvailable Copies: " + getAvailableCopies() +
                "\nCategory: " + getCategory() +
                "\nSize: " + getSize() +
                "\nColor: " + getColor() +
                "\nMaterial: " + material;
    }
}