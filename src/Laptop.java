public class Laptop extends Device {

    private int ramGB;

    public Laptop() {
    }

    public Laptop(String name, double price, int availableCopies,
                  String brand, int warrantyMonths, int ramGB) {
        super(name, price, availableCopies, brand, warrantyMonths);
        this.ramGB = ramGB;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    @Override
    public String getCategory() {
        return "Device - Laptop";
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nPrice: " + getPrice() +
                "\nAvailable Copies: " + getAvailableCopies() +
                "\nCategory: " + getCategory() +
                "\nBrand: " + getBrand() +
                "\nWarranty Months: " + getWarrantyMonths() +
                "\nRAM: " + ramGB + " GB";
    }
}