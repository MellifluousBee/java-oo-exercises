package Blogz;
import java.util.Date;

public class Post extends Entity {
	private String title;
	private String body;
	private String author;
	private final Date created;
	private Date modified;
	
	public Post(int uid,String title, String body, String author){
		super(uid);
		this.title=title;
		this.body=body;
		this.author=author;
		this.created=new Date();
		
	}
	
	public String getTitle(){
		return this.title;
	}
	public String getBody(){
		return this.body;
	}
	public String getAuthor(){
		return this.author;
	}
	
	
		
	
	
	public Date updateTime(){//call on updateTime when we modify posts
		return (this.modified=new Date());
		
	}
	
	public String toString(){
		return "Title: " + this.title + " Body: " + this.body + " Author: " + this.author + " Date created: " + this.created;
	}

	public static void main(String[] args) {
		
		
		Post One= new Post(1, "1", "First post", "Mel");
		System.out.println(One.toString());
		System.out.println(One.created);
		
		Post Two= new Post(2, "2", "Second post", "Mel");
		for (int i=0; i<600;i++){
			System.out.println(Two.created);
		}
	}

}
