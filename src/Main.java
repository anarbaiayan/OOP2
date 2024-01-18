import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + ": " + person.getPaymentAmount() + " $");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ayan" , "Anarbay" , "Coder" , 1000000);
        Employee e2 = new Employee("asd" , "asd" , "asd" , 200000);
        Student s1 = new Student("asd" , "asd" , 4.0);
        Student s2 = new Student("asd" , "sad" , 2.0);

        ArrayList<Person> arr = new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        arr.add(s1);
        arr.add(s2);
        Collections.sort(arr);

        printData(arr);
    }
}