package Studio1;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	public int getLength(){
		return this.length;
	}
	public int getWidth(){
		return this.width;
	}
	public int perimeter(){
		int perimeter= 2*this.length + 2*this.width;
		return perimeter;
	}
	public int area(){
		int area= this.length * this.width;
		return area;
	}
	public boolean isSmaller(Rectangle other){
		if (this.area()<other.area()){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isSquare(){
		if(this.length == this.width){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle my_rectangle= new Rectangle(3,7);
		System.out.println(my_rectangle.isSquare());
	}

}
