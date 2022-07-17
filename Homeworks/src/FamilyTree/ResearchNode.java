package FamilyTree;

public class ResearchNode implements Researchable {

    public void buttonClick(Person person) {
        PrinterConsole pc = new PrinterConsole();
        pc.printNode(person.getNode());
    }
}
