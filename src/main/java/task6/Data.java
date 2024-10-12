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

    @OneToOne(cascade = CascadeType.ALL) // Defines a one-to-one relationship
    @JoinColumn(name = "rgb_id", referencedColumnName = "id")
    private Rgb rgb;

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
//                ", rgb=" + rgb +
                '}';
    }
}

