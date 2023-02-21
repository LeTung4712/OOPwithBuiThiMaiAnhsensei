/**
 * Order
 */
public class Order {

    public static final int MAX_NUMBER_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered;

    public Order() {
        this.qtyOrdered = 0;
        for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
            itemsOrdered[i] = null;
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
            qtyOrdered++;
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

}


