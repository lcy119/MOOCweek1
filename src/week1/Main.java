package week1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}

class Fraction{
	
	int x;
	int y;
	
	Fraction(int x, int y)
	{
		this.x = x;
		this.y = y;		
	}
	
	double toDouble()
	{
		return x/(double)y;
	}
	
	Fraction plus(Fraction r)
	{
		int m;
		int n;
		m = this.x * r.y + r.x * this.y;
		n = this.y * r.y;
		Fraction plu = new Fraction(m,n);
		return plu;
	}
	
	Fraction multiply(Fraction r)
	{
		int m;
		int n;
		m = this.x * r.x;
		n = this.y * r.y;
		Fraction mul = new Fraction(m,n);
		return mul;
	}
	
	Fraction f(int a, int b)
	{
		int k = Math.min(a, b);
		while(x%k!=0 || y%k!=0)
		{
			k--;
		}
		Fraction q = new Fraction(a/k, b/k);
		return q;		
	}

	void print()
	{
		if(this.x == this.y)
		{
			System.out.println(1);
		}else if(this.y ==1)
		{
			System.out.println(this.x);
		}else
		{
			Fraction q = f(this.x, this.y);
			System.out.println(q.x+"/"+q.y);
		}
	}
	
}