package exercises.RestaurantMenu;

import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        ArrayList<MenuItem> menuItems = new ArrayList<>(Arrays.asList(
                new MenuItem("Burger", 4.99, "Chicken, Tomato, Onion on burger bun.", "main course"),
                new MenuItem("Chicken Fries", 3.99, " Spicy and Regular fries", "main course"),
                new MenuItem("Smoothie", 2.50, "Chocolate, Vanilla or Strawberry", "dessert"),
                new MenuItem("Soda", 1.50, "Choice of soda between Coke & Pepsi", "Drinks")));

        //Add new items to the menu.
        Menu menu = new Menu(menuItems);
        menu.addMenuItem(new MenuItem("Pasta", 9.99, "Choice of meat and veg mixed with italian pasta", "main course"));

        //Print the entire, updated menu to the screen.

        menu.printMenu();

        //Print an individual menu item to the screen.

        System.out.println(menuItems.get(1));

        //Delete an item from a menu, then reprint the menu

        menuItems.remove(3);
        menu.printMenu();
    }
}

