package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Comprasproducto;

@Repository
public interface ICompraProductoRepository extends CrudRepository<Comprasproducto, Long>{

}
