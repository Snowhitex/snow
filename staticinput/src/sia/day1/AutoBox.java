package sia.day1;

abstract class  fat{
	int y=2;
	{
		//��ʼ����
	}
	public static void d1()
	{
    	System.out.println("�����еľ�̬����");
	}
	public fat()
	{
		System.out.println("�����๹����");
	}
	public abstract void ds();
}

public class AutoBox extends fat{
	/*public static void d1(int x)
	{
		x=1;
		System.out.println("zi���еľ�̬����"+1);
	}*/
	public void ds()
	{
		System.out.println("zi���жԳ��󷽷��ļ̳�");
	}
	public static void main(String [] args)
	{
		AutoBox ab=new AutoBox();
		ab.ds();
		
		//ab.d1();
	}
}