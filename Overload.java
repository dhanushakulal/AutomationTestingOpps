package objectoriented;

public class Overload {
public static void main(String[] args) {
				Overload obj=new Overload();
				obj.add(5,2);
				
			}
			void add(int x,int y)
			{
				int sum=x+y;
				System.out.println("The sum is:"+sum);
				
			}
			void add(double x,double y)
			{
				double sum=x+y;
				System.out.println("The sum is:"+sum);
				
			}
			void add(int x,int y,int z)
			{
				int sum=x+y+z;
				System.out.println("The sum is :"+sum);
				
			}

		}
