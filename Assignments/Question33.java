//33.	Write a program to demonstrate functionalities of this keyword in java. 

class ThisFun{
	private int rollNo;
	private String studName;
	void set(int rollNo,String studName){
		this.rollNo=rollNo;
		this.studName=studName;
	}
	void show(){
		System.out.println(rollNo+" "+studName);
	}
}

class Question33{
	public static void main(String args[]){
		ThisFun t = new ThisFun();
		t.set(201,"Nidhi");
		t.show();
	}
}
