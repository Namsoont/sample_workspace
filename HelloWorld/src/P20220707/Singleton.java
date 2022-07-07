package P20220707;
/*
 * 인스턴스를 여러개생성없이 하나만 존재.
 */


public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance()	{
		return instance;
	}
	
}
