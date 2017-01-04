package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import model.Student;

@Component
public class StudentMongo {

	DBCollection myCollection; 
	
	@Autowired
	public StudentMongo(MongoDbFactory factory){
		
		DB db=factory.getDb();
		myCollection=db.getCollection("myCollection");
		
	}
	
	
	public void insert(Student student){
		
		BasicDBObject object=new BasicDBObject();
		object.put("id", student.getId());
		object.put("name", student.getName());
		myCollection.insert(object);
		
	}
	
	
	
}
