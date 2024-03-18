package tripsSampleTraining;

import java.util.Date;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class trips {
	
	private ObjectId id;
	@BsonProperty(value = "tripduration")
	private Integer tripDuration;
	@BsonProperty(value="start station id")
	private Integer startStationId;
	@BsonProperty(value="start station name")
	private String startStationName;
	@BsonProperty(value="bikeid")
	private Integer bikeId;
	@BsonProperty(value="end station id")
	private Integer endStationId;
	@BsonProperty(value="end station name")
	private String endStationName;
	@BsonProperty(value="usertype")
	private String userType;
	@BsonProperty(value="birth year")
	private Object birthYear;
	@BsonProperty(value="start station location")
	private Station startStationLocation;
	@BsonProperty(value="end station location")
	private Station endStationLocation;
	@BsonProperty(value="start time")
	private Date startTime;
	@BsonProperty(value="stop time")
	private Date stopTime;
	
	public trips() {}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Integer getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(Integer tripDuration) {
		this.tripDuration = tripDuration;
	}

	public Integer getStartStationId() {
		return startStationId;
	}

	public void setStartStationId(Integer startStationId) {
		this.startStationId = startStationId;
	}

	public String getStartStationName() {
		return startStationName;
	}

	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public Integer getBikeId() {
		return bikeId;
	}

	public void setBikeId(Integer bikeId) {
		this.bikeId = bikeId;
	}

	public Integer getEndStationId() {
		return endStationId;
	}

	public void setEndStationId(Integer endStationId) {
		this.endStationId = endStationId;
	}

	public String getEndStationName() {
		return endStationName;
	}

	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Object getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public Station getStartStationLocation() {
		return startStationLocation;
	}

	public void setStartStationLocation(Station startStationLocation) {
		this.startStationLocation = startStationLocation;
	}

	public Station getEndStationLocation() {
		return endStationLocation;
	}

	public void setEndStationLocation(Station endStationLocation) {
		this.endStationLocation = endStationLocation;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStopTime() {
		return stopTime;
	}

	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}

}
