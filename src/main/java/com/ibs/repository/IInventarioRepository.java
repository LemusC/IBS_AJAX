package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Inventario;

@Repository
public interface IInventarioRepository extends CrudRepository<Inventario, Long>{

}
