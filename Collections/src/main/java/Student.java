import java.util.Objects;

public class Student implements Comparable {
    private int matrikelnr;
    private String name;
    private String vorname;
    private int semester;

    public Student(String n, String vn, int nr, int sem) {
        name = n;
        vorname = vn;
        matrikelnr = nr;
        semester = sem;
    }

    public String toString() {
        return "(" + matrikelnr + "," + name + " " + vorname
                + ", " + semester + ")";
    }

    /**
     * Studenten werden anhand Ihrer eindeutigen Matrikelnr verglichen
     */
    public int compareTo(Object o) {
        int diff = 0;
        if (o.getClass() == getClass()) {
            diff = matrikelnr - ((Student) o).matrikelnr;
        }
        if (diff > 0) {
            diff = 1;
        }
        if (diff < 0) {
            diff = -1;
        }
        return diff;
    }

    /*public int compareTo(Object o){
        if(o.getClass() == getClass()){
            return name.compareTo(((Student) o).getName());
        }
        return 0;
    }*/

    public String getName(){
        return name;
    }

    public String getVorname(){
        return vorname;
    }

    public Integer getMatrikelnr(){
        return matrikelnr;
    }

    public boolean equals(Object o) {
        return (compareTo(o) == 0);
    }

    public int hashCode() {
        return Objects.hashCode(matrikelnr);
    }
}