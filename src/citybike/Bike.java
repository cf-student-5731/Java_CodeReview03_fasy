package citybike;

public class Bike {

    private String color;
    private State state;
    private static int totalBikes = 0;  //total bikes starts at 0
    private int bikeId;
    enum State{
        CanBeRented,
        CanNotBeRented,
        InService,
        Discarded,
    }

    public Bike(String color) {
        createBikeId();
        setColor(color);
        setState(State.CanBeRented);
    }

    public int getBikeId() {
        return bikeId;
    }

    public String getColor() {
        return color;
    }

    private void createBikeId(){
        this.bikeId = ++totalBikes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void printBikeProperties(){
        System.out.println();
        System.out.printf("%-10s%-20s%-10s%n", "BikeId", "BikeColor", "BikeState");
        System.out.printf("%-10d%-20s%-10s%n", this.getBikeId(), this.getColor(), this.getState());
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", state=" + state +
                ", bikeId=" + bikeId +
                '}';
    }
}
