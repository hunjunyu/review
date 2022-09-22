package Singleton;

//*** singlton 패턴
public class DBConnect {

	public DBConnect() {
		System.out.println("실제 디비 연결");

	}

	private static DBConnect con = null;

	public  static DBConnect getIstance() {
		if (con == null ) {
			con = new DBConnect();
		}
		return con;
	}
}

