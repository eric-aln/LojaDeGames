package com.LojaDeGamesGeneration.gamesGen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaDeGamesGeneration.gamesGen.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	public Optional<Usuario> findByEmail(String email);
}
