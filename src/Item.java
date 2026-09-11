public abstract class Item {

    private String name;
    private double price;
    private int availableCopies;

    public Item() {
    }

    public Item(String name, double price, int availableCopies) {
        this.name = name;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public void sell() {
        if (availableCopies > 0) {
            availableCopies--;
        } else {
            System.out.println("Out of stock: " + name);
        }
    }

    public void returnItem() {
        availableCopies++;
    }

    public abstract String getCategory();
}