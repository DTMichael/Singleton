package type3;

//Double Check Single case Mode---GOOD JOB
public class SingLeton04 {

	private static SingLeton04 instance;
	private SingLeton04() {}
	public static SingLeton04 getInstance()
	{
		if(instance==null)
		{
			synchronized(SingLeton04.class)
			{
				if(instance==null)
				{
					instance=new SingLeton04();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
	}
}
