package Entities;

public class Players extends User {

	private int playerId;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String nationalId;
	
	public Players(int playerId, String firstName, String lastName, int yearOfBirth, String nationalId) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationalId = nationalId;
	}

	public Players() {
		
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	public void setId(int playerId) {
		this.playerId = playerId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public String getNationalId() {
		return nationalId;
	}
	
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
}