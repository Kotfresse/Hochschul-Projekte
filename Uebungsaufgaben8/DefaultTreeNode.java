/**
 * @author Tri Nguyen, Leonard Winter
 **/


public class DefaultTreeNode implements SimpleTreeNode {
    private int CAPACITY;
    private String name;
    private SimpleTreeNode[] children;
    private int childcnt;

    public DefaultTreeNode(String name) { // Konstruktor
        CAPACITY = 1;
        this.name = name;
        children = new SimpleTreeNode[CAPACITY];
        childcnt = 0;
    }

    public void addChild(SimpleTreeNode child) {
        if (childcnt >= CAPACITY) {
            CAPACITY *= 2; // Kapazitaets-Verdopplung
            SimpleTreeNode[] newchildren = new SimpleTreeNode[CAPACITY];
            for (int i = 0; i < childcnt; i++) {
                newchildren[i] = children[i]; // alte Kinder eintragen
            }
            children = newchildren; // neue Referenz eintragen
        }
        children[childcnt++] = child; // neues Kind einfuegen
    }

    public int getChildCnt() {
        return childcnt;
    }

    public SimpleTreeNode getChild(int pos) {
        return children[pos];
    }

    public String toString() {
        return name;
    }
}
