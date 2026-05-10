package schedulermem;

/**
 * @author Roman Yasinovskyy
 * @version 2026.5.9
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
        return 2026 * (2026 + this.pageId) % 450;
    }

    @Override
    public String toString() {
        return "[" + this.pageId + "]";
    }

}
