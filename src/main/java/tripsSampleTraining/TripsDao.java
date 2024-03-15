package tripsSampleTraining;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;



import org.bson.Document;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Filters.*;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import tripsSampleTraining.*;


import static org.bson.codecs.configuration.CodecRegistries.*;



public class TripsDao implements DaoInterface<trips> {
	
	MongoClient conn;
	MongoDatabase database;
	MongoCollection<trips> collection;
	CodecRegistry pojoCodecRegistry;
	
	public TripsDao(){
		conn = this.getConnection();
		database = conn.getDatabase("sample_training").withCodecRegistry(pojoCodecRegistry);
		collection = database.getCollection("trips", trips.class);
	}
	
	private MongoClient getConnection() {
		String url = "mongodb+srv://cristianchantada:cristian@cristian-instance.rrvjjrp.mongodb.net/?retryWrites=true&w=majority";
		pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build())); 
		MongoClient mongoClntObj = MongoClients.create(url);
		return mongoClntObj;
	}

	
	public List<trips> getByDuration(int minDuration, int maxDuration) {

		//List<trips> tripsList = collection.find(Filters.gte("tripduration", minDuration)).into(new ArrayList<trips>());
		//Bson query = Filters.and(Filters.gte("tripduration", minDuration), Filters.lte("tripduration", maxDuration));
		//tripsList = collection.find(query).into(new ArrayList<>());
		
		
		//System.out.println("ENTRA EN getByDuration() del TripsDao");
		//return tripsList;
		List<trips> duration= collection.find(Filters.gte("tripduration", minDuration)).into(new ArrayList<trips>());
		return duration;
	}
	

	@Override
	public List<trips> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public trips get(trips t) {
		trips trip = new trips();
		Bson equalComp = eq("title", t);
		trip = collection.find(equalComp).first();
		return trip;
	}
	
	public trips get(String t) {
		trips trip = new trips();
		Bson equalComp = eq("tripduration", t);
		trip = collection.find(equalComp).first();
		return trip;
	}

	@Override
	public void save(trips t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(trips t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(trips t) {
		// TODO Auto-generated method stub
		
	}


	
	
}
