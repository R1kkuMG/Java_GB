package Planner;

public class Data {
    private int id;
    private String title;
    private String date;
    private String dateTime;
    private String deadline;
    private String lastName;
    private String firstName;
    private Priority priority;

    public Data(int id, String title, String date, String dateTime, String deadline, String lastName, String firstName, Priority priority) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.dateTime = dateTime;
        this.deadline = deadline;
        this.lastName = lastName;
        this.firstName = firstName;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstNameName(String firstName) {
        this.firstName = firstName;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", this.id , this.title, this.date, this.dateTime,
                this.deadline, this.lastName, this.firstName, this.priority);
    }
}
