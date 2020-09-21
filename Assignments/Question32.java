//32.	Modify the above program (no. 30) to count the no of Student objects created. [ In this program static variable is required ]
class Student{
	private int rollno;
	private String sname;
	public static int count;
	public void set(){
		rollno = 1;
		sname="nidhi";
		count=count+1;
	}
	public void show(){
		System.out.println("Roll no= "+rollno);
		System.out.println("StudentName= "+sname);
		System.out.println("object created= "+Student.count);
	}
}

class Question32{
	public static void main(String args[]){
		Student s=new Student();
		s.set();
		s.show();
		
		Student s1=new Student();
		s1.set();
		s1.show();
		
		Student s3=new Student();
		s3.set();
		s3.show();
	}
	
}
