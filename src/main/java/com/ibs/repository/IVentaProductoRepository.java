package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Ventasproducto;

@Repository
public interface IVentaProductoRepository extends CrudRepository<Ventasproducto, Long>{

}
