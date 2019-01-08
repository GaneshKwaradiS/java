class Abc{
	int a,b;
	Abc(){
		 a=8;
		 b=9;
		System.out.println("hi constructor");
	}
	int add() {
		return a+b;
	}
}
public class Constr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc abc = new Abc();
		System.out.println(abc.add());
	}

}
