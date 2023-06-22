package Q9;

public class Exam extends Student {
int mark1;
int mark2;
int mark3;
void input_mark(int mark1,int mark2,int mark3) {
	this.mark1=mark1;
	this.mark2=mark2;
	this.mark3=mark3;
}
void display_Result() {
	System.out.println("Mark1= "+mark1+" Mark2= "+mark2+" Mark3= "+mark3);
}
}
