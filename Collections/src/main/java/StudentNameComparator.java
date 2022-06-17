import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        int retValue =  o1.getName().compareTo(o2.getName());
        if (retValue == 0) {
            retValue = o1.getVorname().compareTo((o2.getVorname()));
        }
        return retValue;
    }
}