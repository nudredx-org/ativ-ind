package com.senai.infoa.trabalho_indv.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.trabalho_indv.Models.Usuario;
import com.senai.infoa.trabalho_indv.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void cadastrarUsuario (Usuario usuario) {
        usuarioRepository.saveAndFlush(usuario);
    }

    public Usuario listarUsuarioPorId (Integer idUsuario) {
        return usuarioRepository.findById(idUsuario).orElseThrow(()-> new RuntimeException("Não existe esse usuario"));
    }

    public Usuario loginUsuario (String email, String senha) {
        return usuarioRepository.loginUsuario(email, senha);
    } 



}
