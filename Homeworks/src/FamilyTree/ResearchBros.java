package FamilyTree;

public class ResearchBros implements Researchable {
    public void buttonClick(Person person) {
        person.getNode().getBros().sort(new NameComparator());
        PrinterConsole pc = new PrinterConsole();
        pc.printArray(person.getNode().getBros());
    }
}