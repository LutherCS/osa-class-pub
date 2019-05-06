package schedulerdisk;

import java.util.Comparator;

/**
 * @author [name]
 */
public class SimpleRequest {

    private final int cylinder;

    public SimpleRequest(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getCylinder() {
        return cylinder;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.cylinder;
        return hash;
    }

    @Override
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
        final SimpleRequest other = (SimpleRequest) obj;
        if (this.cylinder != other.cylinder) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("[%d]", cylinder);
    }
    
}
