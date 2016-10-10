package Student;

public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private int credits;
	private double GPA;

	
	public Student(String firstName, String lastName, int studentID){
		this.firstName=firstName;
		this.lastName=lastName;
		this.studentID=studentID;
		
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getName(){
		String name= this.firstName + " " + this.lastName;
		return name;
	
	}
	public int getStudentID(){
		return this.studentID;
	}
	public int getCredits(){
		return this.credits;
	}
	public double getGPA(){
		return this.GPA;
	}

	
	public int setCredits(int x){//allows user to change number of credits
		this.credits+= x;
		return this.credits;
	}
	
		
	

	public String toString(){
		return "Name: " + this.getName() + "  Student ID: " + this.getStudentID() + "  Credits: " + this.getCredits() + " GPA: " + this.getGPA();
	}
	
	public String getClassStanding(){
		if (getCredits()<30){
			return "Freshman";
		}else if (getCredits()>=30 && getCredits()<60){
			return "Sophomore";
		}else if(getCredits()>=60 && getCredits()<90){
			return "Junior";
		}else{
			return "Senior";
		}
	}

	
	public void submitGrade(double grade, int numcredits){
		double qualityscore= (double)numcredits * grade;
		double numerator=this.GPA * this.getCredits()+ qualityscore;
        this.setCredits(numcredits);
        this.GPA= Math.round((numerator/this.getCredits())*1000)/1000.0;
        
        
		
	}
	
	
	public double computeTuition(){
		
		int semesters= getCredits()/15;
		double costPerSemester= 20000.0;
		double costPerCredit= 1333.33;
		int leftovers= getCredits()%15;
		double extra_tuition= costPerCredit*leftovers;
		double tuition_paid= (semesters*costPerSemester) + extra_tuition;
	//	double tuition_paid =Math.round(((semesters * costPerSemester)+ extra_tuition)*100.0)/100.0;
		System.out.println("tuition_paid:" + tuition_paid);
		return tuition_paid;
	}
	
		
	
	public Student createLegacy(Student wife, Student spouse){
		Student n= new Student(wife.getName(), spouse.getName(),(wife.getStudentID()+spouse.getStudentID()));
		n.GPA= (wife.getGPA() + spouse.getGPA())/2.0;
		if(wife.getCredits()>spouse.getCredits()){
			n.credits=wife.getCredits();			
		}else{
			n.credits=spouse.getCredits();
		}
		return n;
		
	}
	
		
	
	
	public static void main(String[] args) {
		Student s= new Student("Mel", "Brockley", 123);
		s.submitGrade(0, 1);
		Student ss=new Student("Honna", "Veerkamp", 001);
		ss.submitGrade(1.0006, 2);
		
		System.out.println(s.computeTuition());
		
	
	
		
		
		
		
				
		

	}

}
