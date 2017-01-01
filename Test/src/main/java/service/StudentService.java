package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao st;

	public Collection<Student> getAllStudents() {
		return st.getAllStudents();
	}

	public Student getStudentById(int id) {
		return this.st.getStudentById(id);
	}

	public void removeStudentById(int id) {
		this.st.removeStudentById(id);
	}

	public void updateStudent(Student student) {
		this.st.updateStudent(student);
	}

	public void insertStudent(Student student) {

		this.st.insertStudent(student);
		
	}

}
