package aims.media;

public class Track implements Playable, Comparable {
  private String title;
  private int length;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  @Override
  public void play() {
    System.out.println("Playing track: " + this.getTitle());
    System.out.println("Track length: " + this.getLength());
  }

  @Override
  public int compareTo(Object o) {
    Track track = (Track) o;

    return this.getTitle().compareTo(track.getTitle());
  }
}