package Q9;

public class Student {
int roll;
String name;
String course;

void input_Student(int roll, String name, String course) {
	this.roll=roll;
	this.name=name;
	this.course=course;
}
void display_Student() {
	System.out.println("Roll= "+roll+" Name= "+name+" course= "+course);
}
}
