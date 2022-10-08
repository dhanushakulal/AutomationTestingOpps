package objectoriented;
class vehicle{
	void v1(){
		System.out.println("mode of transportations are: ");
	}
}
public class Override extends vehicle {
	void v1() {
   	 super.v1();
   	 System.out.println("Air,Water,Land");
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override obj= new Override();
		obj.v1();
	}

}
