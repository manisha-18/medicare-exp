package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

import model.Doctor;

@Component
public class DoctorDao {


DBCollection myCollection; 
	
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
	
	
}
