
public class SingLetonMain {

	public static void main(String[] args) {
		SingLeton0 SingLeton01=SingLeton0.getInstance();
		SingLeton0 SingLeton02=SingLeton0.getInstance();
		if(SingLeton01==SingLeton02)
		{
			System.out.println("����ʵ����ͬ");
		}
		
	}

}
//����ģʽ֮����ʽ
class SingLeton0{
	private SingLeton0()
	{
	}
	private final static SingLeton0 instance = new SingLeton0();
	public static SingLeton0 getInstance() {
		return instance;
	}
}
//����ģʽ֮��̬���������ʽ
class SingLeton1
{
	private static SingLeton1 instance;
	static {
		instance=new SingLeton1();//��̬������д����������󣬺Ͷ���ʽ����һ��������װ���оͳ�ʼ��ʵ����������ڴ��˷�
	}
	public static SingLeton1 getInstance()
	{
		return instance;
	}
}

