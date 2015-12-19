package sia.day1;
//模仿枚举类的设计方法
public  class WeekDay extends week {
	/*private WeekDay(){}//设计成私有构造函数，是该类在外部不能生成对象
	public final  static WeekDay SUN=new WeekDay();//创建一个WeekDay的静态对象；
	
	public String toString()
	{
		return "SUN";
	}*/
	public static void wtest1()
	{
		System.out.println("调用了抽象类里的静态方法d");
	}
	
	public static void dis1()
	{
		System.out.println("子类中的静态方法");
	}
	public static void main(String[] args) 
	{
		WeekDay wk=new WeekDay();
		wk.dis1(); 
		wk.wtest1();//子类对象调用了父类的静态方法
	}

}


abstract class week{
	//public static abstract void wtest1();
	/*{
		System.out.println("调用了抽象类里的静态方法");
	}*/
}
