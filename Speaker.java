interface Speake{
	void Speak();
}
class Politician implements Speake{
	public void Speak(){
		System.out.println("Politician Speaks");
	}
}
class Priest implements Speake{
	public void Speak(){
		System.out.println("Priest Preaches");
	}
}
class Lecturer implements Speake{
	public void Speak(){
		System.out.println("Lecturer lectures");
	}
}
public class Speaker implements Speake{
	public void Speak(){
		System.out.print("We all Speak");
	}
	public static void main(String[] args){
		Politician ob2=new Politician();
		Priest ob1 = new Priest();
		Lecturer ob = new Lecturer();
		Speaker sp = new Speaker();
		ob.Speak();
		ob1.Speak();
		ob2.Speak();
		sp.Speak();
	}
}