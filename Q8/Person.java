package Q8;

public class Person implements DetailInfo{
	
static int maxcount;
String name;

Person(String name){
	this.name=name;
}
public void display() {
	System.out.println("Name="+name+", no. of characters present in the name="+maxcount);
}
public void count() {
	for(int i=0; i<name.length();i++) {
		maxcount++;
	}
}
}
