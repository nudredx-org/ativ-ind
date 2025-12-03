package com.senai.infoa.trabalho_indv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.trabalho_indv.Models.Usuario;
import com.senai.infoa.trabalho_indv.Service.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/Cadastrar")
    public ResponseEntity<String> cadastrarUsuario (@RequestBody Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
        return ResponseEntity.ok("Cadastrado com Sucesso");
    }

    @PostMapping("/Login")
    public Usuario loginUsuario(@RequestParam String emamil, @RequestParam String senha) {
        return usuarioService.loginUsuario(emamil, senha);
    }

    @GetMapping("/ListarPorId")
    public Usuario listarUsuario(@RequestParam Integer idUsuario) {
        return usuarioService.listarUsuarioPorId(idUsuario);
    }
}
