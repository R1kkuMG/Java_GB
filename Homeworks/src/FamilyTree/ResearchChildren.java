package FamilyTree;

public class ResearchChildren implements Researchable {
    public void buttonClick(Person person) {
        person.getNode().getChildren().sort(new NameComparator());
        PrinterConsole pc = new PrinterConsole();
        pc.printArray(person.getNode().getChildren());
    }
}
