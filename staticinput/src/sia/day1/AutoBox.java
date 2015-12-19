package sia.day1;

abstract class  fat{
	int y=2;
	{
		//初始化块
	}
	public static void d1()
	{
    	System.out.println("父类中的静态方法");
	}
	public fat()
	{
		System.out.println("抽象类构造器");
	}
	public abstract void ds();
}

public class AutoBox extends fat{
	/*public static void d1(int x)
	{
		x=1;
		System.out.println("zi类中的静态方法"+1);
	}*/
	public void ds()
	{
		System.out.println("zi类中对抽象方法的继承");
	}
	public static void main(String [] args)
	{
		AutoBox ab=new AutoBox();
		ab.ds();
		
		//ab.d1();
	}
}