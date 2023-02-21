import java.util.Scanner;

/**
 * Aims
 */
public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);

        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);

        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);

        anOrder.addDigitalVideoDisc(dvd3);

        int choiceNumber;
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.print(
                    "\n|-----Menu-----\n" +
                            "|1. View Pre-odered\n" +
                            "|2. Total Cost\n" +
                            "|3. Remove order\n" +
                            "|4. Thoát\n" +
                            "-->Nhập chức năng: ");

            do {
                System.out.println("Bấm số để chọn (1/2/3/4): ");
                choiceNumber = scanner.nextInt();
            } while ((choiceNumber < 1) || (choiceNumber > 3));

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
                    System.out.println("out!");
                    System.exit(0); // thoát chương trình
                    break;
            }
        }
    }
}