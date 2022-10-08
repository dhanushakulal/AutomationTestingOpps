package objectoriented;
	class Login{
		
		void login1() {
		  	  System.out.println("Login successfull");
		    }
}

public class Inheritance extends Login {
void Addben1() {
System.out.println("Add benificiaries");
login1();
}

public static void main(String[] args) {

Inheritance obj1= new Inheritance();
obj1.login1();
Inheritance obj2= new Inheritance();
obj2.Addben1();
}
}

