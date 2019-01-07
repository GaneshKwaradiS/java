

class Box{
	private double width;
	private double height;
	private double breadth;
	
	//constructor with parameters
	Box(double w,double h,double b) {
		width=w;
		height=h;
		breadth=b;
	}
	
	//constructor overloading with single parameter
	//case of cube
	Box(double m){
		width=height=breadth=m;
	}	
	
	void Volume() {
		System.out.println("vol of box:"+(width*height*breadth));
	}
}


//creating a subclass of class Box
class Boxweight extends Box {
	// adding new instance or property of subclass
	double weight;
	
	//constructor ofsubclass 
	Boxweight(double w,double h,double b,double wg) {
		// TODO Auto-generated constructor stub
		//call super class constructor
		super(w,h,b);
		weight=wg;
	}
	
	//constructor of subclass with different parameterlist
	Boxweight(double m,double wg){
		super(m);
		weight=wg;
	}
	
}
public class Clsinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a subclass object
		Boxweight box1 = new Boxweight(2,3,4,5);
		box1.Volume();
		System.out.println("weight of box is:"+box1.weight);
		//creating a Box object (parent object)
		Box box2 = new Box(3);
		box2.Volume();
		
	}

}
