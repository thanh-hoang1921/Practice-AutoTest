package StudentPerformanceManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Stream;

public class StudentManagement {

	/**
	 * 1. Display all students
	 */
	public void displayStudent(List<Student> studentList) {
		for (Student student : studentList) {
			student.displayStudentInfo();
			// System.out.printf("%10s%20s%22s%10s%15s%15s%10s%15s\\n",
			// student.getStudentId(), student.getFullName(), student.getDateOfBirth(),
			// student.getYearOfAdmission(), student.getBenchmark(), student.semester(),
			// student.GPA());
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
	 * 2. check student type (Formal student student)
	 * 
	 * @return studentList
	 */
	/*
	 * public List<Student> findByFormalStudent(List<Student> studentList){ return
	 * studentList.stream().filter(student -> student instanceof
	 * FormalStudent).collect(Collectors.toList()); }
	 */

	public void checkStudentType(List<Student> studentList) {
		studentList.forEach(st -> {
			if (st instanceof FormalStudent) {
				System.out.println("[" + st.getStudentId() + "] " + st.getFullName() + " is Formal student");
				return;
			}
			if (st instanceof IncumbentStudent) {
				System.out.println("[" + st.getStudentId() + "] " + st.getFullName() + " is Incumbent student");
				return;
			}
			System.out.println("Undefined");
		});
	}

	/**
	 * 4. Count formal student
	 */

	public int countFormalStudent(List<Student> students) {
		int count = 0;
		for (Student student : students) {
			if (student instanceof FormalStudent) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 4.1. Total Formal Student of each Department
	 * 
	 * @param departments
	 */
	public void totalFormalStudentOfDepartment(List<Department> departments) {
		departments.forEach(dp -> {
			System.out.print("\n\n" + dp.getDepartmentName() + " Department has "
					+ countFormalStudent(dp.getStudentList()) + " student(s)");
		});
	}

//	/**
//	 * 5. Find student who has high score in each department
//	 * @param department
//	 * @return result
//	 */
//	public HashMap<String, Student> findHighScore(Department department){
//		HashMap<String, Student> result = new HashMap<String, Student>();
//		double maxBenchmark = 0;
//		Student highBenchmarkScoreStudent = null;
//		
//		if(department.getStudentList().size() == 0) {
//			System.out.println(department.getDepartmentName() + " department has no student");
//			return null;
//		}
//		for (Student student : department.getStudentList()) {
//			if(student.getBenchmark() > maxBenchmark) {
//				maxBenchmark = student.getBenchmark();
//				highBenchmarkScoreStudent = student;
//			}
//		}
//		result.put(department.getDepartmentName(), highBenchmarkScoreStudent);
//		System.out.println("High benchmark score of " + department.getDepartmentName() + " is: " + maxBenchmark);
//		return result;
//	}

	/**
	 * 5. Find student has high score
	 * 
	 * @param students
	 */
	public void findStudentWithHighScore(List<Student> students) {
		int count = 0;
		double maxBenchmark = students.stream().mapToDouble(mb -> mb.getBenchmark()).max().orElse(0);
		for (Student st : students) {
			if (st.getBenchmark() == maxBenchmark) {
				count += 1;
				st.displayStudentInfo();
			}
		}
		if (count == 0) {
			System.out.println("There are no student");
		}
	}

	/**
	 * 5.1. Find student with high score by department
	 * 
	 * @param departments
	 */
	public void findStudentHighScoreByDepartment(List<Department> departments) {
		departments.forEach(dp -> {
			System.out.println("\n\n<<<<<DEPARTMENT " + dp.getDepartmentName() + ">>>>>");
			findStudentWithHighScore(dp.getStudentList());
		});
	}

	/**
	 * 6. Display incumbent student by location
	 * 
	 * @param students
	 * @param location
	 */
	public void getStudentByLocation(List<Student> students, String location) {
		int count = 0; // count student of each location
		for (Student student : students) {
			if (student instanceof FormalStudent) {
				continue;
			}

			if (student instanceof IncumbentStudent
					&& ((IncumbentStudent) student).getTrainingLinkLocation().equals(location)) {
				student.displayStudentInfo();
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println("There is no student in: " + location);
		}
	}

	/**
	 * 6.1 Display incumbent student by location as Department
	 * 
	 * @param departments
	 * @param location
	 */
	public void findStudentByLocationByDepartment(List<Department> departments, String location) {
		departments.forEach(dp -> {
			System.out.println("\n\n<<<<<DEPARTMENT " + dp.getDepartmentName() + ">>>>>");
			getStudentByLocation(dp.getStudentList(), location);
		});
	}

	/**
	 * 7. Find good student at the end of term
	 * @param students
	 */
	public void getGoodStudentAtTheEndOfTerm1(List<Student> students) {
		int count = 0;
		for(Student student : students) {
			if(students != null) {
				ListOfStudyResult result = student.getListOfStudyResult().get(student.getListOfStudyResult().size() - 1);
				if(result.getGPA() > 8.0 && getLastSemester(student.getListOfStudyResult()) != null) {
					student.displayStudentInfo();
					count += 1;
				}
			}
		}
		if (count == 0) {
			System.out.println("There no student > 8.0");
		}
	}
	
	/**
	 * 7.1. Find good student at the end of term by department
	 * @param departments
	 */
	public void findGoodStudentAtTheEndOfTermByDepartment(List<Department> departments) {
		System.out.println("List good students at the end of term of each department: ");
		departments.forEach(dp -> {
			System.out.println("\n\n<<<<<DEPARTMENT " + dp.getDepartmentName() + ">>>>>");
			getGoodStudentAtTheEndOfTerm1(dp.getStudentList());
		});
	}
	
	/**
	 * Stream#skip: Một cách khác để lấy được phần tử cuối cùng của stream bằng cách
	 * bỏ qua tất cả các phần tử trước nó với skip method trong stream.
	 * 
	 * @param results
	 * @return
	 */
	public ListOfStudyResult getLastSemester(List<ListOfStudyResult> results) {
		long count = results.stream().count();
		Stream<ListOfStudyResult> stream = results.stream();
		ListOfStudyResult last = stream.skip(count - 1).findFirst().get();
		if (last != null) {
			return last;
		}
		return null;
	}

	/**
	 * 8. Find students with the highest semester GPA
	 * 
	 * @param students
	 */
	public void findHighestGPAOffStudent(List<Student> students) {
		int count = 0;
		double highestPoint = 0;
		List<Student> highestScoreStudent = new ArrayList<Student>();
		for (Student st : students) {
			if (findHighestGPA(st.getListOfStudyResult()) > highestPoint) {
				highestPoint = findHighestGPA(st.getListOfStudyResult());
				highestScoreStudent.clear();
				highestScoreStudent.add(st);
				count += 1;
			} else if (findHighestGPA(st.getListOfStudyResult()) == highestPoint) {
				highestScoreStudent.add(st);
				count += 1;
			}
		}
		highestScoreStudent.forEach(st -> st.displayStudentInfo());
		if (count == 0) {
			System.out.println("There is no students");
		}
	}

	/**
	 * 8.1. Find highestGPA
	 * 
	 * @param resultList
	 * @return highestGPA
	 */
	public double findHighestGPA(List<ListOfStudyResult> resultList) {
		double highestGPA = 0;
		for (ListOfStudyResult result : resultList) {
			if (result.getGPA() > highestGPA) {
				highestGPA = result.getGPA();
			}
		}
		return highestGPA;
	}

	/**
	 * 8.2. Find Highest GPA Of each Department
	 * 
	 * @param department
	 */
	public void findHighestGPAOfDepartment(List<Department> department) {
		department.forEach(dp -> {
			System.out.println("\n\n<<<<<DEPARTMENT " + dp.getDepartmentName() + ">>>>>");
			findHighestGPAOffStudent(dp.getStudentList());
		});
	}

	/**
	 * 9. sort by department ACS sort by yearOfAdmission DESC
	 * 
	 * @param departments
	 */
	public void sortByDepartmentAndAcademicYear(List<Department> departments) {
		Collections.sort(departments, new SortByDepartmentName());
		departments.forEach(dp -> {
			System.out.println("\n<<<<<DEPARTMENT " + dp.getDepartmentName() + ">>>>>");
			dp.displayDepartment();
		});
	}

	/**
	 * add element in map
	 * 
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
	 * 
	 * @param studentList
	 */
	public void statisticsStudent(List<Student> studentList) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int numberOfStudent = 0;
		for (int i = 0; i < studentList.size(); i++) {
			addElement(map, studentList.get(i).getYearOfAdmission());
		}
		for (Integer key : map.keySet()) {
			numberOfStudent++;
			System.out.print(key + " : " + map.get(key) + " , ");
		}
		if (numberOfStudent == 0) {
			System.out.println("There're no students in this department");
		}
	}

	/**
	 * 10.1. Satistic on the number of student by year of admission by each
	 * department
	 * 
	 * @param department
	 */
	public void statisticByDepartment(List<Department> department) {
		department.forEach(dp -> {
			System.out.println("\n\n<<<<<DEPARTMENT " + dp.getDepartmentName() + ">>>>>");
			statisticsStudent(dp.getStudentList());
		});
	}
}
