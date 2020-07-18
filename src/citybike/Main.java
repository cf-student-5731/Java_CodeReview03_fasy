package citybike;

import java.util.HashMap;

public class Main {


	static HashMap<Integer, Bike> viennaBikes = new HashMap<>();
	static HashMap<Integer, Station> viennaStations = new HashMap<>();
	static HashMap<Integer, User> users = new HashMap<>();

    public static void main(String[] args) {
        String[] colors = new String[]{"red", "blue", "green", "yellow", "violet", "white", "black", "orange", "camouflage", "silver", "transparent"};
        String[] locations = new String[]{"Innere Stadt, 1010 Wien", "Leopoldstadt, 1020 Wien", "Landstraße, 1030 Wien", "Wieden, 1040 Wien", "Margareten, 1050 Wien", "Mariahilf, 1060 Wien", "Neubau1070 Wien", "Josefstadt, 1080 Wien", "Alsergrund, 1090 Wien", "Favoriten, 1100 Wien", "Simmering, 1110 Wien", "Meidling, 1120 Wien", "Hietzing, 1130 Wien", "Penzing, 1140 Wien", "Rudolfsheim-Fünfhaus, 1150 Wien", "Ottakring, 1160 Wien", "Hernals, 1170 Wien", "Währing, 1180 Wien", "Döbling, 1190 Wien", "Brigittenau, 1200 Wien", "Floridsdorf, 1210 Wien", "Donaustadt, 1220 Wien", "Liesing, 1230 Wien"};


/*		for (int i=0; i<20; i++){
			addNewBike(viennaBikes, colors);
		}
//        System.out.println(cityBikes);*/

//	manually to make Bikes exist outside the Arraylist
        Bike b01 = new Bike(generateRandomColor(colors));
		Bike b02 = new Bike(generateRandomColor(colors));
		Bike b03 = new Bike(generateRandomColor(colors));
		Bike b04 = new Bike(generateRandomColor(colors));
		Bike b05 = new Bike(generateRandomColor(colors));
		Bike b06 = new Bike(generateRandomColor(colors));
		Bike b07 = new Bike(generateRandomColor(colors));
		Bike b08 = new Bike(generateRandomColor(colors));
		Bike b09 = new Bike(generateRandomColor(colors));
		Bike b10 = new Bike(generateRandomColor(colors));
		Bike b11 = new Bike(generateRandomColor(colors));
		Bike b12 = new Bike(generateRandomColor(colors));
		Bike b13 = new Bike(generateRandomColor(colors));
		Bike b14 = new Bike(generateRandomColor(colors));
		Bike b15 = new Bike(generateRandomColor(colors));
		Bike b16 = new Bike(generateRandomColor(colors));
		Bike b17 = new Bike(generateRandomColor(colors));
		Bike b18 = new Bike(generateRandomColor(colors));
		Bike b19 = new Bike(generateRandomColor(colors));
		Bike b20 = new Bike(generateRandomColor(colors));

		viennaBikes.put(b01.getBikeId(), b01);
		viennaBikes.put(b02.getBikeId(), b02);
		viennaBikes.put(b03.getBikeId(), b03);
		viennaBikes.put(b04.getBikeId(), b04);
		viennaBikes.put(b05.getBikeId(), b05);
		viennaBikes.put(b06.getBikeId(), b06);
		viennaBikes.put(b07.getBikeId(), b07);
		viennaBikes.put(b08.getBikeId(), b08);
		viennaBikes.put(b09.getBikeId(), b19);
		viennaBikes.put(b10.getBikeId(), b10);
		viennaBikes.put(b11.getBikeId(), b11);
		viennaBikes.put(b12.getBikeId(), b12);
		viennaBikes.put(b13.getBikeId(), b13);
		viennaBikes.put(b14.getBikeId(), b14);
		viennaBikes.put(b15.getBikeId(), b15);
		viennaBikes.put(b16.getBikeId(), b16);
		viennaBikes.put(b17.getBikeId(), b17);
		viennaBikes.put(b18.getBikeId(), b18);
		viennaBikes.put(b19.getBikeId(), b19);
		viennaBikes.put(b20.getBikeId(), b20);


/*		for(String location : locations){
			addNewStation(viennaStations,location);
		}
//        System.out.println(viennaStations);*/


//	manually to make Stations exist outside the Arraylist
		Station s01 = new Station(locations[0]);
		Station s02 = new Station(locations[1]);
		Station s03 = new Station(locations[2]);
		Station s04 = new Station(locations[3]);
		Station s05 = new Station(locations[4]);
		Station s06 = new Station(locations[5]);
		Station s07 = new Station(locations[6]);
		Station s08 = new Station(locations[7]);
		Station s09 = new Station(locations[8]);
		Station s10 = new Station(locations[9]);
		Station s11 = new Station(locations[10]);
		Station s12 = new Station(locations[11]);
		Station s13 = new Station(locations[12]);
		Station s14 = new Station(locations[13]);
		Station s15 = new Station(locations[14]);
		Station s16 = new Station(locations[15]);
		Station s17 = new Station(locations[16]);
		Station s18 = new Station(locations[17]);
		Station s19 = new Station(locations[18]);
		Station s20 = new Station(locations[19]);
		Station s21 = new Station(locations[20]);
		Station s22 = new Station(locations[21]);
		Station s23 = new Station(locations[22]);

		viennaStations.put(s01.getStationId(), s01);
		viennaStations.put(s02.getStationId(), s02);
		viennaStations.put(s03.getStationId(), s03);
		viennaStations.put(s04.getStationId(), s04);
		viennaStations.put(s05.getStationId(), s05);
		viennaStations.put(s06.getStationId(), s06);
		viennaStations.put(s07.getStationId(), s07);
		viennaStations.put(s08.getStationId(), s08);
		viennaStations.put(s09.getStationId(), s09);
		viennaStations.put(s10.getStationId(), s10);
		viennaStations.put(s11.getStationId(), s11);
		viennaStations.put(s12.getStationId(), s12);
		viennaStations.put(s13.getStationId(), s13);
		viennaStations.put(s14.getStationId(), s14);
		viennaStations.put(s15.getStationId(), s15);
		viennaStations.put(s16.getStationId(), s16);
		viennaStations.put(s17.getStationId(), s17);
		viennaStations.put(s18.getStationId(), s18);
		viennaStations.put(s19.getStationId(), s19);
		viennaStations.put(s20.getStationId(), s20);
		viennaStations.put(s21.getStationId(), s21);
		viennaStations.put(s22.getStationId(), s22);
		viennaStations.put(s23.getStationId(), s23);

		s01.addBike(1);
		s01.addBike(19);
		s01.addBike(17);

		s02.addBike(5);
		s02.addBike(7);
		s02.addBike(20);
		s02.addBike(14);
		s03.addBike(4);
		s12.addBike(9);
		s12.addBike(18);



//	manually to make Stations exist outside the Arraylist
		User u01 = new User("John", "Doe");
		User u02 = new User("Jane", "Doe");
		User u03 = new User("Mr.", "Smith");
		User u04 = new User("Ms.", "Smith");
		User u05 = new User("Steven", "Burglar");
		User u06 = new User("Tina", "Thief");

		users.put(u01.getUserId(), u01);
		users.put(u02.getUserId(), u02);
		users.put(u03.getUserId(), u03);
		users.put(u04.getUserId(), u04);
		users.put(u05.getUserId(), u05);
		System.out.println(viennaStations);
		System.out.println(viennaBikes);
		System.out.println(users);

		u01.rentBike(b01);
		u01.rentBike(b07);
		u02.rentBike(b07);
		u03.rentBike(b14);
		u04.rentBike(b20);
		u01.returnBike(s05);
		u01.rentBike(b09);

		System.out.println(viennaStations);
		System.out.println(viennaBikes);
		System.out.println(users);

		u01.returnBike(s12);
		u02.returnBike(s02);
		u03.returnBike(s13);
		u05.returnBike(s16);

		System.out.println(viennaStations);
		System.out.println(viennaBikes);
		System.out.println(users);

		u01.rentBike(b01);
		u05.rentBike(b07);
		u02.rentBike(b07);
		u03.rentBike(b14);
		u04.rentBike(b20);

		u01.returnBike(s12);
		u05.returnBike(s12);
		u02.returnBike(s12);
		u03.returnBike(s12);
		u04.returnBike(s12);
		u04.rentBike(b07);


		b05.printBikeProperties();
		u04.printUserProperties();

		u04.printUserHistory();

    }   //main

    private static String generateRandomColor(String[] colors){
       return colors[(int)(Math.random() * colors.length)];
    }

    public static int bikeIsInStation(int bikeId){
    	int stationId = -1;
    		for(int s : viennaStations.keySet()){
    			if(viennaStations.get(s).getBikesInStation().contains(bikeId)){
					stationId = s;
				}
			}
    	return stationId;
	}





//auto create methods Bikes and Stations inside the HashMaps
//    private static void addNewBike(HashMap<Integer, Bike> cityBikes, String[] colors){
//        Bike tempBike = new Bike(generateRandomColor(colors));
//        cityBikes.put(tempBike.getBikeId(), tempBike);
//    }

//    private static void addNewStation(HashMap<Integer, Station> cityStations, String location){
//        Station tempStation = new Station(location);
//        cityStations.put(tempStation.getStationId(), tempStation);
//    }
    


}
