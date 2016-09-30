package Studio1;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public int getNumerator(){
		return this.numerator;
	}
	public int getDenominator(){
		return this.denominator;
	}
	
	public int findCommonDenominator(int a, int b){//a is numerator, b is denominator
		int temp;
	    while(b != 0){
	    	temp = b;//holding variable
	        b = a % b;
	        a= temp;
	        //loops until denominator is 0, and returns the numerator from that iteration
	        }
	        return a;
	    }
	
	public Fraction addFraction(Fraction other){
		if (this.denominator == other.denominator){
			this.numerator+=other.numerator;
			return new Fraction(this.numerator, this.denominator); 
		}
		else{
			this.numerator += other.numerator;
			this.denominator= this.denominator*other.denominator;
			return new Fraction(this.numerator, this.denominator);
		}
	
		
	}
	
	public Fraction multiplyFraction(Fraction other){
		this.numerator= this.numerator * other.numerator;
		this.denominator= this.denominator * other.denominator;
		return  new Fraction(this.numerator, this.denominator);
		
	}
	public Fraction simplifyFraction(){
		int commonD= findCommonDenominator(this.numerator,this.denominator);
			this.numerator= this.numerator/commonD;
			this.denominator=this.denominator/commonD;
			return new Fraction(this.numerator,this.denominator);
		
	}
	public String toString(){
		return this.numerator + "/" + this.denominator;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction my_fraction= new Fraction(2,6);
		System.out.println(my_fraction.toString());
		System.out.println(my_fraction.simplifyFraction());
	}

}
