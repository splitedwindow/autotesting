package task6;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Rgb implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int r;
    private int g;
    private int b;

    Rgb(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Rgb() {

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
