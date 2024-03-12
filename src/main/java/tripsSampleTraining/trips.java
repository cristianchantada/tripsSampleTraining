package tripsSampleTraining;

import java.util.Date;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class trips {
	
	private ObjectId id;
	@BsonProperty(value = "tripduration")
	private int tripDuration;
	@BsonProperty(value="start station id")
	private int startStationId;
	@BsonProperty(value="start station name")
	private String startStationName;
	@BsonProperty(value="bikeid")
	private int bikeId;
	@BsonProperty(value="end station id")
	private int endStationId;
	@BsonProperty(value="end station name")
	private String endStationName;
	@BsonProperty(value="usertype")
	private String userType;
	@BsonProperty(value="birth year")
	private int birthYear;
	@BsonProperty(value="start station location")
	private Station StartStationLocation;
	@BsonProperty(value="end station location")
	private Station EndStationLocation;
	@BsonProperty(value="start time")
	private Date startTime;
	@BsonProperty(value="stop time")
	private Date stopTime;
	
	public trips() {}

	public ObjectId getId() {
		return id;
	}

	public int getTripDuration() {
		return tripDuration;
	}

	public int getStartStationId() {
		return startStationId;
	}

	public String getStartStationName() {
		return startStationName;
	}

	public int getBikeId() {
		return bikeId;
	}

	public int getEndStationId() {
		return endStationId;
	}

	public String getEndStationName() {
		return endStationName;
	}

	public String getUserType() {
		return userType;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public Object getStartStationLocation() {
		return StartStationLocation;
	}

	public Object getEndStationLocation() {
		return EndStationLocation;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getStopTime() {
		return stopTime;
	}

}
