package projectPackage;

public class Movi {
	private String movie_id;
	private String title;
	private String location;
	private int screen;
	private int ticket;
	
	public String getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;		
	}
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	@Override
	public String toString() {
		return "Movi [movie_id=" + movie_id + ", title=" + title + ", location=" + location + ", screen=" + screen
				+ ", ticket=" + ticket + "]";
	}
}