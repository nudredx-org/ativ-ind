package com.senai.infoa.trabalho_indv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.senai.infoa.trabalho_indv.Models.Usuario;

@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, Integer>{
     @Query(value="SELECT * FROM usuario WHERE email = :emailUsuario AND senha = :senhaUsuario",nativeQuery=true)
    public Usuario loginUsuario (@Param("emailUsuario") String email, @Param("senhaUsuario") String senha);
}
