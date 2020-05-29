import java.math.BigDecimal;
import java.util.Objects;

public class Vinyl extends MusicItem {
    private int speed;
    private double diameter;

    public Vinyl(String itemID, String title, String genre, String releaseDate, String artist, BigDecimal price, int speed, double diameter) {
        super(itemID, title, genre, releaseDate, artist, price);
        this.speed = speed;
        this.diameter = diameter;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vinyl vinyl = (Vinyl) o;
        return speed == vinyl.speed &&
                Double.compare(vinyl.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, diameter);
    }

    @Override
    public String toString() {
        return "Vinyl{" +super.toString() +
                "speed=" + speed +
                ", diameter=" + diameter +
                '}';
    }
}
