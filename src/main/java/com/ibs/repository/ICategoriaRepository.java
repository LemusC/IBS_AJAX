package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Categoria;

@Repository
public interface ICategoriaRepository extends CrudRepository<Categoria, Long>{

}
