package rest.db.entity;

import org.mongodb.morphia.annotations.Entity;

import java.util.List;

@Entity("routs")
public class Route {

    private String id;
    private long fromDate;
    private long toDate;
    private String fromLocation;
    private String toLocation;
    private double freeVolume;
    private double freeWeight;
    private String trailerType;
    private String annotation;
    private List<String> addPointsList;

    public Route() {
    }

    public Route(String id, long fromDate, long toDate, String fromLocation, String toLocation, double freeVolume, double freeWeight, String trailerType, String annotation, List<String> addPointsList) {
        this.id = id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.freeVolume = freeVolume;
        this.freeWeight = freeWeight;
        this.trailerType = trailerType;
        this.annotation = annotation;
        this.addPointsList = addPointsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getFromDate() {
        return fromDate;
    }

    public void setFromDate(long fromDate) {
        this.fromDate = fromDate;
    }

    public long getToDate() {
        return toDate;
    }

    public void setToDate(long toDate) {
        this.toDate = toDate;
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

    public double getFreeVolume() {
        return freeVolume;
    }

    public void setFreeVolume(double freeVolume) {
        this.freeVolume = freeVolume;
    }

    public double getFreeWeight() {
        return freeWeight;
    }

    public void setFreeWeight(double freeWeight) {
        this.freeWeight = freeWeight;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public List<String> getAddPointsList() {
        return addPointsList;
    }

    public void setAddPointsList(List<String> addPointsList) {
        this.addPointsList = addPointsList;
    }
}
