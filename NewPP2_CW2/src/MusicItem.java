import java.math.BigDecimal;
import java.util.Objects;

 public abstract class MusicItem implements Comparable<MusicItem>{
    protected String itemID;
    protected String title;
    protected String genre;
    protected String releaseDate;
    protected String artist;
    protected BigDecimal price;

    public MusicItem(String itemID, String title, String genre, String releaseDate, String artist, BigDecimal price) {
        this.itemID = itemID;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.artist = artist;
        this.price = price;
    }

    public String getItemID() {  //only the item Id have a getter method No setter method.This is because it is kept so that others can't change
        return itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {   //To get a meaningful OUTPUT
        return "MusicItem{" +
                "itemID='" + itemID + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicItem musicItem = (MusicItem) o;
        return Objects.equals(itemID, musicItem.itemID) &&
                Objects.equals(title, musicItem.title) &&
                Objects.equals(genre, musicItem.genre) &&
                Objects.equals(releaseDate, musicItem.releaseDate) &&
                Objects.equals(artist, musicItem.artist) &&
                Objects.equals(price, musicItem.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID, title, genre, releaseDate, artist, price);
    }

     @Override
     public int compareTo(MusicItem o) {
         return this.getTitle().compareTo(o.getTitle());
     }


}
