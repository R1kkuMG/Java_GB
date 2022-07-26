package FamilyTree;

public class Main {
    public static void main(String[] args) {
        Person sergeyS = new Person("Сергей", "Шахов", Person.Gender.MALE);
        Person svetaS = new Person("Светлана", "Шахова", Person.Gender.FEMALE);
        Person vasyaS = new Person("Василий", "Шахов", Person.Gender.MALE);
        Person margoS = new Person("Маргарита", "Шахова", Person.Gender.FEMALE);
        Person annaS = new Person("Анна", "Шахова", Person.Gender.FEMALE);
        Person mishaS = new Person("Михаил", "Шахов", Person.Gender.MALE);

        Node nodeSergey= new Node(sergeyS);
        sergeyS.setNode(nodeSergey);
        Node nodeSveta = new Node(svetaS);
        svetaS.setNode(nodeSveta);
        Node nodeVasya = new Node(vasyaS);
        vasyaS.setNode(nodeVasya);
        Node nodeMargo = new Node(margoS);
        margoS.setNode(nodeMargo);
        Node nodeMisha = new Node(mishaS);
        mishaS.setNode(nodeMisha);
        Node nodeAnna = new Node(annaS);
        annaS.setNode(nodeAnna);

        nodeVasya.setFather(nodeSergey);
        nodeVasya.setMother(nodeSveta);
        nodeMargo.setFather(nodeSergey);
        nodeMargo.setMother(nodeSveta);
        nodeMisha.setFather(nodeVasya);
        nodeMisha.setMother(nodeAnna);
        nodeMargo.setBrother(nodeVasya);
        nodeVasya.setSister(nodeMargo);

        nodeSergey.setWife(nodeSveta);
        nodeSveta.setHusband(nodeSergey);
        nodeAnna.setHusband(nodeVasya);
        nodeVasya.setWife(nodeAnna);



//            // Поиск братьев/сестер
        Researchable researchBros = new ResearchBros();
        researchBros.buttonClick(margoS);

//

//            // Поиск детей
//            Researchable researchChildren = new ResearchChildren();
//            researchChildren.buttonClick(sergeyS);


//            // Поиск мужа/жены
//            Researchable researchCouple = new ResearchCouple();
//            researchCouple.buttonClick(margoS);


//            // Вывод связей родители-дети
//            Researchable research2 = new ResearchNode();
//            research2.buttonClick(mishaS);

//            PrinterConsole pr = new PrinterConsole();
//            pr.printPerson(sergeyS);
//            pr.printArray(nodeVasya.getChildren());
//            pr.printNode(nodeMisha);
    }
}