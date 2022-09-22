package Singleton;

public class WorkA {

		DBConnect con;
		public WorkA() {
			//con = new DBConnect();
			con = DBConnect.getIstance();
		}
		public void use() {
			System.out.println("A 작업");
		}
	}
