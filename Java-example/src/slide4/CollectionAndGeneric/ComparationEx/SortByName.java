package slide4.CollectionAndGeneric.ComparationEx;

import java.util.Comparator;

public class SortByName  implements Comparator<Student> {
    public int compare(Student student, Student other) 
    { 
        return student.name.compareTo(other.name);
    } 

}
