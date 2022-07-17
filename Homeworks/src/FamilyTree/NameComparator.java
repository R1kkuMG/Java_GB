package FamilyTree;

import java.util.Comparator;

public class NameComparator implements Comparator<Node> {

    public int compare(Node name1, Node name2) {
        return name1.getPerson().compareTo(name2.getPerson());
    }
}
