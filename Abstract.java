package objectoriented;
	abstract class car {
		abstract void run();
		void gear() {
			System.out.println("v1");
		}

	}
	public class Abstract extends car{
		public static void main(String[]args) {
			Abstract obj=new Abstract();
			obj.run();
			obj.gear();
		}
		void run() {
			System.out.println("v2");
		}
	}


