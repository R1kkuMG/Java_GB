package FamilyTree;

import java.util.ArrayList;

public class PrinterConsole {

    public void printPerson(Person person) {
        System.out.printf("Имя: %s\nФамилия: %s", person.getFirstName(), person.getLastName());
    }

    public void printArray(ArrayList<Node> node) {
        if (!node.isEmpty()) {
            for (Node n: node) {
                System.out.printf("  " + n.getPerson().getFirstName() + " " + n.getPerson().getLastName());
            }
        }
    }

    public void printNode(Node node) {
        if (node.getFather() != null && node.getMother() != null) {
            System.out.printf("%s %s \n %s \n", node.getFather(), node.getMother(), node.getPerson());
        } else if (node.getFather() != null && node.getMother() == null) {
            System.out.printf("%s \n %s \n", node.getFather(), node.getPerson());
        } else if (node.getFather() == null && node.getMother() != null) {
            System.out.printf("%s \n %s \n", node.getMother(), node.getPerson());
        } else {
            System.out.printf("%s\n", node.getPerson());
        }
        printArray(node.getChildren());
    }
}