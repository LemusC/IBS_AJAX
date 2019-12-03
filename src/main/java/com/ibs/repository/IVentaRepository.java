package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Venta;

@Repository
public interface IVentaRepository extends CrudRepository<Venta, Long>{

}
