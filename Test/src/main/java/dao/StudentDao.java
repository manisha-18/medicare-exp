package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import model.Student;

@Repository
public class StudentDao {

	   static Map<Integer,Student> a=new HashMap<Integer,Student>();
	 
		static{
			a.put(1,new Student(1,"Ankit", "maths"));
			a.put(2,new Student(2,"Pari", "english"));
		}
		 
	public Collection<Student> getAllStudents()
	{
		return this.a.values();
	}
	
	
	public Student getStudentById(int id)
	{
		return  this.a.get(id);
	}
	
	public void removeStudentById(int id)
	{
		 this.a.remove(id);
	}
	public void updateStudent(Student student)
	{
		/*Student s=a.get(student.getId());
		s.setName(student.getName());
		s.setCourse(student.getCourse());
		*/
		this.a.put(student.getId(), student);
	}
	
	public void insertStudent(Student student){
		
		this.a.put(student.getId(), student);
			
	}
	
}
