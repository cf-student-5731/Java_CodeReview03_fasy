package citybike;


import java.util.ArrayList;

public class Station {
    private String location;
    private ArrayList<Integer> bikesInStation;
    private static int totalStations = 0;
    private int stationId;

    public Station(String location) {
        setLocation(location);
        createStationId();
        bikesInStation = new ArrayList<>();
    }

    public int getStationId() {
        return stationId;
    }

    private void createStationId() {
        this.stationId = ++totalStations;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addBike(int bikeId){
        if(this.bikesInStation.size() <= 5) {
            this.bikesInStation.add(bikeId);
        }
        else{
            System.out.println("This Station is already full!");
        }
    }

    public ArrayList<Integer> getBikesInStation() {
        return bikesInStation;
    }

    public void removeBike(int bikeId){ this.bikesInStation.remove(bikesInStation.indexOf(bikeId));
    }


    @Override   //to quickCheck
    public String toString() {
        return "Station{" +
                "location='" + location + '\'' +
                ", bikesInStation=" + bikesInStation +
                ", StationId=" + stationId +
                '}';
    }
}
