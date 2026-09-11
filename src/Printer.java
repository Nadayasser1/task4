public class Printer extends Device {

    private boolean isColor;

    public Printer() {
    }

    public Printer(String name, double price, int availableCopies,
                   String brand, int warrantyMonths, boolean isColor) {
        super(name, price, availableCopies, brand, warrantyMonths);
        this.isColor = isColor;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    @Override
    public String getCategory() {
        return "Device - Printer";
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nPrice: " + getPrice() +
                "\nAvailable Copies: " + getAvailableCopies() +
                "\nCategory: " + getCategory() +
                "\nBrand: " + getBrand() +
                "\nWarranty Months: " + getWarrantyMonths() +
                "\nColor Printer: " + isColor;
    }
}