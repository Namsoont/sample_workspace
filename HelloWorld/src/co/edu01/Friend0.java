package co.edu01;

public class Friend0 {
	public static void main(String[] args) {
		
		Friend f1 = new Friend();
		f1.name = "홍길동";
//		f1.setname("홍길동");
		f1.phone = "010-1111-1111";
//		f1.setpone("010-1111-111");
		f1.email = "aaaa@nave.com";
		f1.a = 83.3;
		f1.b = 23;
		f1.ke = 172.3;
			
		f1.showInfo();
		System.out.println(f1.getname());
	}
	
}
