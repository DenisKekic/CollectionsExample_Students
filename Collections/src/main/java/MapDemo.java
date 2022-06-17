import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,Student> matrikelMap = new TreeMap<Integer,Student>();
        Map<String, Student> nachnameMap = new HashMap<String,Student>();
        Student s;
        s = new Student("Curie", "Marie", 19, 1);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);
        s = new Student("Merian", "Maria-Sybilla", 17, 3);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);
        s = new Student("Noether", "Emmi", 16, 1);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);
        s = new Student("Meitner", "Lise", 15, 2);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);
        s = new Student("Herschel", "Caroline", 20, 2);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);
        ausgabenMatrikelnr(matrikelMap);
        ausgabenNamen(nachnameMap);
    }
    public static void ausgabenMatrikelnr(Map<Integer,Student> mp) {
        int s;
        Student st;
        // System.out.println("Einsetzen: Vorbereitungen zum Auslesen der Matrikelnr");

        Iterator<Integer> iterMatrikel = mp.keySet().iterator();
        System.out.println("Name ("
                + mp.getClass() + "):");
        while (iterMatrikel.hasNext()) {
            s = iterMatrikel.next();
            System.out.println("Matrikelnummer: " + s);
        }
        int mnr = 15;
        System.out.println("Student mit Matrikelnummer " + mnr +
                " ist:" + mp.get(mnr) );
        mnr = 16;
        System.out.println("Student mit Matrikelnummer " + mnr +
                " ist:" + mp.get(mnr) );
        System.out.println("Alle Werte der MatrikelMap:");
        Collection<Student> l = mp.values();
        Iterator<Student> iterStudi = l.iterator();
        System.out.println("Name ("
                + mp.getClass() + "):");
        while (iterStudi.hasNext()) {
            st = iterStudi.next();
            System.out.println("Student: " + st);
        }
    }
    public static void ausgabenNamen(Map<String,Student> mp) {
        String str;
        Student st;
        // System.out.println("Einsetzen: Vorbereitungen zum Auslesen der Nachnamen");
        Iterator<String> iterNachname = mp.keySet().iterator();
        System.out.println("Namen ("
                + mp.getClass() + "):");
        while (iterNachname.hasNext()) {
            str = iterNachname.next();
            System.out.println("Nachname: " + str);
        }
        String nme = "Merian";
        System.out.println("Student mit Name " + nme +
                " ist:" + mp.get(nme) );
        nme = "Herschel";
        System.out.println("Student mit Name " + nme +
                " ist:" + mp.get(nme) );
        System.out.println("Alle Werte der NamenMap:");
        Collection<Student> l = mp.values();
        Iterator<Student> iterStudi = l.iterator();
        System.out.println("Name ("
                + mp.getClass() + "):");
        while (iterStudi.hasNext()) {
            st = iterStudi.next();
            System.out.println("Student: " + st);
        }
    }
}
