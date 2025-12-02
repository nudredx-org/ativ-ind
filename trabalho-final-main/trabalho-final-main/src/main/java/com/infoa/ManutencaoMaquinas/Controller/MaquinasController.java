package com.infoa.ManutencaoMaquinas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infoa.ManutencaoMaquinas.Models.Maquinas;
import com.infoa.ManutencaoMaquinas.Service.MaquinasService;

@RestController
@RequestMapping("/maquinas")
public class MaquinasController {

    @Autowired
    private MaquinasService service;

    @GetMapping("/lista-todos")
    public List<Maquinas> findAll() {
        return service.findAll();
    }

    @GetMapping("/buscar/{id}")
    public Maquinas findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping("/cadastrar")
    public Maquinas save(@RequestBody Maquinas maquinas) {
        return service.save(maquinas);
    }

    @PutMapping("/atualizar/{id}")
    public Maquinas update(@PathVariable Integer id, @RequestBody Maquinas maquinas) {
        return service.update(id, maquinas);
    }

    @DeleteMapping("/deletar/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
