package FamilyTree;

public class ResearchCouple implements Researchable {
    public void buttonClick(Person person) {
        PrinterConsole pc = new PrinterConsole();
        pc.printArray(person.getNode().getCouple());
    }
}
