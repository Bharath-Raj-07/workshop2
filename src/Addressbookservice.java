import java.util.ArrayList;

public class Addressbookservice {
    ArrayList<Person> book = new ArrayList<>();
    public void addPerson(Person p1){
        book.add(p1);
    }

    @Override
    public String toString() {
        return "Addressbookservice{" +
                "book=" + book +
                '}';
    }
}
