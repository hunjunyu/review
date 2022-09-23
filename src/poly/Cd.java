package poly;

public class Cd extends Item {
	
	private String sing;
	
	public Cd () {}
	public Cd(String num, String name,String sing) {
		super.name = name;
		super.num = num;
		this.sing = sing;
		
	}
	public void output() {
		System.out.println("번호 : "+num);
		System.out.println("제목 : "+name);
		System.out.println("가수 : "+sing);
	}
	

}
