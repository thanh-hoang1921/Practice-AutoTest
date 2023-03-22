package StudentPerformanceManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StudentManagement {

	/**
	 * 1. Display all students
	 */
	public void displayStudent(List<Student> studentList) {
		for (Student student : studentList) {
			student.displayStudentInfo();
			//System.out.printf("%10s%20s%22s%10s%15s%15s%10s%15s\\n", student.getStudentId(), student.getFullName(), student.getDateOfBirth(), student.getYearOfAdmission(), student.getBenchmark(), student.semester(), student.GPA());
		}
	}
	
	/**
	 * 3. Display all students by all departments
	 */
	public void displayStudentByAllDepartment(List<Department> departmentList) {
		for (Department dp : departmentList) {
			dp.displayDepartment();
		}
	}
	
	/**
	 * 2. check student type (incumbent student)
	 * @return studentList
	 */
	public List<Student> findByFormalStudent(List<Student> studentList){
		return studentList.stream().filter(student -> student instanceof FormalStudent).collect(Collectors.toList());
	}
	
	
	/**
	 * 4. Count formal student
	 */
	public int countFormalStudent(Department department) {
		int count = 0;
		for (Student student : department.getStudentList()) {
			if (student instanceof FormalStudent) {
				count++;
			}
		}
		System.out.println("Number of formal student of: " + department.getDepartmentName() + " is "+ count);
		return count;
	}

	/**
	 * 5. Find student who has high score in each department
	 * @param department
	 * @return result
	 */
	public HashMap<String, Student> findHighScore(Department department){
		HashMap<String, Student> result = new HashMap<String, Student>();
		double maxBenchmark = 0;
		Student highBenchmarkScoreStudent = null;
		
		if(department.getStudentList().size() == 0) {
			System.out.println(department.getDepartmentName() + " department has no student");
			return null;
		}
		for (Student student : department.getStudentList()) {
			if(student.getBenchmark() > maxBenchmark) {
				maxBenchmark = student.getBenchmark();
				highBenchmarkScoreStudent = student;
			}
		}
		result.put(department.getDepartmentName(), highBenchmarkScoreStudent);
		System.out.println("High benchmark score of " + department.getDepartmentName() + " is: " + maxBenchmark);
		return result;
	}
	
	public HashMap<String, Student> findHighScore1(List<Department> departmentList){
		HashMap<String, Student> result = new HashMap<String, Student>();
		double maxBenchmark = 0;
		Student highBenchmarkScoreStudent = null;
		Department department = null;
		for (int i = 0; i < departmentList.size(); i++) {
		   department = departmentList.get(i);
		   if(department.getStudentList().size() == 0) {
				System.out.println(department.getDepartmentName() + " department has no student");
				return null;
			}
			for (Student student : department.getStudentList()) {
				if(student.getBenchmark() > maxBenchmark) {
					maxBenchmark = student.getBenchmark();
					highBenchmarkScoreStudent = student;
				}
			}
		}
		result.put(department.getDepartmentName(), highBenchmarkScoreStudent);
		System.out.println("High benchmark score of " + department.getDepartmentName() + " is: " + maxBenchmark);
		return result;
	}

	/**
	 * 6. Display incumbent student by location
	 * @param students
	 * @param location
	 */
	public void getStudentByLocation(List<Student> students, String location) {
		int count = 0; //count student of each location
		for (Student student : students) {
			if(student instanceof FormalStudent) {
				continue;
			}
			
			if(student instanceof IncumbentStudent && ((IncumbentStudent) student).getTrainingLinkLocation().equals(location)) {
				student.displayStudentInfo();
				count+=1;
			}
		}
		if(count == 0) {
			System.out.println("There is no student in: "+ location);
		}
	}
	
//Sai
	public void getGoodStudentAtTheEndOfTerm(List<Student> students) {
		System.out.println("List of good students at the end of term: ");
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			ListOfStudyResult result = student.getListOfStudyResult().get(student.getListOfStudyResult().size() - 1);
			if (result.getGPA() >= 8.0) {
				student.displayStudentInfo();
				return;
			}
			if(result.getGPA() < 8.0) {
				System.out.println("There is no good student at the end of team");
				return;
			}
		}
	}
	
	public double maxGPA(List<Student> studentList) {
		double max = 0;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).GPA()> max) {
				 max = studentList.get(i).GPA();
			}
		}
		return max;
	}
	
	
	  public List<Student> findGoodStudent(List<Student> studentList){
		  double maxScore = 0;
		  for(int i = 0; i < studentList.size(); i++) {
			  Student student = studentList.get(i);
			  if(maxScore < maxGPA(studentList)) {
				 // maxScore = 
			  }
		  }
		return studentList;
		  
	  }
	 
	 
	/**
	 * 9. sort by department ACS
	 * sort by yearOfAdmission DESC
	 * Chị ơi, chỗ này nó sort đoạn đầu thì đúng nhưng mà đoạn sau nó sort bị sai, em không tìm được nguyên nhân ạ Q-Q
	 * @param departments
	 */
	public void sortByDepartmentAndAcademicYear(List<Department> departments) {
		Collections.sort(departments, new SortByDepartmentName());
		departments.forEach(student -> student.displayDepartment());
	}
	
	
	/**
	 * add element in map
	 * @param map
	 * @param element
	 */
	public void addElement(TreeMap<Integer, Integer> map, int element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}
	
	/**
	 * 10. Satistic on the number of student by year of admission
	 * Nhờ chị sửa đoạn này giúp em với ạ. Làm sao để get được Khoa vậy ạ.
	 * @param studentList
	 */
	public void statisticsStudent(List<Student> studentList) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < studentList.size(); i++) {
			addElement(map, studentList.get(i).getYearOfAdmission());
		}
		for(Integer key : map.keySet()) {
			System.out.print(key + " : " + map.get(key) + " , ");
		}
	}
}
