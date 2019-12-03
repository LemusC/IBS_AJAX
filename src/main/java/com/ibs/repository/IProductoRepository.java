package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Producto;

@Repository
public interface IProductoRepository extends CrudRepository<Producto, Long>{

}
