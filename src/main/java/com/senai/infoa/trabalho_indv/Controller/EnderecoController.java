package com.senai.infoa.trabalho_indv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.trabalho_indv.Models.Endereco;
import com.senai.infoa.trabalho_indv.Service.EnderecoService;

@RestController
@RequestMapping("/Endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestParam String cep,@RequestParam String rua, @RequestParam(required=false) String numero, @RequestParam(required=false) String complemento,@RequestParam String bairro,@RequestParam String cidade,@RequestParam String estado) {
        return enderecoService.salvar(cep, rua, numero, complemento, bairro, cidade, estado);
    }

    @GetMapping("/BuscarViaCep")
    public Endereco buscarViaCep (@RequestParam String cep) {
        return enderecoService.buscarViaCep(cep);
    }
}
