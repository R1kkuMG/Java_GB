package FamilyTree;

import java.util.ArrayList;

public class Node {
    private Person person;
    private Node father;
    private Node mother;
    private Node sister;
    private Node brother;
    private Node wife;
    private Node husband;
    private ArrayList<Node> children = new ArrayList<>();
    private ArrayList<Node> bros = new ArrayList<>();
    private ArrayList<Node> couple = new ArrayList<>();

    public Node(Person person) {
        this.person = person;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
        father.addChild(this, Relationship.FATHER);
    }

    public Node getMother() {
        return mother;
    }

    public void setMother(Node mother) {
        this.mother = mother;
        mother.addChild(this, Relationship.MOTHER);
    }

    public Person getPerson() {
        return person;
    }

    public Node getHusband() {
        return husband;
    }

    public Node getWife() {
        return wife;
    }

    public void setHusband(Node husband) {
        this.husband = husband;
        husband.addCouple(this, Relationship.HUSBAND);
    }

    public void setWife(Node wife) {
        this.wife = wife;
        wife.addCouple(this, Relationship.WIFE);
    }

    /**
     * Функция добавления детей в коллекцию
     * @param child - ребенок
     * @param parent - родитель
     */
    public void addChild(Node child, Relationship parent) {
        if (children.contains(child)) {
            return;
        }
        children.add(child);

        switch (parent) {
            case FATHER: {
                child.setFather(this);
                break;
            }
            case MOTHER: {
                child.setMother(this);
                break;
            }
        }
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public Node getSister() {
        return sister;
    }

    public Node getBrother() {
        return brother;
    }

    public void setSister(Node sister) {
        this.sister = sister;
        sister.addBroSis(this, Relationship.SISTER);
    }

    public void setBrother(Node brother) {
        this.brother = brother;
        brother.addBroSis(this, Relationship.BROTHER);
    }

    /**
     * Функция добавления брата/сестры в коллекцию
     * @param child - ребенок
     * @param bro - брат/сестра
     */
    public void addBroSis(Node child, Relationship bro) {
        if(bros.contains(child)) {
            return;
        }
        bros.add(child);

        switch (bro) {
            case SISTER: {
                child.setSister(this);
                break;
            }
            case BROTHER: {
                child.setBrother(this);
                break;
            }
        }
    }

    /**
     * Функция добавления мужа/жены в коллекцию
     * @param person - человек
     * @param spouse - муж/жена
     */
    public void addCouple(Node person, Relationship spouse) {
        if(couple.contains(person)) {
            return;
        }
        couple.add(person);

        switch (spouse) {
            case HUSBAND: {
                person.setHusband(this);
                break;
            }
            case WIFE: {
                person.setWife(this);
                break;
            }
        }
    }

    public ArrayList<Node> getBros() {
        return bros;
    }

    public ArrayList<Node> getCouple() {
        return couple;
    }

    @Override
    public String toString() {
        return person.toString();
    }
}