

class Circle_demo
{
	public static void main(String [] args )
	{
			
			
			
			circle c=new circle();
			System.out.println("Area =" +c.area());
			
			circle c1=new circle(10);
			System.out.println("Area =" +c1.area());
	}
}

class circle
{
	private int x,y;
	private double r;
	
	circle()
	{
		System.out.println("Circle()");
		
	}
	circle(double r)
	{
		this.r=r;
		System.out.println("Circle(double r)");
	}
	circle(int x)
	{
		this.x=x;
		System.out.println("Circle(int x)");
	}
	circle(int x,int y, double r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
		System.out.println("Circle(int x, int y, double r)");
	}
	circle(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Circle(int x, int y)");
	}
	
	public double area()
	{
		return Math.PI * r * r;
	}
	
}