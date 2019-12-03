package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{


}
