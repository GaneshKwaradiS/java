//assigning object reference variables

public class Objectrefernce {
	int a;
	int b;
}
class Cal{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Objectrefernce ab = new Objectrefernce();
		
		ab.a=5;
		ab.b=6;
		System.out.println(ab.a+ab.b);
		
	    //b1 object is reffered to the b2
		Objectrefernce ba = ab;
		ba.a=6;// assigning values to instance variables byrefernce variable
		ba.b=6;
		System.out.println(ab.a+ab.b);
		System.out.println(ba.a+ba.b);
		
		ab =null; // object ab is assigned to be null butnothing happens to ba
		System.out.println(ba.a+ba.b);
		ba.a=9;
		ba.b=9;
		System.out.println(ba.a+ba.b);
		ba=null; //when ba is null ab becomes null
		//System.out.println(ab.a+ab.b);
	}

}
