package Singleton;

public class Book {

	
	String author;
	String name;
	String company;
	
	Book(){}
	Book(String author,String name,String company){
		this.author = author;
		this.name = name;
		this.company = company;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
