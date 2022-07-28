package P20220727;

public class humanAPP {
	public static void main(String[] args) {
		Human hm = new StandardWeightInfo("홍길동", 167, 45);
		hm.getInformation();
		hm = new ObesityInfo("박둘이", 168, 90);
		hm.getInformation();
	}
}
