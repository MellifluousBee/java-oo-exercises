package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class BrightnessFilter implements Filters{

	
	public Picture process(Picture original) {

		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	          int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	          
	          if (r<225){
	        	  int BrightRed= r + (int)(.10 *r); //increase brightness by 10%
	          }else{
	        	  int BrightRed=r;
	          }
	          if (g<225){
	        	  int BrightGreen= g + (int)(.10 * g);
	          }else{
	        	  int BrightGreen=g;
	          }
	          if (b<225){
	        	  int BrightBlue=b + (int)(.10 * b);
	          }else{
	        	  int BrightBlue=b;
	          }
	          processed.set(i, j, new Color(BrightRed, BrightGreen, BrightBlue));
	    	  
	      	}
	    }
		
		return processed;
	}
	

	

}
