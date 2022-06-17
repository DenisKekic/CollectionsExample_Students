import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Student> mengeUnsortiert = new HashSet<>();
        Set<Student> mengeSortiert = new TreeSet<>();
        Student s;
        s = new Student("Curie", "Marie", 19, 1);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        s = new Student("Merian", "Maria-Sybilla", 17, 3);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        s = new Student("Noether", "Emmi", 16, 1);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        s = new Student("Liese", "Meitner", 15, 2);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        s = new Student("Herschel", "Caroline", 15, 2);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        ausgaben(mengeUnsortiert);
        ausgaben(mengeSortiert);
    }

    public static void ausgaben(Set<Student> menge) {
        Student s;
        Iterator<Student> studentIterator = menge.iterator();
        System.out.println("Inhalt der Menge ("
                + menge.getClass() + "):"); //
        while (studentIterator.hasNext()) {
            s = studentIterator.next();
            System.out.println("Student: " + s);
        }
    }
}
