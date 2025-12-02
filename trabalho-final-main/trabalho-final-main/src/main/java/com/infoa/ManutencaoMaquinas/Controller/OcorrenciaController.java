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

import com.infoa.ManutencaoMaquinas.Models.Ocorrencia;
import com.infoa.ManutencaoMaquinas.Service.OcorrenciaService;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {
    @Autowired
    private OcorrenciaService service;
    @GetMapping
    public List<Ocorrencia> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Ocorrencia BuscarPorId(@PathVariable Integer id) {
        return service.BuscarPorId(id);
    }

    @PostMapping
    public Ocorrencia save(@RequestBody Ocorrencia ocorrencia) {
        return service.save(ocorrencia);
    }

    @PutMapping("/{id}")
    public Ocorrencia update(@PathVariable Integer id, @RequestBody Ocorrencia ocorrencia) {
        return service.update(id, ocorrencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

