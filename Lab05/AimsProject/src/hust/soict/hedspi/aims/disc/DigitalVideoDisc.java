package hust.soict.hedspi.aims.disc;
/**
 * DigitalVideoDisc
 */
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public static final int MAX_NUMBER_DVD = 10;
    private static DigitalVideoDisc[] listDVD = new DigitalVideoDisc[MAX_NUMBER_DVD];
    private int qtyAdded = 0;
    
    public DigitalVideoDisc(String title) {
        setTitle(title);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setLength(length);
        setCost(cost);
    }

    public DigitalVideoDisc() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public void addDVDToList(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc: dvdList) {
            if (qtyAdded == MAX_NUMBER_DVD) {
                System.out.println("The order is almost full! Cannot add '" + disc.getTitle() + "' !");
            }
            else {
                listDVD[qtyAdded] = disc;
                System.out.println(disc.getTitle() + " has been added 1234!");
                qtyAdded ++;
            }
        }
    }
    
    // Tìm kiếm tên dvd
    public boolean search(String title) {
        String[] titleSearch = title.split("\\s");
        int check = 0;
        String strToSearch = getTitle();
        String[] tokenSearch = strToSearch.split("\\s");
        for (String word: titleSearch) {
            for (String token: tokenSearch) {
                if(word.equalsIgnoreCase(token) == true) {
                    check++;
                    if (check == titleSearch.length) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}