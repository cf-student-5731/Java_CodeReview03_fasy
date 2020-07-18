package citybike;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {

	private String name, surName;
	private static int totalUsers = 0;  //total users starts at 0
	private int currentlyRentedBike, userId;
	private Rent rent;
	private ArrayList<Rent> rents = new ArrayList<>();


	public User(String name, String surName) {
		createUserId();
		setName(name);
		setSurName(surName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}


	public int getUserId() {
		return userId;
	}

	private void createUserId(){
		this.userId = ++totalUsers;
	}

	public void rentBike(Bike bike){
		if(Main.viennaBikes.get(bike.getBikeId()).getState() == Bike.State.CanBeRented && Main.bikeIsInStation(bike.getBikeId()) != -1 && this.currentlyRentedBike == 0) {
			this.currentlyRentedBike = bike.getBikeId();
			Main.viennaBikes.get(bike.getBikeId()).setState(Bike.State.CanNotBeRented);
			System.out.println();
			System.out.println("Bike " + bike.getBikeId() + " is rented by " + this.getName() + " " + this.getSurName() + " from Station " + Main.viennaStations.get(Main.bikeIsInStation(bike.getBikeId())).getLocation());
			System.out.println();
			Main.viennaStations.get(Main.bikeIsInStation(bike.getBikeId())).removeBike(bike.getBikeId());
			this.rent = new Rent(bike.getBikeId(), (GregorianCalendar) Calendar.getInstance());
			this.rents.add(this.rent);

		}
		else{
			System.out.println();
			System.out.println(this.getName() + " " + this.getSurName() + " Bike " + bike.getBikeId() + " cannot be rented");
			System.out.println();
		}
	}

	public void returnBike(Station station){
		if(this.currentlyRentedBike !=0) {
			Main.viennaStations.get(station.getStationId()).addBike(this.currentlyRentedBike);
			Main.viennaBikes.get(this.currentlyRentedBike).setState(Bike.State.CanBeRented);
			System.out.println();
			System.out.println("Bike " + this.currentlyRentedBike + " is returned by " + this.getName() + " " + this.getSurName() + " to Station " + station.getLocation());
			System.out.println();
			this.currentlyRentedBike = 0;
			this.rent.setRentEnd();
		}
		else{
			System.out.println();
			System.out.println(this.getName() + " " + this.getSurName() + " You do not have anything to return!");
			System.out.println();
		}

	}

	public void printUserProperties(){
		System.out.println();
		System.out.printf("%-20s%-8s%n", "Name", "currentlyRentedBike");
		System.out.printf("%-20s%-8d%n", this.getName() + " " + this.getSurName(), this.currentlyRentedBike);
	}

	public void printUserHistory() {
		System.out.println();
		SimpleDateFormat dateFormat = new SimpleDateFormat("kk:mm dd.MM.yyyy");
		System.out.printf("%-20s%-10s%-20s%-20s%n", "Name", "Bike Id", "Start", "End");
		for (Rent rent : rents) {
			System.out.printf("%-20s%-10d%-20s%-20s%n", this.getName()  + " " + this.getSurName(), rent.getBikeId(), dateFormat.format(rent.getRentStart().getTime()), dateFormat.format(rent.getRentEnd().getTime()));
		}
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", surName='" + surName + '\'' +
				", currentlyRentedBike=" + currentlyRentedBike +
				", userId=" + userId +
				", rent=" + rent +
				", rents=" + rents +
				'}';
	}
}
