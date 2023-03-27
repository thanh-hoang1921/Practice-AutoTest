package StudentPerformanceManagement;

import java.util.Comparator;

public class SortByDepartmentName implements Comparator<Department>{

	@Override
	public int compare(Department o1, Department o2) {
		int dpNameCompare = o1.getDepartmentName().compareTo(o2.getDepartmentName());
		if (dpNameCompare != 0) {
			return dpNameCompare;
		} 
		return 0;
	}
}

class SortByYearOfAdmission implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int yearAcademicCompare = o2.getYearOfAdmission() - o1.getYearOfAdmission();
		if(yearAcademicCompare != 0) {
			return yearAcademicCompare;
		}
		return 0;
	}

}
