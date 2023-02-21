package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
  private List<String> authors = new ArrayList<String>();

  public Book() {
  }

  public Book(int id) {
    super(id);
  }

  public Book(String title) {
    super(title);
  }

  public Book(String title, String category) {
    super(title, category);
  }

  public Book(String title, String category, List<String> authors) {
    super(title, category);
    this.authors = authors;
  }

  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public void addAuthor(String authorName) {
    if (authors.contains(authorName)) {
      System.out.println("This author is already exists!");
    } else {
      authors.add(authorName);
      System.out.println("Add success!");
    }
  }

  public void removeAuthor(String authorName) {
    if (authors.remove(authorName)) {
      System.out.println("Remove success!");
    } else {
      System.out.println("This author is not exists!");
    }
  }
}