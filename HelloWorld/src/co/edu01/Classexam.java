package co.edu01;

public class Classexam {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		
		String[] names = {"홍길동", "박민수", "김익수"};
		int[] scores = { 80, 85, 79 };
		int[] ages = { 19, 20, 19 };
		
		Student s1 = new Student(); //초기화.
		s1.name = "홍길동";
		s1.age = 19;
		s1.score = 80;
		s1.height = 169.8;
		
		Student s2 = new Student();
		s2.name = "박민수";
		s2.score = 85;
		s2.age = 20;
		s2.height = 172.3;
		
		Student s3 = new Student();
		s3.name = "김익수";
		s3.score = 79;
		s3.age = 19;
		s3.height = 168.5;
		
		
		
		Student[] students = { s1, s2, s3 };
		
		for(int i=0; i <students.length; i++) {
//			System.out.println(students[i].name);
			if(students[i].name.equals("김익수")) {
//				System.out.println("나이: " + students[i].score);
			}
		}
		//
		Car c1 = new Car("그랜저", 220); //힙메모리에 인스턴스 생성 c1<- 참조변수.
		c1.model = "그랜저";
		c1.price = 20000000;
		c1.speed = 100;
		System.out.println("최고 속도 : " + c1.maxspeed);
		c1.setSpeed(80);
		c1.start();
		c1.run();
		c1.showSpeed();
		c1.stop();
		
		Car c2 = new Car("k8", 210); //힙메모리에 인스턴스 생성 c1<- 참조변수.
		c2.model = "k8";
		c2.price = 26000000;
		c2.speed = 200;
		System.out.println("최고 속도 : " + c2.maxspeed);
		c2.setSpeed(180);
		c2.start();
		c2.run();
		c2.showSpeed();
		c2.stop();
////		System.out.println(c1);
		
		
	}
}
