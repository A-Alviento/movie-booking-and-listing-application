package model;
import java.time.LocalDate;

public class Booking {
	private int[] seat = new int[2];
	private double price;
	private LocalDate date;	
	private String cinemaCode;
	private String movieTitle;
	private String transectionID = "";
	
	public Booking(int[] seat, double price, String movieTitle, String cinemaCode) {
		this.seat = seat;
		this.price = price;
		this.date = LocalDate.now();
		this.movieTitle = movieTitle;
		this.cinemaCode = cinemaCode;
		transectionID = createTransectionID();
	}
	
	private String createTransectionID() {
		return PaymentUtil.generateTID(cinemaCode);
	}
	
	public String getTransectionID() {
		return transectionID;
	}
	
	public LocalDate getBookingDate() {
		return date;
	}
	
	public void setBookingDate(LocalDate date) {
		this.date = date;
	}
	
	public int[] getSeat() {
		return seat;
	}
	
	public void setSeat(int[] seat) {
		this.seat = seat;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCinemaCode() {
		return cinemaCode;
	}
	
	public void setCinemaCode(String cinemaCode) {
		this.cinemaCode = cinemaCode;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	
}
