import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Student> ll = new LinkedList();
        Student s;
        s = new Student("Curie", "Marie", 19, 1);
        ll.add(s);
        s = new Student("Merian", "Maria-Sybilla", 17, 3);
        ll.add(s);
        s = new Student("Noether", "Emmi", 16, 1);
        ll.add(s);
        s = new Student("Meitner", "Liese", 15, 2);
        ll.add(s);
        s = new Student("Meitner", "Laura", 18, 2);
        ll.add(s);
        s = new Student("Herschel", "Caroline", 15, 2);
        ll.add(s);

        System.out.println("Element auf Index 1:" + ll.get(1));
        System.out.println("Liste:" + ll);

        // Andere Möglichkeit - Elemente ausgeben
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        System.out.println("----Ausgabe mit Iterator----");
        Iterator<Student> iter = ll.iterator();
        System.out.println("Inhalt der Liste:");
        while (iter.hasNext()){
            s = iter.next();
            System.out.println("Student: " + s);
        }

        System.out.println("Inhalt der Liste mit der erweiterten for-schleife:");
        for (Student st : ll){
            System.out.println("Student: " + st);
        }

        System.out.println("---Liste sorteiert-----");
        Collections.sort(ll);
        for (Student st : ll) {
            System.out.println(st);
        }

        System.out.println("---Liste nach dem Namen sortiert----");
        Collections.sort(ll, new StudentNameComparator());
        for (Student st : ll) {
            System.out.println("Student: " + st);
        }

        // Alternativer Aufruf mit anonymer inneren Klasse
        ll.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo((o2.getName()));
            }
        });
    }
}