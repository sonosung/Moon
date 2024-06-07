package trashBin;

public class AuthVo 
{
	private int AUTH_NO;
	private int AUTH_ADMINPAGE;
	private int AUTH_MOVIE;
	private int AUTH_TICKET;
	private int AUTH_MOVIEHOUSE;
	private String AUTH_INFO;
	
	public AuthVo()
	{
		
	}
	
	
	
	public AuthVo(int aUTH_NO, int aUTH_ADMINPAGE, int aUTH_MOVIE, int aUTH_TICKET, int aUTH_MOVIEHOUSE,
			String aUTH_INFO) {
		super();
		AUTH_NO = aUTH_NO;
		AUTH_ADMINPAGE = aUTH_ADMINPAGE;
		AUTH_MOVIE = aUTH_MOVIE;
		AUTH_TICKET = aUTH_TICKET;
		AUTH_MOVIEHOUSE = aUTH_MOVIEHOUSE;
		AUTH_INFO = aUTH_INFO;
	}


	public int getAUTH_NO() {
		return AUTH_NO;
	}
	public void setAUTH_NO(int aUTH_NO) {
		AUTH_NO = aUTH_NO;
	}
	public int getAUTH_ADMINPAGE() {
		return AUTH_ADMINPAGE;
	}
	public void setAUTH_ADMINPAGE(int aUTH_ADMINPAGE) {
		AUTH_ADMINPAGE = aUTH_ADMINPAGE;
	}
	public int getAUTH_MOVIE() {
		return AUTH_MOVIE;
	}
	public void setAUTH_MOVIE(int aUTH_MOVIE) {
		AUTH_MOVIE = aUTH_MOVIE;
	}
	public int getAUTH_TICKET() {
		return AUTH_TICKET;
	}
	public void setAUTH_TICKET(int aUTH_TICKET) {
		AUTH_TICKET = aUTH_TICKET;
	}
	public int getAUTH_MOVIEHOUSE() {
		return AUTH_MOVIEHOUSE;
	}
	public void setAUTH_MOVIEHOUSE(int aUTH_MOVIEHOUSE) {
		AUTH_MOVIEHOUSE = aUTH_MOVIEHOUSE;
	}
	public String getAUTH_INFO() {
		return AUTH_INFO;
	}
	public void setAUTH_INFO(String aUTH_INFO) {
		AUTH_INFO = aUTH_INFO;
	}
	
	
}
