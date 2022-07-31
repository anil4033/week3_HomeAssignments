package week3.day1HomeAsignment5;

public class Automation extends MultipleLangauge {

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

	public void python() {
		System.out.println("python- override");
	}
	
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();
	}

}
