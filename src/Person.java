public class Person implements Payable, Comparable<Person>{
    private static int count = 1;
    private int id = 1;
    private String name;
    private String surname;

    public Person(){
        this.id = count++;
    }

    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return id + ". " + name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int get(){
        return id;
    }

    public String getPosition() {
        return "Student";
    }

    public double getPaymentAmount() {
        return 0.00;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(getPaymentAmount(), o.getPaymentAmount());
    }
}
