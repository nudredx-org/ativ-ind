package com.infoa.ManutencaoMaquinas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoa.ManutencaoMaquinas.Models.Usuario;
import com.infoa.ManutencaoMaquinas.Repository.UsuarioRepository;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorid(Integer id) {
        return usuarioRepository.findById(id).get();

    }
    
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Integer id, Usuario usuario) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }
    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
