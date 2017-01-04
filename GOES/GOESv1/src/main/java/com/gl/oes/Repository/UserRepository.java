package com.gl.oes.Repository;


import org.springframework.data.repository.CrudRepository;

import com.gl.oes.Domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
}
