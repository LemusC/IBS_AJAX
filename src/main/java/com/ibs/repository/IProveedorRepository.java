package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Proveedore;

@Repository
public interface IProveedorRepository extends CrudRepository<Proveedore, Long>{

}
