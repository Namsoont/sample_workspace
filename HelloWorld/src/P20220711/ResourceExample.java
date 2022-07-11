package P20220711;

public class ResourceExample {
	public static void main(String[] args) {
		//bin에 sample.txt파일
		Class cls = ClassEx.class;
		
		String path = cls.getResource("sample.txt").getPath();
		
		System.out.println("경로: " + path);
	}
}
