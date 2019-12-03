package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Compra;

@Repository
public interface ICompraRepository extends CrudRepository<Compra, Long>{

}
