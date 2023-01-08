package Lab7;

/*  @Author: LinRui
	@Time: May 15, 2022 3:40:26 AM	*/

public class Movie {
	
	//Attributes
	private String movieName;
	private int releaseYear;
	private double rating;
	private int movieID;
	private static int lastMovieID = 0;
	private final int CURRENTYEAR = 2019;

	//Default Constructor
	public Movie(){
		this.movieName = "Film";
		this.releaseYear = 2019;
		this.rating = 0.0;
		lastMovieID++;
		movieID = lastMovieID;
	}

	//General Constructor
	public Movie(String movieName, int releaseYear, double rating){
		this.movieName = movieName;
		if(releaseYear <= CURRENTYEAR){
			this.releaseYear = releaseYear;
		}
		else{
			this.releaseYear = CURRENTYEAR;
		}
		this.rating = rating;
		lastMovieID++;
		movieID = lastMovieID;
	}

	//Getter Methods
	public String getMovieName(){
		return movieName;
	}

	public int getReleaseYear(){
		return releaseYear;
	}

	public double getRating(){
		return rating;
	}

	public int getMovieID(){
		return movieID;
	}

	//Setter Methods
	public void setMovieName(String movieName){
		this.movieName = movieName;
	}

	
	
	public void setReleaseYear(int releaseYear){
		if(releaseYear <= CURRENTYEAR){
			this.releaseYear = releaseYear;
		}
		else{
			this.releaseYear = CURRENTYEAR;
		}
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	
	//Functionality
	public void printMovieDetails()
	{
		String details = "Movie Name: " + movieName;
		details += "\nRelease Year: " + releaseYear;
		details += "\nRating: " + rating;
		details += "\nMovie ID: " + movieID;		
		System.out.println(details);
	}
}
