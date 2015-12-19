package sia.day1;

public class AutoBox1 {
	public static void main(String[] args) throws NumberFormatException {
		
		String s1="agcvdgfg";
		String s2="agcvdgfg";
		String s3=new String ("a");
		s3="b";
		s3="c";
		 s3=new String ("d");
		System.out.println(s3);
		//s2="a";
		System.out.println(s1==s2);
		Integer i1=new Integer (3);     
		Integer i2=new Integer (3);
		//i2=2;
		Integer i3=Integer.valueOf("a");
		System.out.println(i3);
	}

}

class EnumTest
{
	
}

