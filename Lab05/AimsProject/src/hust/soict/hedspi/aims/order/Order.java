package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

/**
 * Order
 */
public class Order {

    public static final int MAX_NUMBER_ORDERED = 10;// order tối đa 10 dvd
    public static final int MAX_LIMITTED_ORDERS = 5;// khởi tạo tối đa 5 class Order
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered;
    
    private static int nbOrders = 0;

    private Order() {
        this.qtyOrdered = 0;
        // this.dateOrdered.setDate(LocalDate.now().toString());
        for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
            itemsOrdered[i] = null;
        }
    }

    public static Order CreateOrder() {
        if (nbOrders < MAX_LIMITTED_ORDERS) {
            nbOrders++;
            // System.out.println(nbOrders);
            Order newOrder = new Order();
            System.out.println("Created Order successfully!");
            return newOrder;
        } else {
            System.out.println("Reached MAX_LIMITTED_ORDER!");
            return null;
        }
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }


    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (qtyOrdered == 10)
            System.out.println("Max order is 10");
        else {
            itemsOrdered[qtyOrdered] = dvd;
            System.out.println(dvd.getTitle() + " has been added!");
            qtyOrdered++;
        }

    }

    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {

        if (qtyOrdered == 0)
            System.out.println("The order is empty!!");
        else {
            for (int j = 0; j < qtyOrdered; j++) {
                if (itemsOrdered[j] == dvd) {
                    System.out.println("\nRemove the movie have title: " + itemsOrdered[j].getTitle());
                    for (int k = j; k < qtyOrdered - 1; k++) {
                        itemsOrdered[k] = itemsOrdered[k + 1];
                    }
                }
            }
            qtyOrdered--;
        }

    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void printAllTitle() {

        System.out.println("\n--------Pre-ordered movies---------");
        System.out.println("| qtyOrdered is: " + qtyOrdered);
        for (int j = 0; j < qtyOrdered; j++) {

            System.out.println("----------movie: " + (j + 1) + " ---------");

            System.out.println("| Title: " + itemsOrdered[j].getTitle());
            System.out.println("| Category: " + itemsOrdered[j].getCategory());
            System.out.println("| Director: " + itemsOrdered[j].getDirector());
            System.out.println("| Length: " + itemsOrdered[j].getLength() + " (min)");
            System.out.println("| Cost: " + itemsOrdered[j].getCost() + " ($)");

        }
        System.out.println("--------Thank you very much--------");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered < MAX_NUMBER_ORDERED - 1) {
                itemsOrdered[qtyOrdered] = dvd;
                System.out.println(dvd.getTitle() + " has been added!");
                qtyOrdered++;
            } else {
                System.out.println("The order is almost full! Cannot add '" + dvd.getTitle() + "' !");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("The item quantity has reached its limit. Cannot add anymore!");
        } else if (qtyOrdered == MAX_NUMBER_ORDERED - 1) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The dvd '" + dvd1.getTitle() + "' has been added. The dvd '"
                    + dvd2.getTitle() + "' could not be added!");
        } else {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("All 2 dvds has been added!");
        }
    }

    public void printOrder() {

        System.out.println("\n*************************************** Order ****************************************");
        MyDate dateOrdered = new MyDate();
        System.out.print("Date: " );dateOrdered.print();
        System.out.println("\nOrdered Items:");
        for (int j = 0; j < qtyOrdered; j++) {

            System.out.println(String.format("%-2d. DVD - %-20s - %-15s - %-15s - %-5d(min) : %-3.2f($)",
                    j + 1,
                    itemsOrdered[j].getTitle(),
                    itemsOrdered[j].getCategory(),
                    itemsOrdered[j].getDirector(),
                    itemsOrdered[j].getLength(),
                    itemsOrdered[j].getCost()));

        }
        System.out.println("Total Cost: " + totalCost() + "$");
        System.out.println("**************************************************************************************");
    }
    
    public DigitalVideoDisc getALuckyItem() {
        double random = Math.random()*10;
        int lucky = (int)random;
        //System.out.println("Lucky item is: " + itemsOrdered[lucky].getTitle());
        return itemsOrdered[lucky];
    }

}
