package Singleton;

public class WorkC {
	DBConnect con;
	public WorkC() {
		//con = new DBConnect();
		con = DBConnect.getIstance();
	}
	public void use() {
		System.out.println("C 작업");
	}
}
