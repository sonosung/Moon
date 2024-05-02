package projectPackage;

import java.util.Date;

public class AnBoard {
	private String Name; 
	private int Year;
	private int RUNTIME;
	private String GENRE1;
	private int MONEY;
	private String Id;
	private String No;
	private String Comment;
	private String Theater_name;
	private int Schedule_no;
	private Date Schedule_time;
	private int Moviehouse_no;
	private int Theater_no;
	private int Movie_no;
//	"NAME","YEAR","RUNTIME","GENRE1","MONEY"
	@Override
	public String toString() {
		return "Board [Name=" + Name + ", Year=" + Year + ", RUNTIME=" + RUNTIME + ", GENRE1=" + GENRE1
				+ ", MONEY=" + MONEY + ", ID=" + Id + ", NO" + No + ", Comment" + Comment + ", Theater_name" + Theater_name + ", Schedule_time" + Schedule_time + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
		
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int Year) {
		this.Year = Year;
	}
	public int getRuntime() {
		return RUNTIME;
	}
	public void setRuntime(int RUNTIME) {
		this.RUNTIME = RUNTIME;
	}
	public String getGenre1() {
		return GENRE1;
	}
	public void setGenre1(String GENRE1) {
		this.GENRE1 = GENRE1;
	}
	public int getMoney() {
		return MONEY;
	}
	public void setMoney(int MONEY) {
		this.MONEY = MONEY;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String No) {
		this.No = No;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String Comment) {
		this.Comment = Comment;
	}
	public String getTheater_name() {
		return Theater_name;
	}
	public void setTheater_name(String Theater_name) {
		this.Theater_name = Theater_name;
	}
	public int getSchedule_no() {
		return Schedule_no;
	}
	public void setSchedule_no(int Schedule_no) {
		this.Schedule_no = Schedule_no;
	}
	public Date getSchedule_time() {
		return Schedule_time;
	}
	public void setSchedule_time(Date Schedule_time) {
		this.Schedule_time =Schedule_time ;
	}
	public int getTheater_no() {
		return Theater_no;
	}
	public void setTheater_no(int Theater_no ) {
		this.Theater_no = Theater_no;
	}
	public int getMoviehouse_no() {
		return Moviehouse_no;
	}
	public void setMoviehouse_no(int Moviehouse_no) {
		this.Moviehouse_no = Moviehouse_no;
	}
	public int getMovie_no() {
		return Movie_no;
	}
	public void setMovie_no(int Movie_no) {
		this.Movie_no = Movie_no;
	}
}


