package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiscTest {
    public static void main(String[] args) {
        Order anOrder = Order.CreateOrder();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King ");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("One Piece");
        dvd4.setCategory("Animation");
        dvd4.setCost(20f);
        dvd4.setDirector("Roger Allers");
        dvd4.setLength(87);


        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Power Ranger");
        dvd5.setCategory("Animation");
        dvd5.setCost(13f);
        dvd5.setDirector("Roger Allers");
        dvd5.setLength(87);


        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Gao Ranger");
        dvd6.setCategory("Animation");
        dvd6.setCost(21f);
        dvd6.setDirector("Roger Allers");
        dvd6.setLength(87);


        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Kamen Rider Ryuki");
        dvd7.setCategory("Animation");
        dvd7.setCost(22f);
        dvd7.setDirector("Roger Allers");
        dvd7.setLength(87);


        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Kamen Rider Zi-o");
        dvd8.setCategory("Animation");
        dvd8.setCost(23f);
        dvd8.setDirector("Roger Allers");
        dvd8.setLength(87);


        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Kamen Rider Faiz");
        dvd9.setCategory("Animation");
        dvd9.setCost(24f);
        dvd9.setDirector("Roger Allers");
        dvd9.setLength(87);


        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Kamen Rider Fourze");
        dvd10.setCategory("Animation");
        dvd10.setCost(25f);
        dvd10.setDirector("Roger Allers");
        dvd10.setLength(87);
        
        anOrder.addDigitalVideoDisc(dvd1,dvd2,dvd3,dvd4,dvd5,dvd6,dvd7,dvd8,dvd9,dvd10);

       // dvd1.addDVDToList(dvd1,dvd2,dvd3,dvd4,dvd5,dvd6,dvd7,dvd8,dvd9,dvd10);
        //dvd1.printDVDList()

        //test search method
        System.out.println(dvd1.search("the KiNg"));

        //test get lucky item method
        anOrder.printOrder();
        DigitalVideoDisc dvdLucky = anOrder.getALuckyItem();
        System.out.println("Lucky item is: " + dvdLucky.getTitle() + dvdLucky.getCost() + "$");
        float newTotal = anOrder.totalCost()-dvdLucky.getCost();
        System.out.println("New total cost is: " + newTotal + "$");

    }
}
