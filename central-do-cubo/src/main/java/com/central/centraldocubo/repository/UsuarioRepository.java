package com.central.centraldocubo.repository;

import org.springframework.data.repository.CrudRepository;

import com.central.centraldocubo.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByUser(String user);
	boolean existsByUser(String user);

}
