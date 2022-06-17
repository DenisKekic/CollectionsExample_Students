import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args){
        Set<String> s = new TreeSet<>(new ReverseStringComparator());
        s.add("Kiwi");
        s.add("Kirsche");
        s.add("Ananas");
        s.add("Zitrone");
        s.add("Grapefruit");
        s.add("Banane");

        //sortierte Ausgabe
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static class ReverseStringComparator implements Comparator<String> {
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}
