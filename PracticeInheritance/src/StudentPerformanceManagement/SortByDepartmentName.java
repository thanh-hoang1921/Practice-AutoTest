package StudentPerformanceManagement;

import java.util.Comparator;

public class SortByDepartmentName implements Comparator<Department>{

	@Override
	public int compare(Department o1, Department o2) {
		int dpNameCompare = o1.getDepartmentName().compareTo(o2.getDepartmentName());
		if (dpNameCompare != 0) {
			return dpNameCompare;
		} else {
			int academicYearCompare = Integer.compare(o1.getAcademicYearofStudent(), o2.getAcademicYearofStudent());
			if (academicYearCompare != 0) {
				return academicYearCompare;
			}
		}
		return 0;
	}
}
