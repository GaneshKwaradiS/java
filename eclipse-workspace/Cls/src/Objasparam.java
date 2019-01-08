//using objects as parameter

class Test{
	int a,b;
	Test(int i,int j){
		a=i;
		b=j;
	}
	// taking object as parameter
	boolean equals(Test o) {
		if (o.a==a && o.b==b) return true;
		else return false;
		}
}

public class Objasparam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test(3,4);
		Test obj1=new Test(3,4);
		System.out.println(obj.equals(obj1));
	}

}
