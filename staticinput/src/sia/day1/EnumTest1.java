package sia.day1;

/*interface operatorEval{
	void eval();
}*/

public enum EnumTest1 /*implements operatorEval*/{
	PLUS{
		public int eval(int x,int y)
		{
			return x+y;
		}
	}

}
