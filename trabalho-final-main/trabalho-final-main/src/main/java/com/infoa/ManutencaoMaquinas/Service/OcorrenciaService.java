package com.infoa.ManutencaoMaquinas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.infoa.ManutencaoMaquinas.Models.Ocorrencia;
import com.infoa.ManutencaoMaquinas.Repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {

    @Autowired
    private OcorrenciaRepository ocorrenciaRepository;

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public Ocorrencia BuscarPorId(Integer id) {
        return ocorrenciaRepository.findById(id).get();
    }

    @NonNull
    public Ocorrencia save(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia update(Integer id, Ocorrencia ocorrencia) {
        ocorrencia.setId(id);
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void delete(Integer id) {
        ocorrenciaRepository.deleteById(id);
    }
}
