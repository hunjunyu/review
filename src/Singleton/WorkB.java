package Singleton;

public class WorkB {
	
	DBConnect con;
	public WorkB() {
		//con = new DBConnect();
		con = DBConnect.getIstance();
		
	}
	public void use() {
		System.out.println("B 작업");
	}

}
