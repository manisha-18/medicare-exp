package com.gl.training.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gl.training.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
