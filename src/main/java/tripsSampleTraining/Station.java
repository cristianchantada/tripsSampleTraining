package tripsSampleTraining;
import java.util.ArrayList;
import java.util.List;

public class Station {
	
	private String type;
	private List<Long> coordinates = new ArrayList<>();
	
	public Station(){}
	
	public Station(String type, List<Long> coordinates) {
		this.type = type;
		this.coordinates = coordinates;
	}

	public String getType() {
		return type;
	}

	public List<Long> getCoordinates() {
		return coordinates;
	}
	
}
