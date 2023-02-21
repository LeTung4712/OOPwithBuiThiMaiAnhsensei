import java.util.Scanner;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

/**
 * Aims
 */
public class Aims {
    public static void main(String[] args) {
        Order anOrder = Order.CreateOrder();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        // anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",124,24.95f);

        // anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","John Musker",90,18.99f);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladden","Animation","Roger",90,30.12f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladdun");
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladdon");
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Aladdyn");

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2, dvd3);
        anOrder.addDigitalVideoDisc(dvd4, dvd5, dvd6, dvd7);

        int choiceNumber;
        Scanner scanner = new Scanner(System.in);
        try {
            for (;;) {
                System.out.print(
                        "\n|------------Menu------------\n" +
                                "|1. View Pre-odered\n" +
                                "|2. Total Cost\n" +
                                "|3. Remove Order\n" +
                                "|4. Print Order\n" +
                                "|5. Exit\n" +
                                "-->Nhập chức năng: ");

                do {
                    System.out.println("Bấm số để chọn (1/2/3/4/5): ");
                    choiceNumber = scanner.nextInt();
                } while ((choiceNumber < 1) || (choiceNumber > 5));

                switch (choiceNumber) {
                    case 1:
                        anOrder.printAllTitle();
                        break;
                    case 2:
                        System.out.println("---------------------------");
                        System.out.println("| Total cost is: " + anOrder.totalCost() + " ($)");
                        System.out.println("---------------------------");
                        break;
                    case 3:
                        System.out.println("chọn dvd cần xóa (1/2/3): ");
                        choiceNumber = scanner.nextInt();
                        switch (choiceNumber) {
                            case 1:
                                anOrder.removeDigitalVideoDisc(dvd1);
                                break;
                            case 2:
                                anOrder.removeDigitalVideoDisc(dvd2);
                                break;
                            case 3:
                                anOrder.removeDigitalVideoDisc(dvd3);
                                break;
                        }
                        break;
                    case 4:
                        anOrder.printOrder();
                        break;
                    case 5:
                        System.out.println("out!");
                        System.exit(0); // thoát chương trình
                        break;
                }
            }
        } finally {
            scanner.close();
        }
    }

}