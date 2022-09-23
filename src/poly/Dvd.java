package poly;

public class Dvd extends Item {
	private String actor;
	private String oner;

	public Dvd() {}
	public Dvd (String num, String name, String actor, String oner) {
		super.name = name;
		super.num = num;
		this.actor = actor;
		this.oner = oner;
	
	}
	
	public void output () {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + name);
		System.out.println("저자 : " + actor);
		System.out.println("출판사 " + oner );
	}
}
