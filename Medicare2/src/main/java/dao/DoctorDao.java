package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import model.Doctor;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

@Component
public class DoctorDao {

MongoDbFactory factory;
DBCollection myCollection; 
DB db;
	
	@Autowired
	public DoctorDao(MongoDbFactory factory){
		
		DB db=factory.getDb();
		myCollection=db.getCollection("myCollection");
		
	}
	
	
	public void insert(Doctor doctor){
		
		BasicDBObject object=new BasicDBObject();
		object.put("id", doctor.getId());
		object.put("name", doctor.getName());
		myCollection.insert(object);
		
	}
	
	
	public JSONArray getAllDoctors(){
		
		MongoClient mongoc=new MongoClient("localhost", 27017);
		DB db=mongoc.getDB("test");
		DBCollection coll=db.getCollection("myCollection");
		
		DBCursor cursor = coll.find();
		
		JSONArray jsonarrray=new JSONArray();
		
        while (cursor.hasNext()) { 
        BasicDBObject bobj=(BasicDBObject) cursor.next();
        JSONObject jobj=new JSONObject();
           jobj.put("id",bobj.get("id"));
           jobj.put("name",bobj.get("name"));
           
           jsonarrray.add(jobj);
        }
		
		return jsonarrray;
		
	}
	
}
