package type2;

//懒汉式，线程不安全
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
	
	public static void main(String[] args) {
		SingLeton03 singLeton03=SingLeton03.getInstance();
		SingLeton03 singLeton032=SingLeton03.getInstance();
		System.out.println(singLeton03==singLeton032);
	}

}
