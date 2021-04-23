package schedulermem;

/**
 * @author [name]
 */
public class SimplePage {

    private int pageId = -1;

    public SimplePage(int pageId) {
        this.pageId = pageId;
    }

    public int getPageId() {
        return this.pageId;
    }

    /**
     * Compare two objects
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof SimplePage) {
            SimplePage otherPage = (SimplePage) o;
            return this.pageId == otherPage.getPageId();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.pageId;
        return hash;
    }

    @Override
    public String toString() {
        return "[" + this.pageId + "]";
    }

}
