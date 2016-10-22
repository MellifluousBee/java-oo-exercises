package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class Javagram {	
	Scanner s= new Scanner(System.in);//initialize the scanner constructor with a print stream that allows user to input into console
	public int startMenu(){
		System.out.println("Filter Menu:");
		System.out.println("1. Blue Filter");
		System.out.println("2. Invert Filter");
		System.out.println("3. Grayscale Filter");
		System.out.println("Please select an option:");
		
		int selection=s.nextInt();//uses Scanner to ask user to type in an integer value
		while(selection<1 || selection>3){//uses another sentinel to check if user is picking available options
			System.out.println("Invalid Selection: Please select an option");
			selection= s.nextInt();//scanner reasks user to type an Int
		}
		return selection;
	}//selection passes on to getFilter method
		
	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				//String[] relPathParts = relPath.split(File.separator);
				//imagePath= "C:\\Users\\mel\\git\\java-oo-exercises\\java-track\\images\\mentorcenter.jpg";
				//imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				imagePath= (dir + "\\" + relPath);
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
		
		Javagram jam= new Javagram();
			
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		//BlueFilter filter = getFilter();			
		Filters filter= getFilter(jam.startMenu());//passes filter selection into getFilter method
		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		File save= new File(dir  + "\\" + fileName);
		if (save.exists()){
			System.out.println("This file already exists.  Do you want to replace it? Choose 1 for yes and 2 for no");
			Scanner s= new Scanner(System.in);//initialize the scanner constructor with a print stream that allows user to input into console
			int selection=s.nextInt();//uses Scanner to ask user to type in an integer value
			while(selection<1 || selection>2){//uses another sentinel to check if user is picking available options
				System.out.println("Invalid Selection: Please select 1 for yes, 2 for no");
				selection= s.nextInt();//scanner reasks user to type an Int
			}
			if(selection==1){
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
				in.close();
			}else if(selection == 2){
				System.out.println("Image not saved");
				return;
			}
		}
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
			
		} else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	//private static BlueFilter getFilter() {
	private static Filters getFilter(int selection){	
		// TODO - create some more filters, and add logic to return the appropriate one
		if (selection==1){
			return new BlueFilter();
			
		}
		else if (selection==2){
			return new InvertFilter();
		}
		else if (selection==3){
			return new GrayscaleFilter();
		}
		else{
			throw new IllegalArgumentException();
		}
		
	}

}