class Person {}
class Worker extends Person {}
class Student extends Person {}
class HighStudent extends Student {}

class Course<T>
{
	private String name;
	private T[] students;
	
	public Course(String name, int num)
	{
		this.name = name;
		students = (T[])(new Object[num]);
	}
	public void add(T student) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}
	public String getName() { return name; }
	public T[] getStudents() { return students; }
}

public class WildcardEx {

	public static void registerCourse(Course<?> course) {}
	public static void registerStudentCourse(Course<? extends Student> course) {}
	public static void registerWorkerCourse(Course<? super Worker> course) {}
	
	public static void main(String[] args) {
		Course<Person> course_P = new Course<Person>("일반인과정", 5);
		Course<Worker> course_W = new Course<Worker>("직장인과정", 5);
		Course<Student> course_S = new Course<Student>("대학생과정", 5);
		Course<HighStudent> course_H = new Course<HighStudent>("고등학생과정", 5);
		
		registerCourse(course_P);
		registerCourse(course_W);
		registerCourse(course_S);
		registerCourse(course_H);
		
		registerStudentCourse(course_S);
		registerStudentCourse(course_H);
		
		registerWorkerCourse(course_P);
		registerWorkerCourse(course_W);
	}

}