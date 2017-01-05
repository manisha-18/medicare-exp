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
	
	
	public String getAllDoctors(){
		
		JSONArray jsonarray=new JSONArray();
		JSONObject jsonobj=new JSONObject();
		
		/*
		myCollection=db.getCollection("myCollection");
		
		DBCursor cursor=myCollection.find();
		
		while(cursor.hasNext()){
			BasicDBObject boj=(BasicDBObject) cursor.next();
			jsonobj.put("id",boj.getString("id"));
			jsonobj.put("name",boj.getString("name"));

		}
		jsonarray.add(jsonobj);
	*/
		
		return "hello";
		
	}
	
}
