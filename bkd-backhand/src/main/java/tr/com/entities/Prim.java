package tr.com.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * A Prim.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "prim")
public class Prim implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotNull
    @Size(min = 5, max = 20)
//    @Pattern(regexp = "^[a-zA-Z0-9]*$")        
    @Column(name = "adi", length = 20, nullable = false)
    private String adi;

    @NotNull
    @Min(value = 0)
    @Max(value = 100)        
    @Column(name = "yuzde", nullable = false)
    private Double yuzde;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Double getYuzde() {
        return yuzde;
    }

    public void setYuzde(Double yuzde) {
        this.yuzde = yuzde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Prim prim = (Prim) o;

        if ( ! Objects.equals(id, prim.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Prim{" +
                "id=" + id +
                ", adi='" + adi + "'" +
                ", yuzde='" + yuzde + "'" +
                '}';
    }
}
