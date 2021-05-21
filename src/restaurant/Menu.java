package restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> Item= new ArrayList<MenuItem>();

    void addMenuItem(String dishName,double price, String category,String description)
    {
        for(MenuItem check:this.Item)
        {
            if(check.dishName.equals(dishName) && check.category.equals(category))
            {
                System.out.println("Dish is already exist");
                break;
            }
        }
        MenuItem menu=new MenuItem(dishName,price,description,category);
        this.Item.add(menu);
    }
    void removeMenu(String dishName, String Category)
    {
        this.Item.removeIf(rem_menu->rem_menu.dishName.equals(dishName) && rem_menu.category.equals(Category));

    }
    void printFullMenu()
    {
        for( MenuItem full_menu:this.Item)
        {
            System.out.println(full_menu.dishName + ", "+full_menu.price+ " , "+full_menu.category+" , "+full_menu.description);
        }
    }
    void printMenuItemOnly(String dish_name,String category)
    {
        for(MenuItem print_menu:this.Item)
        {
            if(print_menu.dishName.equals(dish_name) && print_menu.category.equals(category))
            {
                System.out.println("Dish Name ="+print_menu.dishName);
                System.out.println("Price ="+print_menu.price);
                System.out.println("Category ="+print_menu.category);
                System.out.println("Description ="+print_menu.description);


            }
        }

    }
}
