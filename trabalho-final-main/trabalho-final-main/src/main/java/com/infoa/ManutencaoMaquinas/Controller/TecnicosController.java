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

import com.infoa.ManutencaoMaquinas.Models.Tecnicos;
import com.infoa.ManutencaoMaquinas.Service.TecnicosService;

@RestController
@RequestMapping("/tecnicos")
public class TecnicosController {

    @Autowired
    private TecnicosService tecnicosService;

    @GetMapping
    public List<Tecnicos> findAll() {
        return tecnicosService.findAll();
    }

    @GetMapping("/{id}")
    public Tecnicos findById(@PathVariable Integer id) {
        return tecnicosService.findById(id);
    }

    @PostMapping
    public Tecnicos save(@RequestBody Tecnicos tecnicos) {
        return tecnicosService.save(tecnicos);
    }

    @PutMapping("/{id}")
    public Tecnicos update(@PathVariable Integer id, @RequestBody Tecnicos tecnicos) {
        return tecnicosService.update(id, tecnicos);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        tecnicosService.delete(id);
    }
}

