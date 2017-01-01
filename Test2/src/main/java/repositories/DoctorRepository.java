package repositories;

import org.springframework.data.repository.CrudRepository;

import model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor,String>{

}
