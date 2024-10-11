package task6;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @ElementCollection
    List<String> colors;
    @Column
    Boolean isPrimary;
//    @Column
    Rgb rgb;

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean primary) {
        isPrimary = primary;
    }

    public Rgb getRgb() {
        return rgb;
    }

    public void setRgb(Rgb rgb) {
        this.rgb = rgb;
    }

    public String toString() {
        return "ColorPalette{" +
                "colors=" + colors +
                ", isPrimary=" + isPrimary +
                ", rgb=" + rgb +
                '}';
    }
}

class Rgb implements Serializable {
    int r;
    int g;
    int b;

    Rgb(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rgb{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
