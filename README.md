# E-Commerce Inventory and Shopping Cart

This is a Java Maven console application for a simple e-commerce store.

## Project Idea

The program manages store items and a shopping cart.
The store has different types of clothing and devices.

The user can:

1. View store inventory
2. Add an item to the cart
3. View the cart and total price
4. Checkout and reduce the available stock
5. Return an item and increase the stock
6. Exit the program

## OOP Concepts Used

* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Abstract classes
* ArrayList / List

## Main Classes

* `Item` - Abstract base class for all items
* `Clothing` - Abstract class for clothing items
* `Device` - Abstract class for devices
* `Shirt`, `Socks`, `Hat` - Clothing types
* `Printer`, `Laptop`, `Projector` - Device types
* `Cart` - Manages items added to the shopping cart
* `Main` - Creates the items and runs the menu using `Scanner`

## Main Program

In `Main`, the program creates different items, adds them to the inventory, and allows the user to interact with the store through a simple menu.

The program uses `getCategory()` polymorphically to display the category of each item. During checkout, `sell()` is called to decrease the available stock, and the cart is cleared after a successful checkout.
