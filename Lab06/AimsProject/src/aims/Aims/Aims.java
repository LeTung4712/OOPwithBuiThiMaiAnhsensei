package aims.Aims;

import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.order.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int choice;
    ArrayList<Order> ordersList = new ArrayList<Order>();

    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87);
    dvd1.setCost(19.95f);
    dvd1.setId(1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124);
    dvd2.setCost(24.95f);
    dvd2.setId(2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90);
    dvd3.setCost(18.99f);
    dvd3.setId(3);

    do {
      showMenu();
      choice = keyboard.nextInt();
      switch (choice) {
        case 1:
          System.out.println("--------------------------------");
          System.out.println("1. Create new order");
          Order order = new Order();
          ordersList.add(order);
          System.out.println("New order has been created!");
          break;

        case 2:
          System.out.println("--------------------------------");
          System.out.println("2. Add item to the order");
          /*
          Media media = new Media();
          System.out.print("Enter title: ");
          media.setTitle(keyboard.nextLine());
          */
          ordersList.get(ordersList.size() - 1).addMedia(dvd1);
          ordersList.get(ordersList.size() - 1).addMedia(dvd2);
          ordersList.get(ordersList.size() - 1).addMedia(dvd3);
          break;

        case 3:
          System.out.println("--------------------------------");
          System.out.println("3. Delete item by id");
          System.out.print("Enter id: ");
          int deleteItem = keyboard.nextInt();
          ordersList.get(ordersList.size() - 1).removeMedia(deleteItem);
          break;

        case 4:
          System.out.println("--------------------------------");
          System.out.println("4. Display the items list of order");
          ordersList.get(ordersList.size() - 1).printOrder();
          break;

        case 0:
          System.out.println("Exit!");
          break;

        default:
          System.out.println("Invalid!");
          break;
      }
      System.out.println("--------------------------------");
    } while (choice != 0);
  }

  public static void showMenu() {
    System.out.println("Order Management Application: ");
    System.out.println("--------------------------------");
    System.out.println("1. Create new order");
    System.out.println("2. Add item to the order");
    System.out.println("3. Delete item by id");
    System.out.println("4. Display the items list of order");
    System.out.println("0. Exit");
    System.out.println("--------------------------------");
    System.out.print("Please choose a number: ");
  }
}