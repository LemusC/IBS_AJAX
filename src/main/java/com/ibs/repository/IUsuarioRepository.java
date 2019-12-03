package com.ibs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibs.model.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Long>{
	
	Usuario findByUser(String user);
}
