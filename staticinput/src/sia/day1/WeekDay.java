package sia.day1;
//ģ��ö�������Ʒ���
public  class WeekDay extends week {
	/*private WeekDay(){}//��Ƴ�˽�й��캯�����Ǹ������ⲿ�������ɶ���
	public final  static WeekDay SUN=new WeekDay();//����һ��WeekDay�ľ�̬����
	
	public String toString()
	{
		return "SUN";
	}*/
	public static void wtest1()
	{
		System.out.println("�����˳�������ľ�̬����d");
	}
	
	public static void dis1()
	{
		System.out.println("�����еľ�̬����");
	}
	public static void main(String[] args) 
	{
		WeekDay wk=new WeekDay();
		wk.dis1(); 
		wk.wtest1();//�����������˸���ľ�̬����
	}

}


abstract class week{
	//public static abstract void wtest1();
	/*{
		System.out.println("�����˳�������ľ�̬����");
	}*/
}
