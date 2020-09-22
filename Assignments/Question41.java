//41.	Write a program to demonstrate this() construct functionality.

class ThisConstruct{
	private int empId;
	private String empName;
	
	ThisConstruct(){
		this(1,"Nidhi");
		System.out.println("Default Constructor");
	}
	
	ThisConstruct(int empId,String empName){
		this.empId = empId;
		this.empName=empName;
		System.out.println(empId+" "+empName);
		System.out.println("This is Parameterized Constructor");
	}
	
}

class Question41{
	public static void main(String args[]){
		ThisConstruct t = new ThisConstruct();
	}
}