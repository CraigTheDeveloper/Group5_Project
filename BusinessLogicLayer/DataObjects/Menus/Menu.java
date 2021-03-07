package BusinessLogicLayer.DataObjects.Menus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import BusinessLogicLayer.Abstractions.IDrinkItem;
import BusinessLogicLayer.Abstractions.IFoodItem;
import BusinessLogicLayer.Abstractions.IMenuItem;

public class Menu implements Serializable {
    // Our list of menu items that will be ordered for the day
    private List<IMenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    // Add any IMenuItem into current menu
    public boolean addItem(IMenuItem item) {
        // Returns whether the add operation was successful
        return menuItems.add(item);
    }

    // Remove any IMenuItem from current menu
    public boolean removeItem(IMenuItem item) {
        // Returns whether the remove operation was successful
        return menuItems.remove(item);
    }

    // get a list of all the food items in the menuItems list
    public List<IFoodItem> getAllFoodItems() {
        List<IFoodItem> foodItems = new ArrayList<>();
        for (IMenuItem menuItem : menuItems) {
            if (menuItem instanceof IFoodItem) {
                foodItems.add((IFoodItem)menuItem);
            }
        }
        return foodItems;
    }

    // get a list of all the drink items in the menuItems list
    public List<IDrinkItem> getAllDrinkItems() {
        List<IDrinkItem> drinkItems = new ArrayList<>();
        for (IMenuItem menuItem : menuItems) {
            if (menuItem instanceof IDrinkItem) {
                drinkItems.add((IDrinkItem)menuItem);
            }
        }
        return drinkItems;
    }

    // Get the total cost of all MenuItems that happen to be FoodItems
    public double getTotalFoodCost() {
        double total = 0.0;
        for (IFoodItem foodItem : getAllFoodItems()) {
            total += foodItem.getPrice();
        }
        return total;
    }

    // Get the total cost of all MenuItems that happen to be DrinkItems
    public double getTotalDrinksCost() {
        double total = 0.0;
        for (IDrinkItem drinkItem : getAllDrinkItems()) {
            total += drinkItem.getPrice();
        }
        return total;
    }
}
