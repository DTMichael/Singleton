package type2;

public class SingLeton03 {
	private static SingLeton03 instance;
	private SingLeton03() {}
	public static SingLeton03 getInstance()
	{
		if(instance==null)
		{
			instance=new SingLeton03();
		}
		return instance;
	}

}
