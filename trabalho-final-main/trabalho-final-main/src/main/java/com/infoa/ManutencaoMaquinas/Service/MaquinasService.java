package com.infoa.ManutencaoMaquinas.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoa.ManutencaoMaquinas.Models.Maquinas;
import com.infoa.ManutencaoMaquinas.Repository.MaquinasRepository;

@Service
public class MaquinasService {

    @Autowired
    private MaquinasRepository maquinasRepository;

    public List<Maquinas> findAll() {
        return maquinasRepository.findAll();
    }

    public Maquinas findById(Integer id) {
        return maquinasRepository.findById(id).get();
    }

    public Maquinas save(Maquinas maquinas) {
        return maquinasRepository.save(maquinas);
    }

    public Maquinas update(Integer id, Maquinas maquinas) {
        maquinas.setId(id);
        return maquinasRepository.save(maquinas);
    }

    public void delete(Integer id) {
        maquinasRepository.deleteById(id);
    }
}
