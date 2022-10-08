package objectoriented;
	class pro {
		private int x=100;
		private void method1()
		{
			System.out.println("this is private");
		}
		 void method2()
		{
			System.out.println("this is default");
		}

	}
	public class Access1 extends pro{
		public static void main(String[] args) {
			
		Access1 obj1 = new Access1();
			obj1.method2();
		}
	}
