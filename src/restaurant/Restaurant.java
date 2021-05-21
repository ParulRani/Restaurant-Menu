package restaurant;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Menu new_menu=new Menu();
        System.out.println("Please Enter the choice from the option");
        System.out.println("1.Add the MenuItem");
        System.out.println("2.Remove the MenuItem");
        System.out.println("3.Print Full Menu");
        System.out.println("4.Print the Selected MenuItem");
        System.out.println("5.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Scanner ch=new Scanner(System.in);
        while(choice!=5) {
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the Dish Name : ");
                    String dish_name = sc.next();
                    System.out.println("Please Enter the price of " + dish_name);
                    Double price = sc.nextDouble();
                    System.out.println("Please Enter the Category of " + dish_name);
                    String category = sc.next();
                    System.out.println("Please Enter the Description of " + dish_name);
                    String description = sc.next();
                    new_menu.addMenuItem(dish_name, price, category, description);
                    break;
                case 2:
                    System.out.println("Please Enter the Dish Name to remove the Dish");
                    String remove_dish_name = sc.next();
                    System.out.println("Please Enter the Category of the " + remove_dish_name);
                    String rem_category = sc.next();
                    new_menu.removeMenu(remove_dish_name, rem_category);
                    break;
                case 3:
                    new_menu.printFullMenu();
                    break;
                case 4:
                    System.out.println("Please Enter the Dish Name to print");
                    String print_dish_name = sc.next();
                    System.out.println("Please Enter the Category of the " + print_dish_name);
                    String print_category = sc.next();
                    new_menu.printMenuItemOnly(print_dish_name, print_category);
                    break;
                default:
                    System.out.println("Please select the choice from the list");
            }
            System.out.println("Enter new choice");
            choice = sc.nextInt();
        }
    }
}