package dao;

public class Post {
	public int userId;
	public int id;
	public String title;
	public String body;
	
	@Override
	public String toString() {
		return String.format("{\n  userId: \"%s\",\n  id: \"%s\",\n  title:\"%s\",\n  body: \"%s\"\n}", userId, id, title, body);	
	}
}
