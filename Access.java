package objectoriented;
	class animal {
		 protected void display() {
			 System.out.println("I am an animal");
		 }
	}
	   class Access extends animal{
		public static void main(String[] args) {
			Access obj=new Access();
			obj.display();

		}

	}

