package rest.db.entity;

import org.mongodb.morphia.annotations.Entity;

@Entity("loads")
public class Load {

    private String id;
    private long dateTime;
    private String fromLocation;
    private String toLocation;
    private int fromRange;
    private int toRange;
    private int cost;
    private String cargoType;
    private double weight;
    private String trailerType;

    public Load() {
    }

    public Load(String id, long dateTime, String fromLocation, String toLocation, int fromRange, int toRange, int cost, String cargoType, double weight, String trailerType) {
        this.id = id;
        this.dateTime = dateTime;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.fromRange = fromRange;
        this.toRange = toRange;
        this.cost = cost;
        this.cargoType = cargoType;
        this.weight = weight;
        this.trailerType = trailerType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getFromRange() {
        return fromRange;
    }

    public void setFromRange(int fromRange) {
        this.fromRange = fromRange;
    }

    public int getToRange() {
        return toRange;
    }

    public void setToRange(int toRange) {
        this.toRange = toRange;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }
}
