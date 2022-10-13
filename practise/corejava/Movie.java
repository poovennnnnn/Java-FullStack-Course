
public class Movie {
	
	private String name;   
	private String actor;
	private int releaseYear;
	
	public Movie() {
		
	}
	
	
	
	public Movie(String name, String actor, int releaseYear) {
		super();
		this.name = name;
		this.actor = actor;
		this.releaseYear = releaseYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	

}
