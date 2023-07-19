package com.commons;

public class complexNumber{
	
	int real, imaginary;
	
	public complexNumber(int r, int i) {
		
		this.real = r;
		this.imaginary = i;
		
	}
	public void showC()
    {
        System.out.print(this.real + "+" + this.imaginary + "i" );
    }
	public static complexNumber addcomplexNumbers(complexNumber n1, complexNumber n2) {
		
		complexNumber complx = new complexNumber(0,0);
		
		
		
		complx.real = n1.real + n2.real;
		
		complx.imaginary = n1.imaginary + n2.imaginary;
		
		
		return complx;		
		
	}
	
	public static void main(String args[]) {
		
		complexNumber c1 = new complexNumber(2,4);
		complexNumber c2 = new complexNumber(3,5);
		
		complexNumber result = addcomplexNumbers(c1, c2);
		//System.out.println(result);
		result.showC();
		
	}
	
	
}