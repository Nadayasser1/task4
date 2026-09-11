public class Hat extends Clothing {

    private String style;

    public Hat() {
    }

    public Hat(String name, double price, int availableCopies,
               String size, String color, String style) {
        super(name, price, availableCopies, size, color);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String getCategory() {
        return "Clothing - Hat";
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nPrice: " + getPrice() +
                "\nAvailable Copies: " + getAvailableCopies() +
                "\nCategory: " + getCategory() +
                "\nSize: " + getSize() +
                "\nColor: " + getColor() +
                "\nStyle: " + style;
    }
}