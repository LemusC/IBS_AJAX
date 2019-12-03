package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Marca;

@Repository
public interface IMarcaRepository extends CrudRepository<Marca, Long>{

}
