package tripsSampleTraining;
import java.util.ArrayList;
import java.util.List;

public class Station {
	
	private String type;
	private List<Double> coordinates = new ArrayList<>();
	
	public Station(){}
	
	public Station(String type, List<Double> coordinates) {
		this.type = type;
		this.coordinates = coordinates;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Double> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}


	
}
