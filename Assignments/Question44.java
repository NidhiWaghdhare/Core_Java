/*44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print 
salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class
 inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula 
 (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class
 inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula
 ( workingHour * ratePerHour )
*/
import java.util.*;
class Faculty {
	private int facultyId;
	private double salary;
	
	Faculty(){
		salary=0;
	}
	
	void input(int facultyId){
		this.facultyId = facultyId;
		salary=0;
	}
	protected double getSalary(){
		return salary;
	}
	protected void setSalary(double salary){
		this.salary=salary;
	}
	void printSalary(){
		System.out.println("The Salary of FacultyId "+facultyId+" is "+salary+ "Rs.");
	}
}


class FullTimeFaculty extends Faculty{
		private double basicSalary;
		private double allowance;
		
		FullTimeFaculty(){
			super();
			basicSalary=0;
			allowance=0;
		}
		void input(int facultyId, double basicSalary,double allowance){
			input(facultyId);
			this.basicSalary=basicSalary;
			this.allowance=allowance;		
			setSalary(basicSalary + allowance);
		}
}

class PartTimeFaculty extends Faculty{
		private double workingHours;
		private double ratePerHour;
		
		PartTimeFaculty(){
			super();
			workingHours=0;
			ratePerHour=0;
		}
	
		void input(int facultyId, double workingHours ,double ratePerHour ){
			input(facultyId);
			this.workingHours=workingHours;
			this.ratePerHour=ratePerHour;		
			setSalary(workingHours * ratePerHour );
		}
	
}


class Question44{
	public static void main(String args[]){
		FullTimeFaculty f = new FullTimeFaculty();
		PartTimeFaculty p = new PartTimeFaculty();
		
		f.input(100,6000,3000);
		p.input(200,20,100);
		f.printSalary();
		p.printSalary();
	}
}