//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner scanner = new Scanner(System.in);

    List<Item> inventory = new ArrayList<>();

    Shirt shirt = new Shirt("T-Shirt", 500, 5, "M", "Black", "Cotton"
    );

    Socks socks = new Socks("Sport Socks", 150, 10, "Free Size", "White", 3
    );

    Hat hat = new Hat("Baseball Cap", 250, 4, "Free Size", "Blue", "Sport"
    );

    Printer printer = new Printer("HP Printer", 3500, 3, "HP", 12, true
    );

    Laptop laptop = new Laptop(
            "Dell Laptop", 25000, 2, "Dell", 24, 16
    );

    Projector projector = new Projector(
            "Epson Projector", 12000, 2, "Epson", 24, 4000
    );

    inventory.add(shirt);
    inventory.add(socks);
    inventory.add(hat);
    inventory.add(printer);
    inventory.add(laptop);
    inventory.add(projector);

    Cart cart = new Cart();

    int choice = 0;

    while (choice != 6) {

        System.out.println("\n1. View Store Inventory");
        System.out.println("2. Add Item to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Checkout");
        System.out.println("5. Return Item");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {

            case 1:

                System.out.println("\nStore Inventory:");

                for (int i = 0; i < inventory.size(); i++) {

                    System.out.println("\nItem " + i);
                    System.out.println(inventory.get(i));

                }

                break;


            case 2:

                System.out.println("\nChoose an item:");

                for (int i = 0; i < inventory.size(); i++) {

                    System.out.println(
                            i + " - " +
                                    inventory.get(i).getName() +
                                    " - " +
                                    inventory.get(i).getCategory() +
                                    " - Stock: " +
                                    inventory.get(i).getAvailableCopies()
                    );

                }

                System.out.print("Enter item index: ");
                int index = scanner.nextInt();

                if (index >= 0 && index < inventory.size()) {

                    Item item = inventory.get(index);

                    if (item.getAvailableCopies() > 0) {

                        cart.addItem(item);

                    } else {

                        System.out.println("Item is out of stock.");

                    }

                } else {

                    System.out.println("Invalid item index.");

                }

                break;


            case 3:

                System.out.println("\nShopping Cart:");

                if (cart.getItems().size() == 0) {

                    System.out.println("Cart is empty.");

                } else {

                    for (int i = 0; i < cart.getItems().size(); i++) {

                        System.out.println(cart.getItems().get(i));
                        System.out.println("----------------");

                    }

                    System.out.println("Total Price: " + cart.calculateTotal());

                }

                break;


            case 4:

                System.out.println("\nCheckout:");

                if (cart.getItems().size() == 0) {

                    System.out.println("Cart is empty.");

                } else {

                    System.out.println("Receipt:");

                    for (int i = 0; i < cart.getItems().size(); i++) {

                        Item item = cart.getItems().get(i);

                        System.out.println(
                                item.getName() + " - " +
                                        item.getCategory() + " - " +
                                        item.getPrice()
                        );

                    }

                    System.out.println("Total: " + cart.calculateTotal());

                    if (cart.checkout()) {

                        System.out.println("Checkout completed.");

                    }

                }

                break;


            case 5:

                System.out.println("\nReturn Item:");

                for (int i = 0; i < inventory.size(); i++) {

                    System.out.println(
                            i + " - " +
                                    inventory.get(i).getName() +
                                    " - Stock: " +
                                    inventory.get(i).getAvailableCopies()
                    );

                }

                System.out.print("Enter item index: ");
                int returnIndex = scanner.nextInt();

                if (returnIndex >= 0 && returnIndex < inventory.size()) {

                    inventory.get(returnIndex).returnItem();

                    System.out.println("Item returned successfully.");

                } else {

                    System.out.println("Invalid item index.");

                }

                break;


            case 6:

                System.out.println("Goodbye.");
                break;


            default:

                System.out.println("Invalid choice.");
        }
    }

    scanner.close();
}

