
public class SingLetonMain {

	public static void main(String[] args) {
		SingLeton0 SingLeton01=SingLeton0.getInstance();
		SingLeton0 SingLeton02=SingLeton0.getInstance();
		if(SingLeton01==SingLeton02)
		{
			System.out.println("两个实例相同");
		}
		
	}

}
//单例模式之饿汉式
class SingLeton0{
	private SingLeton0()
	{
	}
	private final static SingLeton0 instance = new SingLeton0();
	public static SingLeton0 getInstance() {
		return instance;
	}
}
//单例模式之静态代码块懒汉式
class SingLeton1
{
	private static SingLeton1 instance;
	static {
		instance=new SingLeton1();//静态代码块中创建单例对象，和饿汉式基本一样。在类装载中就初始化实例，会造成内存浪费
	}
	public static SingLeton1 getInstance()
	{
		return instance;
	}
}

