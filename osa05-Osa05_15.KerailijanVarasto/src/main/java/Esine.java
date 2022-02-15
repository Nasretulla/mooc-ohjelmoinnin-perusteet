import java.util.Objects;
public class Esine {

    String nimi;
    String tunnus;

    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;

    }
    public String getTunnus() {
        return tunnus;
    }

    public String getNimi() {
        return nimi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Esine other = (Esine) obj;
        if (!Objects.equals(this.tunnus, other.tunnus)) {
            return false;
        }
        return true;
    }



    public String toString() {
        return this.tunnus + ": " + this.nimi;
    }

}
