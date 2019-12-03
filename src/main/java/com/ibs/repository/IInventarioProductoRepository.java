package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Inventariosproducto;

@Repository
public interface IInventarioProductoRepository extends CrudRepository<Inventariosproducto, Long>{

}
