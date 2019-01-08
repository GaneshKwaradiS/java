//parent dog class
class Dog
{
	void eat(){
		System.out.println("Eating...");
	}
}
 
// Subclass of dog
class BullDog extends Dog
{
	void bark(){
		System.out.println("Barking...");
	}
}

// subclass of bulldog
class MaleBullDog extends BullDog
{
	void sleep(){
		System.out.println("Sleeping...");
	}
}

//another subclass of dog
class Pug extends Dog
{
	void eat(){
                System.out.println("Not Eating...");
        }
	void bark(){
		System.out.println("Barking...");
	}
}
//another subclass of dog
class Boxer extends Dog
{
	void sleep(){
                System.out.println("Sleeping...");
        }
}


public class Multileveldog {
	
    public static void main(String[] args)
     {

	System.out.println("Single:");
	Pug dog1=new Pug();
	dog1.eat();
	
	System.out.println("Multilevel:");
	MaleBullDog dog2=new MaleBullDog();
	dog2.eat();
	dog2.bark();
	dog2.sleep();

	System.out.println("Hierarchical:");
	Boxer dog3=new Boxer();
	dog3.eat();
	dog3.sleep();


//creating instance of dog class
	Dog d=new Dog();
	d.eat();

	Dog d1=new Pug();
	d1.eat();
    //d1.bark(); Inheritance Error can't find bark()

	Pug p=new Pug();
	p.eat();
	p.bark();
	//Pug p1=new Dog();//Inheritance Error dog can't b converted into pug

	Dog d2=p;//super class variable referred by subclass
	d2.eat();
	//d2.bark();//can't find
	System.out.println("_________");
	Pug p2= (Pug) d2;
	p2.eat(); 
	p2.bark();



     }
}



	