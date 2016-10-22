package javagram;

import java.util.Scanner;

public class JavaGramMenu {
	//create Scanner as an instance variable
		
		private Scanner s;
		
		public JavaGramMenu(){//constructor
			s= new Scanner(System.in);//initialize the scanner constructor with a print stream that allows user to input into console
		
		}
		public int startMenu(){
			System.out.println("Filter Menu:");
			System.out.println("1. Blue Filter");
			System.out.println("2. Invert Filter");
			System.out.println("3. Brightness Filter");
			System.out.println("4. Blur Filter");
			System.out.println("5. Grayscale Filter");
			System.out.println("6. Exit");
			System.out.println("Please select an option:");
			
			int selection=s.nextInt();//uses Scanner to ask user to type in an integer value
			while(selection<1 || selection>6){//uses another sentinel to check if user is picking available options
				System.out.println("Invalid Selection");
				selection= s.nextInt();//scanner reasks user to type an Int
			}
			return selection;
		}//selection passes on to input processor
		
		public void processInput(int selection){
			if (selection==1){
				//getFilter();
				
			}
			else if (selection==2){
				//getFilter();
			}
			else if (selection==3){
				//BrightnessFilter.getFilter();
			}
			else if (selection == 4){
				//getFilter();
			}
			else if (selection == 5){
				//getFilter()
			}
			else{
				return;
			}
		}
		
		public static void main (String[]args){
			//sentinel structure
			//creates instance of Javagram Menu
			int x = 0;
			JavaGramMenu jm=new JavaGramMenu();
			x=jm.startMenu();//asks user for an option
			jm.processInput(x); //process information
		
			
		
		
		
		
		
		
	}


}
