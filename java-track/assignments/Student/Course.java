package Student;

import java.util.ArrayList;

public class Course {
	private ArrayList<Student>students;
	private int credits;
	private String name;
	private int seatsRemaining;
	
	public Course(String name, int credits, int seatsRemaining){
		this.students= new ArrayList<Student>();
		this.credits=credits;
		this.seatsRemaining= seatsRemaining;
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getRemainingSeats(){
		return this.seatsRemaining;
	}
	public int getCredits(){
		return this.credits;
	}
	
	public String toString(){
		return "Name:" + this.getName() + "Credits:" + this.getCredits();
	}
	
//	public String generateRoster(){
//		for(int i=0; i<students.size(); i++){ //iterate over array list and print student objects, size method tell how big the list is
//			 
//	}
	public double averageGPA(){
		double addedGPA=0;
		for(int i= 0; i<students.size(); i++){
			addedGPA+= students.get(i).getGPA();
		}
		return addedGPA/students.size();
		
	}
	
	
	public Boolean addStudent(Student a){
		for (int i=0; i<students.size(); i++){
			if(a==students.get(i)){
				return false;
			}else{}
		}
		if(seatsRemaining>0){
			students.add(a);
			this.seatsRemaining-=1;
			return true;
		}else{
			return false;
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
