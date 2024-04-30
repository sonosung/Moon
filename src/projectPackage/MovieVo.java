package projectPackage;

public class MovieVo {
	private int movie_no;
	private String movie_name;
	private String movie_comment;
	
	
	public MovieVo() {};		
	
	public MovieVo(int movie_no, String movie_name, String movie_comment) {
		super();
		this.movie_no = movie_no;
		this.movie_name = movie_name;
		this.movie_comment = movie_comment;
	}


	public int getMovie_no() {
		return movie_no;
	}
	public void setMovie_no(int movie_no) {
		this.movie_no = movie_no;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_comment() {
		return movie_comment;
	}
	public void setMovie_comment(String movie_comment) {
		this.movie_comment = movie_comment;
	}
	
	public void RenderInfo()
	{
		System.out.println(this.movie_no);
		System.out.println(this.movie_name);
		System.out.println(this.movie_comment);
	}
	
	
}
