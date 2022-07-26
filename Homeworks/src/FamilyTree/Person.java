package FamilyTree;

public class Person {

    private String firstName;
    private String lastName;
    private Gender gender;
    private Node node;

    enum Gender {
        MALE,
        FEMALE,
        UNKNOWN
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    /**
     * Функция для сортировки имен по алфавиту
     * @param person - человек
     * @return возвращает целое число, которое показывает относительное положение имен в порядке сортировки
     */
    public int compareTo(Person person) {
        int result = this.firstName.compareTo(person.firstName);
        return result;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
